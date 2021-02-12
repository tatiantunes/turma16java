create database db_funcionarios;

use db_funcionarios;

create table tb_funcionarios(
	id bigint auto_increment,
    nome varchar(255) not null,
    idade int not null,
    salario float not null,
    funcao varchar(255) not null,
    primary key(id)
);

select * from  tb_funcionarios;

insert into  tb_funcionarios (nome, idade, salario,funcao) values ("Tati", 30, 5000,"CEO");
insert into  tb_funcionarios (nome, idade, salario,funcao) values ("Jessica", 27, 1500,"CEO2");
insert into  tb_funcionarios (nome, idade, salario,funcao) values ("Maria", 25, 2000,"CEO3");
insert into  tb_funcionarios (nome, idade, salario,funcao) values ("Denise", 19, 5000,"CEO4");
insert into  tb_funcionarios (nome, idade, salario,funcao) values ("Carol", 21, 600, "CEO5");

select * from  tb_funcionarios where salario > 2000;
select * from  tb_funcionarios where salario < 2000;

update  tb_funcionarios set nome = "Amor", salario = 2051 where id = 3;