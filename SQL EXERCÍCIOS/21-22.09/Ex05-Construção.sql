CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria(
	id BIGINT(10) AUTO_INCREMENT NOT NULL,
	prod_nome VARCHAR (30) NOT NULL,
	ativo BOOLEAN NOT NULL,
	PRIMARY KEY (id)
	);
    
	INSERT INTO tb_categoria(prod_nome, ativo)
    
	VALUES 	("hidraulicos", ativo),
			("eletricos", ativo),
			("ferramentas", ativo),
            ("pisos", ativo),
			("fixadores", ativo);
			
			
	CREATE TABLE tb_produto(
	id BIGINT(10) AUTO_INCREMENT NOT NULL,
	tipo VARCHAR(40) NOT NULL,
	produtos_novos BOOLEAN NOT NULL,
    quantidade INT NOT NULL,
    preco INT NOT NULL,
    categoria_id BIGINT(5) DEFAULT NULL,
    PRIMARY KEY (id),
	FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
	);
    
    INSERT INTO tb_produto(tipo, produtos_novos, quantidade, preco, categoria_id)
	VALUES 	("martelo", FALSE, 20, 27, 3),
			("disjuntor", TRUE, 50, 32, 2),
            ("registro", TRUE, 40, 15, 1),
            ("parafuso", FALSE, 60, 2, 5),
            ("piso",TRUE , 100, 34, 4),
            ("prego", FALSE, 200, 8, 5),
            ("chave", TRUE, 30, 60, 3),
            ("lampada", TRUE, 10, 24, 2);
            
			
		
            SELECT * FROM tb_produto WHERE preco > 50;
            SELECT * FROM tb_produto WHERE preco > 3 AND preco < 60;
			
            SELECT * FROM tb_produto;
            SELECT * FROM tb_produto WHERE tb_produto.tipo LIKE "%C%";
            SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_produto.categoria_id = tb_categoria.id;
            SELECT * FROM tb_produto WHERE categoria_id =2;