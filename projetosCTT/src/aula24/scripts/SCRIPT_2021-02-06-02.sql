insert into tb_cliente (
	nome,
	cpf,
	rg,
	renda,
	telefone,
	email
) values (
	'Anderson Rocha',
	'11111111122',
	'445566789',
	3000.00,
	'019999887744',
	'anderson-rocha@outlook.com'
);
select * from tb_transacao tt;

insert into tb_conta (
	numero,
	codigocliente
) values (
	'1001',
	1
);

insert into tb_transacao (
	valor,
	tipo,
	numeroconta 
) values (
	100.00,
	'SAQUE',
	'1001'
);

select * from tb_transacao;
select
	*
from
	tb_transacao
where
	data_transacao between '2021-02-01 00:00:00' and '2021-02-28 23:59:59';
insert into tb_cliente (
	nome,
	cpf,
	rg,
	renda,
	telefone,
	email
) values (
	'Laiane',
	'11111111133',
	'445566123',
	10000.00,
	'01977778888',
	'laiane@outlook.com'
);
select * from tb_cliente;

insert into tb_conta (
	numero,
	codigocliente
) values (
	'1001',
	2
);

select * from tb_conta;
select
	codigocliente,
	saldo
from
	tb_conta
order by
	saldo desc
limit 1;
-- Maior saldo
select
	codigo_cliente,
	saldo
from
	tb_conta
where
	saldo < 0
order by
	saldo asc
limit 1;
-- Cliente com mair divida
select
	numero_conta,
	count(*) as total_transacoes
from
	tb_transacao tt
group by
	numero_conta
order by
	total_transacoes desc
limit 1;