create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria (
id bigint auto_increment,
tipodeborda varchar(255) not null,
grossura varchar(255) not null,
tipodepizza varchar(255) not null,
primary key(id)

);


create table tb_pizza (
id bigint auto_increment,
tipo varchar(255) not null,
preco float not null,
tamanho varchar(255) not null,
categoria_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)

);


INSERT INTO tb_categoria (tipo, preco,tamanho,categoria_id) VALUES ("Com catupiry", "alta", "Salgada");
INSERT INTO tb_categoria (tipodeborda, grossura,tipodepizza) VALUES ("Com queijo", "alta", "Salgada");
INSERT INTO tb_categoria (tipodeborda, grossura,tipodepizza) VALUES ("Sem borda", "fina", "Salgada");
INSERT INTO tb_categoria (tipodeborda, grossura,tipodepizza) VALUES ("Com brigadeiro", "alta", "Doce");
INSERT INTO tb_categoria (tipodeborda, grossura,tipodepizza) VALUES ("Sem borda", "fina", "Doce");

SELECT * from tb_categoria;



INSERT INTO tb_pizza (tipo, preco,tamanho,categoria_id) VALUES ("Mussarela", 50, "Grande",3);
INSERT INTO tb_pizza (tipo, preco,tamanho,categoria_id) VALUES ("Calabresa", 20, "Grande",3);
INSERT INTO tb_pizza (tipo, preco,tamanho,categoria_id) VALUES ("Frango", 70, "Grande",1);
INSERT INTO tb_pizza (tipo, preco,tamanho,categoria_id) VALUES ("Baconeovos", 50, "Grande",2);
INSERT INTO tb_pizza (tipo, preco,tamanho,categoria_id) VALUES ("Escarolacomqueijo", 80, "Media",3);
INSERT INTO tb_pizza (tipo, preco,tamanho,categoria_id) VALUES ("Bananacomchocolate", 50, "Pequena",4);
INSERT INTO tb_pizza (tipo, preco,tamanho,categoria_id) VALUES ("BrigairoM&MS", 60, "Grande",5);
INSERT INTO tb_pizza (tipo, preco,tamanho,categoria_id) VALUES ("ChocolateBranco", 10, "Pequena",5);
INSERT INTO tb_pizza (tipo, preco,tamanho,categoria_id) VALUES ("Atum", 100, "Grande",1);


SELECT * from tb_pizza;

SELECT * from tb_pizza where preco > 45;

SELECT * FROM tb_pizza WHERE preco between 29 AND 60;

SELECT * FROM tb_pizza WHERE tipo LIKE "%c%";

SELECT * FROM tb_pizza INNER JOIN tb_categoria ON tb_pizza.categoria_id = tb_categoria.id;

SELECT tb_pizza.tipo, tb_pizza.preco, tb_categoria.tipodepizza FROM tb_pizza INNER JOIN tb_categoria ON tb_pizza.categoria_id = tb_categoria.id WHERE tb_categoria.tipodepizza = "Salgada";
