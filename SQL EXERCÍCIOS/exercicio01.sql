use bancoRH;
create table funcRH(
id bigint auto_increment primary key,
nome VARCHAR (40) NOT NULL,
salario DECIMAL NOT NULL,
ativo BOOLEAN NOT NULL	
);
insert into funcRH(nome, salario, ativo)
values ("Leticia", 2500, true),
("Victor", 5500, true),
("Mariana", 1500, true),
("Luciano", 8000, true),
("Magali", 200, true);

select * from funcRH;

select * from funcRH where salario > 2000;
select * from funcRH where salario < 2000;

