create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe (
	id bigint auto_increment,
    tipo varchar(255) not null,
    geracao int not null,
    ataque_range varchar(255) not null,
    primary key(id)
	
);

create table tb_personagem
(
	id bigint auto_increment,
    nome varchar(255) not null,
    poderataque int not null,
    poderdefesa int not null,
    vida int not null,
    velocidade float not null,
    classe_id BIGINT NOT NULL,
    primary key(id),
    FOREIGN KEY (classe_id) REFERENCES tb_classe(id)
);

INSERT INTO tb_classe ( tipo, geracao,ataque_range) VALUES ("Mago", 1, "longe");
INSERT INTO tb_classe ( tipo, geracao,ataque_range) VALUES ("Guerreiro", 2, "perto");
INSERT INTO tb_classe ( tipo, geracao,ataque_range) VALUES ("Atirador", 1, "Medio");
INSERT INTO tb_classe ( tipo, geracao,ataque_range) VALUES ("Medico", 2, "Medio");
INSERT INTO tb_classe ( tipo, geracao,ataque_range) VALUES ("Ninja", 3, "Medio");

INSERT INTO tb_personagem(nome, poderataque, poderdefesa, vida, velocidade, classe_id) VALUES ("Tatiane", 1500, 2200, 3000, 100, 5);
INSERT INTO tb_personagem(nome, poderataque, poderdefesa, vida, velocidade, classe_id) VALUES ("Jessica", 700, 3200, 3400, 150, 4);
INSERT INTO tb_personagem(nome, poderataque, poderdefesa, vida, velocidade, classe_id) VALUES ("Denise", 2700, 2200, 2800, 70, 2);
INSERT INTO tb_personagem(nome, poderataque, poderdefesa, vida, velocidade, classe_id) VALUES ("Maria", 1700, 2400, 3000, 70, 1);
INSERT INTO tb_personagem(nome, poderataque, poderdefesa, vida, velocidade, classe_id) VALUES ("Paola", 2700, 2800, 3200, 100, 3);
INSERT INTO tb_personagem(nome, poderataque, poderdefesa, vida, velocidade, classe_id) VALUES ("Debora", 1700, 2400, 3000, 100, 2);
INSERT INTO tb_personagem(nome, poderataque, poderdefesa, vida, velocidade, classe_id) VALUES ("Karen", 2700, 2400, 3000, 100, 4);
INSERT INTO tb_personagem(nome, poderataque, poderdefesa, vida, velocidade, classe_id) VALUES ("Andressa", 2700, 2400, 3000, 100, 1);

select * from tb_classe;
select * from tb_personagem;

SELECT * FROM tb_personagem WHERE poderataque > 2000;
SELECT * FROM tb_personagem WHERE poderdefesa BETWEEN 1000 AND 2000;
SELECT * FROM tb_personagem WHERE nome LIKE "%c%";

SELECT tb_personagem.nome, poderataque, poderdefesa, tb_classe.tipo, tb_classe.geracao, tb_classe.ataque_range 
	FROM tb_personagem 
	INNER JOIN tb_classe ON classe_id = tb_classe.id;
    
SELECT tb_personagem.nome, poderataque, poderdefesa, tb_classe.tipo, tb_classe.geracao, tb_classe.ataque_range 
	FROM tb_personagem 
	INNER JOIN tb_classe ON classe_id = tb_classe.id WHERE tb_classe.tipo = "Medico";
