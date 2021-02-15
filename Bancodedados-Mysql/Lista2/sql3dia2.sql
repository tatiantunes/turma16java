create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria (
id bigint auto_increment,
regraproduto varchar(255) not null,
tipodearea varchar(255) not null,
primary key(id)

);

create table tb_produto(
id bigint auto_increment,
tipodeproduto varchar(255) not null,
preco float not null,
categoria_id BIGINT NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)

);

INSERT INTO tb_categoria (regraproduto, tipodearea) VALUES ("Tarja amarela", "Cosmeticos");
INSERT INTO tb_categoria (regraproduto, tipodearea) VALUES ("Tarja preta", "Remedios Controlados");
INSERT INTO tb_categoria (regraproduto, tipodearea) VALUES ("Tarja vermelha", "Remedios para gripe");
SELECT * from tb_categoria;

INSERT INTO tb_produto(tipodeproduto,preco,categoria_id) VALUES ("Absorvente",8,1);
INSERT INTO tb_produto(tipodeproduto,preco,categoria_id) VALUES ("Hidratantecorporal",98,1);
INSERT INTO tb_produto(tipodeproduto,preco,categoria_id) VALUES ("Oleogirassol",90,1);
INSERT INTO tb_produto(tipodeproduto,preco,categoria_id) VALUES ("Shampoo",40,1);
INSERT INTO tb_produto(tipodeproduto,preco,categoria_id) VALUES ("Lenco Umedecido",43,1);
INSERT INTO tb_produto(tipodeproduto,preco,categoria_id) VALUES ("Gripezol",56,3);
INSERT INTO tb_produto(tipodeproduto,preco,categoria_id) VALUES ("Gripetite",12,3);
INSERT INTO tb_produto(tipodeproduto,preco,categoria_id) VALUES ("Paracetamol",87,2);
INSERT INTO tb_produto(tipodeproduto,preco,categoria_id) VALUES ("CloridratodeFluoxetina",59,2);

SELECT * from tb_produto;


SELECT * from tb_produto where preco > 50;

SELECT * FROM tb_produto WHERE tipodeproduto LIKE "%B%";
SELECT tb_produto.tipodeproduto, tb_produto.preco, tb_categoria.tipodearea
FROM tb_produto INNER JOIN tb_categoria ON tb_produto.categoria_id = tb_categoria.id;

SELECT tb_produto.tipodeproduto, tb_produto.preco, tb_categoria.regraproduto
FROM tb_produto INNER JOIN tb_categoria ON tb_produto.categoria_id = tb_categoria.id WHERE tb_categoria.tipodearea = "Remedios Controlados";