CREATE TABLE IF NOT EXISTS categoria (
	codigo BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(50) NOT NULL 
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;

INSERT INTO categoria (nome) values ('Lazer');
INSERT INTO categoria (nome) values ('Alimentação');
INSERT INTO categoria (nome) values ('Supermercado');
INSERT INTO categoria (nome) values ('Farmácia');
INSERT INTO categoria (nome) values ('Outros');

