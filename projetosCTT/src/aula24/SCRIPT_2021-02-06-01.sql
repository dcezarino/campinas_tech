--create schema if not exists contas;

create table tb_cliente ( 
	codigo serial primary key,
	nome varchar(50) not null,
	cpf varchar(11) unique not null,
	rg varchar(10) not null,
	renda float not null,
	telefone varchar(12) not null,
	email varchar unique not null 
);


create table tb_conta(
	numero varchar(6) primary key,
	saldo float not null default 0.0,
	chequeEspecial float not null default 0.0,
	status boolean not null default true,  
	dataAbertura date not null default current_date,
	dataEncerramento date,
	codigoCliente int not null,
	constraint tb_conta_codigoCliente_fk foreign key (codigoCliente) references tb_cliente (codigo)	
); 

--drop table tb_conta;

create table tb_transacao(
	numeroIdentificacao serial primary key,
	dataTransacao timestamp not null default current_timestamp,
	valor float not null,
	tipo varchar not null,
	numeroConta varchar(6) not null,
	constraint tb_transacao_numeroConta_fk foreign key (numeroConta) references tb_conta (numero)
);


--Transferência entre contas, que não é nada mais do que movimentar o dinheiro de uma conta pra outra. O tipo pode ser TRANSFERENCIA.
update tb_conta 
set saldo = saldo - 10
where numero  = '1001'; 

update tb_conta 
set saldo = saldo + 10 
where numero  = '1000';

select * from tb_conta tc ;

--Extrato que mostre somente as entradas de um determinado período
select *
from tb_transacao  
where datatransacao between '2021-01-01 00:00:00' and '2020-01-31 23:59:59'
and valor > 0
order by datatransacao;


--Extrato que mostre somente as saídas de um determinado período
select *
from tb_transacao  
where datatransacao between '2021-01-01 00:00:00' and '2020-01-31 23:59:59'
and valor < 0
order by datatransacao;


select *
from  tb_transacao tt;
















