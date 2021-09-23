CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe(
id BIGINT(10) AUTO_INCREMENT NOT NULL,
classe VARCHAR(20) NOT NULL,
ataque BIGINT(20) NOT NULL,
defesa BIGINT(20) NOT NULL,
PRIMARY KEY (id)
);

INSERT INTO tb_classe(classe,ataque,defesa)
VALUES ("classe'", 2500, 5000),
("classe2", 3000, 1500),
("classe3", 1500, 1000),
("classe4", 1000, 3000),
("classe5", 2000, 6000);

CREATE TABLE tb_personagem(
id BIGINT(10) AUTO_INCREMENT NOT NULL,
nome VARCHAR(40) NOT NULL,
planeta VARCHAR(40) NOT NULL,
cor VARCHAR(40) NOT NULL,
poder VARCHAR(40) NOT NULL,
idade INT(40) NOT NULL,
classe_id BIGINT(5) DEFAULT NULL,
PRIMARY KEY (id),
FOREIGN KEY (classe_id) REFERENCES tb_classe (id)
);

INSERT INTO tb_personagem(nome,planeta,cor,poder,idade,classe_id)
	VALUES("sl_saturn", "saturno", "roxo", "controle_tempo", 20, 5),
("sl_pluto", "plutão", "rosa", "teletransporte_voar", 50, 4),
("sl_venus", "vênus", "amarelo", "super_inteligencia", 30, 3),
("sl_moon", "lua", "vermelho", "manipular_vento", 80, 3),
("sl_mercury", "mercurio", "azul", "velocidade_luz", 90 ,1),
("sl_galaxia", "moon", "verde", "super_força", 30, 2),
("sl_neptune", "netuno", "amarelo", "poderes_agua", 70, 3),
("sl_uranus", "urano", "cinza", "manipulação_som", 40, 1);
		
            
SELECT * FROM tb_classe WHERE ataque > 2000;
SELECT * FROM tb_classe WHERE defesa > 1000 AND defesa < 2000;
			
SELECT * FROM tb_classe;
SELECT * FROM tb_personagem;
SELECT * FROM tb_personagem WHERE tb_personagem.nome LIKE "%C%";
SELECT * FROM tb_personagem INNER JOIN tb_classe ON tb_personagem.classe_id = tb_classe.id;
SELECT * FROM tb_personagem WHERE classe_id = 3;