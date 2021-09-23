CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

	CREATE TABLE tb_produto(
	id BIGINT(10) AUTO_INCREMENT NOT NULL,
	setor VARCHAR(20) NOT NULL,
    	produto VARCHAR (20) NOT NULL,
	codigo BIGINT (20) NOT NULL,
	PRIMARY KEY (id)
	);
    
	INSERT INTO tb_produto(setor,produto,codigo)
    
	VALUES 	("setor1", "produtos_remedios", 1),
		("setor2", "produtos_maquiagem", 2),
            	("setor3", "produtos_rosto", 3),
            	("setor4", "produtos_higiene", 4),
            	("setor5", "produtos_corpo", 5);
            
	CREATE TABLE tb_categoria(
	id BIGINT(10) AUTO_INCREMENT NOT NULL,
	produto VARCHAR(40) NOT NULL,
	tamanho VARCHAR(40) NOT NULL,
	quantidade INT NOT NULL,
   	preco INT NOT NULL,
   	ativo BOOLEAN NOT NULL,
    	categoria_id BIGINT(5) DEFAULT NULL,
    	PRIMARY KEY (id),
	FOREIGN KEY (categoria_id) REFERENCES tb_produto (id)
	);
    
    INSERT INTO tb_categoria(produto, tamanho, quantidade, preco, ativo, categoria_id)
    
	VALUES 	("dramin", "pequeno", "87", "10", ativo, 1),
		("esfoliante", "pequeno", "58", "40", ativo, 3),
           	("omeprazol", "médio", "40", "20", ativo, 1),
            	("escova", "pequeno", "25", "3", ativo, 4),
            	("brinco", "pequeno", "10", "5", ativo, 3),
            	("hidratante", "grande", "65", "70", ativo, 5),
            	("batom", "pequeno", "15", "45", ativo, 2),
            	("blush", "medio", "65", "10", ativo, 2);
            
		
            SELECT * FROM tb_categoria WHERE preco > 50;
            SELECT * FROM tb_categoria WHERE preco > 3 AND preco < 60;
			
            SELECT * FROM tb_categoria;
            SELECT * FROM tb_categoria WHERE tb_categoria.produto LIKE "%B%";

            SELECT * FROM tb_categoria INNER JOIN tb_produto ON tb_categoria.produto_id = tb_produto.id;
            SELECT * FROM tb_categoria WHERE categoria_id =1;