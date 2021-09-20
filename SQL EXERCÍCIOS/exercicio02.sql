create table lojaEletronico(
id bigint auto_increment primary key,
nome varchar (30) not null,
categoria varchar (30) not null,
preço decimal not null, 
marca varchar (20) not null, 
ano decimal not null
);

use bancorh;

insert into lojaEletronico(nome, categoria, preço, marca, ano, ativo)
values ("iPhone", "celular", 1200, "Apple", 2020, true),
("airpods", "fone de ouvido", 400, "Apple", 2020, true),
("bateria samsung", "bateria de celular", 30, "samsung", "2015", true),
("cabo iphone", "carregador de celular", 100, "Apple", 2020, true),
("fone xiaomi", "fone bluetooh", 730, "xiaomi", 2018, true),
("notebook", "computador", 4500, "dell", 2019, true),
("nvidia 3090", "placa de vídeo", 12000, "nvidia", 2020, true),
("mouse ryzen", "mouse gamer", 280, "ryzen", 2018, true);

select * from lojaEletronico;

select * from lojaEletronico where preco > 500;
select * from lojaEletronico where preco < 500;
