package aula24.nakedbank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

import aula24.nakedbank.dtos.AberturaDeContaDto;
import aula24.nakedbank.models.Cliente;
import aula24.nakedbank.models.Conta;

public class ContaDao extends AbstractDao<String>
		implements IDaoCreate<Conta, AberturaDeContaDto>, IDaoRead<Conta, String> {

	private ClienteDao clienteDao;

	public ContaDao(Connection conn) {
		super(conn);
		this.clienteDao = new ClienteDao(conn);
	}

	@Override
	public Conta save(AberturaDeContaDto dto) throws Exception {
		String query = "insert into contas.tb_conta (numero, saldo, chequeespecial, status, dataabertura, codigocliente) values (?, ?, ?, ?, ?, ?);";

		java.sql.Date dataAtual = java.sql.Date.valueOf(LocalDate.now());

		int i = 1;
		PreparedStatement insertConta = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
		insertConta.setString(i++, dto.getNumeroConta());
		insertConta.setFloat(i++, 0);
		insertConta.setFloat(i++, 0);
		insertConta.setBoolean(i++, true);
		insertConta.setDate(i++, dataAtual);
		insertConta.setInt(i++, dto.getCodigoCliente());

		this.saveSQL(insertConta, "numero");

		return this.get(dto.getNumeroConta());
	}

	@Override
	public Conta get(String numero) throws Exception {
		String query = "select * from contas.tb_conta where numero = ?";

		PreparedStatement selectConta = conn.prepareStatement(query);
		selectConta.setString(1, numero);

		ResultSet rs = this.getSQL(selectConta);

		Integer codigoCliente = rs.getInt("codigocliente");

		Cliente cliente = this.clienteDao.get(codigoCliente);

		Conta conta = new Conta(cliente);

		conta.setNumero(rs.getString("numero"));
		conta.setSaldo(rs.getFloat("saldo"));
		conta.setChequeEspecial(rs.getFloat("chequeespecial"));
		conta.setStatus(rs.getBoolean("status"));
		conta.setDataAbertura(rs.getDate("dataabertura"));
		conta.setDataEncerramento(rs.getDate("dataencerramento"));

		rs.close();
		selectConta.close();

		return conta;
	}

	public void encerraConta(String numeroConta, java.sql.Date dataEncerramento) throws Exception {
		String query = "update contas.tb_conta set status = ?, dataencerramento = ? where numero = ?;";

		java.sql.Date dataAtual = java.sql.Date.valueOf(LocalDate.now());

		int i = 1;

		PreparedStatement updateConta = conn.prepareStatement(query);
		updateConta.setBoolean(i++, false);
		updateConta.setDate(i++, dataAtual);
		updateConta.setString(i++, numeroConta);

		this.updateSQL(updateConta);

	}

	public void alterarChequeEspecial(String numeroConta, Float novoChequeEspecial) throws Exception {
		String query = "update contas.tb_conta set chequeespecial = ? where numero = ?;";

		int i = 1;

		PreparedStatement updateConta = conn.prepareStatement(query);
		updateConta.setFloat(i++, novoChequeEspecial);
		updateConta.setString(i++, numeroConta);

		this.updateSQL(updateConta);

	}

	public void alterarSaldo(String numeroConta, Float valorTransacao) throws Exception {
		String query = "update contas.tb_conta set saldo = saldo + ? where numero = ?;";

		int i = 1;

		PreparedStatement updateConta = conn.prepareStatement(query);
		updateConta.setFloat(i++, valorTransacao);
		updateConta.setString(i++, numeroConta);

		this.updateSQL(updateConta);

	}

}
