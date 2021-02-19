package aula24.nakedbank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

import aula24.nakedbank.dtos.TransacaoDto;
import aula24.nakedbank.models.Conta;
import aula24.nakedbank.models.Transacao;

public class TransacaoDao extends AbstractDao<Integer>
		implements IDaoCreate<Transacao, TransacaoDto>, IDaoRead<Transacao, Integer> {

	private ContaDao contaDao;

	public TransacaoDao(Connection conn) {
		super(conn);
		this.contaDao = new ContaDao(conn);
	}

	@Override
	public Transacao save(TransacaoDto dto) throws Exception {
		String query = "insert into contas.tb_transacao (datatransacao, valor, tipo, numeroconta) values (?, ?, ?, ?);";

		int i = 1;

		java.sql.Date dataAtual = java.sql.Date.valueOf(LocalDate.now());

		PreparedStatement insertTransacao = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
		insertTransacao.setDate(i++, dataAtual);
		insertTransacao.setFloat(i++, dto.getValor());
		insertTransacao.setString(i++, dto.getTipo());
		insertTransacao.setString(i++, dto.getNumeroDaConta());

		int numeroIdentificacao = this.saveSQL(insertTransacao, "numeroidentificacao");

		return this.get(numeroIdentificacao);
	}

	@Override
	public Transacao get(Integer numeroIdentificacao) throws Exception {
		String query = "select * from contas.tb_transacao where numeroidentificacao = ?";

		PreparedStatement selectTransacao = conn.prepareStatement(query);
		selectTransacao.setInt(1, numeroIdentificacao);

		ResultSet rs = this.getSQL(selectTransacao);

		String numeroConta = rs.getString("numeroconta");

		Conta conta = this.contaDao.get(numeroConta);

		Transacao transacao = new Transacao(conta);

		transacao.setNumeroIdentificacao(rs.getInt("numeroidentificacao"));
		transacao.setDataTransacao(rs.getDate("datatransacao"));
		transacao.setValor(rs.getFloat("valor"));
		transacao.setTipo(rs.getString("tipo"));

		rs.close();
		selectTransacao.close();

		return transacao;

	}

}
