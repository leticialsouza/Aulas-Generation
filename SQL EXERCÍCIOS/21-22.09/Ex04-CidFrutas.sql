CREATE DATABASE db_cidade_das_frutas;

USE db_cidade_das_frutas;

CREATE TABLE tb_produto(
	id BIGINT(10) AUTO_INCREMENT NOT NULL,
	acido BOOLEAN NOT NULL,
	tamanho VARCHAR (20) NOT NULL,
	codigo BIGINT (20) NOT NULL,
	PRIMARY KEY (id)
	);
    
	INSERT INTO tb_produto(acido,tamanho,codigo)
	VALUES 	(TRUE, "medio", 1),
			(TRUE, "pequeno", 2),
            (FALSE, "grande", 3),
			(TRUE, "pequeno", 4),
            (FALSE, "grande", 5);
         
          
            
            
	CREATE TABLE tb_categoria(
	id BIGINT(10) AUTO_INCREMENT NOT NULL,
	fruta VARCHAR(40) NOT NULL,
	cor VARCHAR (20) NOT NULL,
    quantidade INT NOT NULL,
    preco INT NOT NULL,
    ativo BOOLEAN NOT NULL,
    categoria_id BIGINT(5) DEFAULT NULL,
    PRIMARY KEY (id),
	FOREIGN KEY (categoria_id) REFERENCES tb_produto (id)
	);
    
    INSERT INTO tb_categoria(fruta, cor, quantidade, preco, ativo, categoria_id)
	VALUES 	("morango", "vermelho", 50, 10, TRUE, 1),
			("amora", "roxa", 30, 26, TRUE, 2),
            ("banana", "amarelo", 20, 15, FALSE, 3),
            ("maça", "vermelha", 30, 5, FALSE, 5),
            ("laranja", "laranja", 10, 6, TRUE, 2),
            ("limão", "verde", 40, 7, TRUE, 4),
            ("manga", "laranja", 10, 6, FALSE, 5),
            ("uva", "roxa", 20, 8, FALSE, 3);
		
            SELECT * FROM tb_categoria WHERE preco > 50;
            SELECT * FROM tb_categoria WHERE preco > 3 AND preco < 60;
			
            SELECT * FROM tb_categoria;
            SELECT * FROM tb_categoria WHERE tb_categoria.produto LIKE "%C%";
            SELECT * FROM tb_categoria INNER JOIN tb_produto ON tb_categoria.produto_id = tb_produto.id;
            SELECT * FROM tb_categoria WHERE categoria_id =3;