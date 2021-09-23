CREATE DATABASE db_cursoDaMinhaVida;

USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria(
	id BIGINT(10) AUTO_INCREMENT NOT NULL,
	tipo_curso VARCHAR (20) NOT NULL,
	custo_curso BIGINT (20) NOT NULL,
	codigo BIGINT (20) NOT NULL,
	PRIMARY KEY (id)
	);
    
	INSERT INTO tb_categoria(tipo_curso, custo_curso, codigo)
    
	VALUES 	("espanhol", 20, 1),
			("ingles", 20, 2),
            ("alemão", 50, 3),
            ("francês", 60, 4),
            ("italiano", 40, 5);
			
         
	CREATE TABLE tb_produto(
	id BIGINT(10) AUTO_INCREMENT NOT NULL,
	turma VARCHAR(40) NOT NULL,
	prof VARCHAR (20) NOT NULL,
    vagas INT NOT NULL,
    periodo  VARCHAR(40) NOT NULL,
    preco VARCHAR(40) NOT NULL,
    ativo BOOLEAN NOT NULL,
    categoria_id BIGINT(5) DEFAULT NULL,
    PRIMARY KEY (id),
	FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
	);
    
    INSERT INTO tb_produto(turma, prof, vagas, periodo, preco, ativo, categoria_id)
	VALUES 	("turma_1", "marcelo", 40, "manha", 3, TRUE, 1),
			("turma_2", "janaina", 80, "tarde", 10, TRUE, 2),
            ("turma_3", "fabiano", 60, "noite", 20, TRUE, 3),
            ("turma_4", "patricia", 40, "manha", 60, TRUE, 4),
            ("turma_5", "fernando", 50, "noite", 50, TRUE, 5),
            ("turma_6", "marcelo", 40, "tarde", 80, TRUE, 1),
            ("turma_7", "patricia", 30, "manha", 40, TRUE, 4),
            ("turma_8", "marcelo", 20, "tarde", 20, TRUE, 1);
            
            SELECT * FROM tb_produto WHERE preco > 50;
            SELECT * FROM tb_produto WHERE preco > 3 AND preco < 60;
			
            SELECT * FROM tb_produto;
            SELECT * FROM tb_produto WHERE tb_produto.tipo LIKE "%J%";
            SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_produto.categoria_id = tb_categoria.id;
            SELECT * FROM tb_produto WHERE categoria_id =2;