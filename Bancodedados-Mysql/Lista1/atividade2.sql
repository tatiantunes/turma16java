create database ecommerce;

use ecommerce;

create table produtos(
	id bigint auto_increment,
    descricao varchar(255) not null,
    estoque int not null,
    preco float not null,
    peso float not null,
    primary key(id)
);

select * from produtos;

insert into produtos (descricao, estoque, preco, peso) values ("Tenis", 10, 600, 1.0);
insert into produtos (descricao, estoque, preco, peso) values ("Touca", 10, 300, 1.2);
insert into produtos (descricao, estoque, preco, peso) values ("Bota", 10, 150, 1.2);
insert into produtos (descricao, estoque, preco, peso) values ("Meia", 10, 870, 2.2);
insert into produtos (descricao, estoque, preco, peso) values ("Cachecol", 10, 10000, 4.2);
insert into produtos (descricao, estoque, preco, peso) values ("Short", 10, 650, 7.2);
insert into produtos (descricao, estoque, preco, peso) values ("Camisa", 10, 90, 3.2);
insert into produtos (descricao, estoque, preco, peso) values ("vestido", 10, 8000, 2.2);

select * from produtos where preco > 500;
select * from produtos where preco < 500;

update produtos set descricao = "Chapeu", preco = 250 where id = 3;