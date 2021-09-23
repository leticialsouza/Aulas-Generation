CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

	CREATE TABLE tb_pizza(
	id BIGINT(10) AUTO_INCREMENT NOT NULL,
	redes VARCHAR(20) NOT NULL,
    	produto VARCHAR (20) NOT NULL,
	telefone BIGINT (20) NOT NULL,
	PRIMARY KEY (id)
	);
    
	INSERT INTO tb_pizza(redes,produto, telefone)
	VALUES 	("rede1", "produtos1", 11998546584),
		("rede2", "produtos2", 11985143154),
            	("rede3", "produtos3", 11965482315),
            	("rede4", "produtos4", 11912365478),
		("rede5", "produtos5", 11974138235);
            
	CREATE TABLE tb_categoria(
	id BIGINT(10) AUTO_INCREMENT NOT NULL,
	sabor VARCHAR(40) NOT NULL,
	tamanho VARCHAR(40) NOT NULL,
	tipo VARCHAR(40) NOT NULL,
    	pagamento VARCHAR(40) NOT NULL,
	preco INT(40) NOT NULL,
    	pizza_id BIGINT(5) DEFAULT NULL,
    	PRIMARY KEY (id),
	FOREIGN KEY (pizza_id) REFERENCES tb_pizza (id)
	);
    
    INSERT INTO tb_categoria(sabor,tamanho,tipo,pagamento,preco,pizza_id)
		VALUES 	("calabresa", "grande", "esfiha", "dinheiro", 25, 1),
			("frango", "média", "pizza", "pix", 45, 2),
			("vegetariana", "pequena", "pizza", "cartão", 50, 1),
			("brocólis", "pequena", "esfiha", "dinheiro", 38, 4),
            		("canadense", "grande", "pizza", "pix", 60, 3),
			("margherita", "média", "pizza", "pix", 55, 4),
			("mussarela", "grande", "esfiha", "cartao", 45, 2),
			("baiana", "pequena", "pizza", "pix", 60, 5);
            
             
            SELECT * FROM tb_categoria WHERE preco > 45;
            SELECT * FROM tb_categoria WHERE preco > 29 AND preco < 60;
			
            SELECT * FROM tb_categoria;
            SELECT * FROM tb_categoria WHERE tb_categoria.sabor LIKE "%C%";
            SELECT * FROM tb_categoria INNER JOIN tb_pizza ON tb_categoria.pizza_id = tb_pizza.id;
            SELECT * FROM tb_categoria WHERE pizza_id =4;