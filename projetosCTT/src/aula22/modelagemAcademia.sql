create table tb_contato(
	codigo_contato serial primary key,
	telefone varchar(30),
	email varchar(254)
);


alter table tb_contato add constraint tb_contato_email_un unique(email);
alter table tb_contato add constraint tb_contato_telefone_un unique(telefone);


create table tb_academia(
	codigo_academia serial primary key,
	razao_social varchar,
	nome_fantasia varchar,
	cnpj varchar(14),
	nome_responsavel varchar
);

alter table tb_academia 
	add column codigo_localizacao integer,
	add constraint tb_academia_codigo_localizacao_fk
	foreign key (codigo_localizacao)
	references tb_localizacao (codigo_localizacao);

alter table tb_academia alter column razao_social set not null;
alter table tb_academia alter column nome_fantasia set not null;
alter table tb_academia alter column cnpj set not null;


alter table tb_academia add constraint tb_academia_cnpj_un unique(cnpj);

create table tb_aluno(
	codigo_aluno serial primary key,
	nome varchar,
	data_nascimento date,
	peso float,
	genero varchar,
	altura float,
	nome_social varchar
);

alter table tb_aluno
	add column codigo_localizacao integer,
	add constraint tb_aluno_codigo_localizacao_fk
	foreign key (codigo_localizacao)
	references tb_localizacao (codigo_localizacao);


alter table tb_aluno alter column nome set not null;
alter table tb_aluno alter column data_nascimento set not null;


create table tb_personal (
	cref varchar(30) primary key,
	cpf varchar(11),
	nome varchar,
	inicio_atuacao date
);

alter table tb_personal
	add column codigo_localizacao integer,
	add constraint tb_personal_codigo_localizacao_fk
	foreign key (codigo_localizacao)
	references tb_localizacao (codigo_localizacao);



alter table tb_personal add constraint tb_personal_cpf_un unique(cpf);
alter table tb_personal alter column nome set not null;
alter table tb_personal alter column cpf set not null;
alter table tb_personal alter column inicio_atuacao set not null;

create table tb_localizacao (
	codigo_localizacao serial primary key,
	cep varchar(8),
	logradouro varchar(20),
	nome_logradouro varchar,
	complemento varchar(100),
	numero varchar(10),
	bairro varchar,
	cidade varchar,
	estado varchar,
	uf varchar(2)
);


alter table tb_localizacao alter column cep set not null;
alter table tb_localizacao alter column logradouro set not null;
alter table tb_localizacao alter column nome_logradouro set not null;
alter table tb_localizacao alter column numero set not null;
alter table tb_localizacao alter column bairro set not null;
alter table tb_localizacao alter column cidade set not null;
alter table tb_localizacao alter column estado set not null;
alter table tb_localizacao alter column uf set not null;



create table tb_profissional_habilitado(
	codigo_academia integer,
	cref varchar(30),
	primary key(codigo_academia, cref),
	constraint tb_profissional_habilitado_codigo_academia_fk foreign key (codigo_academia) references tb_academia (codigo_academia),
    constraint tb_profissional_habilitado_cref_fk foreign key (cref) references  tb_personal (cref)
);


create table tb_matricula(
	codigo_academia integer,
	codigo_aluno integer,
	primary key(codigo_academia, codigo_aluno),
	constraint tb_matricula_codigo_academia_fk foreign key (codigo_academia) references tb_academia (codigo_academia),
    constraint tb_matricula_codigo_aluno_fk foreign key (codigo_aluno) references  tb_aluno (codigo_aluno)
);


create table tb_contato_aluno(
	codigo_contato integer,
	codigo_aluno integer,
	primary key(codigo_contato),
	constraint tb_contato_aluno_fk foreign key (codigo_contato) references tb_contato (codigo_contato),
    constraint tb_codigo_aluno_fk foreign key (codigo_aluno) references tb_aluno (codigo_aluno)	
);



create table aluno_vs_personal(
	codigo_aluno integer,
	cref varchar(30),
	primary key(codigo_aluno, cref),
	constraint tb_aluno_vs_personal_codigo_aluno_fk foreign key (codigo_aluno) references tb_aluno (codigo_aluno),
    constraint tb_alunos_vs_personal_cref_fk foreign key (cref) references tb_personal (cref)
);


create table tb_contato_do_personal(
	codigo_contato integer,
	cref varchar(30),
	primary key(codigo_contato),
	constraint tb_contato_do_personal_codigo_contato_fk foreign key (codigo_contato) references tb_contato (codigo_contato),
    constraint tb_contato_do_personal_cref_fk foreign key (cref) references tb_personal (cref)
);

create table tb_contato_da_academia(
	codigo_contato integer,
	codigo_academia integer,
	primary key(codigo_contato),
	constraint tb_contato_da_academia_codigo_contato_fk foreign key (codigo_contato) references tb_contato (codigo_contato),
    constraint tb_contato_da_academia_codigo_academia_fk foreign key (codigo_academia) references tb_academia (codigo_academia)
);


insert into aluno_vs_personal values (
 1, '1258/SP'
);

insert into tb_aluno (nome, data_nascimento, peso, genero, altura) values(
	'José da Silva Júnior', '1978-12-07', 63, 'Masculino', 1.81);

insert into tb_personal (cref, cpf, nome, inicio_atuacao) values(
	'1258/SP', '99999999921', 'Francisco Araújo', '1988-12-01');


select *
from aluno_vs_personal