create database escola;

use escola;

create table alunos (
	id bigint auto_increment,
    nome varchar(255) not null,
    idade int not null,
    turma int not null,
    nota float not null,
    primary key(id)
);

select * from alunos;

insert into alunos (nome, idade, turma, nota) values ("Tati", 30, 16, 10);
insert into alunos (nome, idade, turma, nota) values ("Jessica", 27, 16, 8);
insert into alunos (nome, idade, turma, nota) values ("Carol", 19, 16, 10);
insert into alunos (nome, idade, turma, nota) values ("Denise", 30, 16, 8);
insert into alunos (nome, idade, turma, nota) values ("Maria", 26, 16, 10);
insert into alunos (nome, idade, turma, nota) values ("Paola", 19, 16, 9);
insert into alunos (nome, idade, turma, nota) values ("Andressa", 19, 16, 10);
insert into alunos (nome, idade, turma, nota) values ("Debora", 27, 16, 9);
insert into alunos (nome, idade, turma, nota) values ("Jean", 27, 16, 6);

select * from alunos where nota > 7;
select * from alunos where nota < 7;

update alunos set nota = 9.5 where id = 7;