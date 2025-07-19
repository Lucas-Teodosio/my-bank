create table tb_customers(
 id serial PRIMARY KEY,
 document VARCHAR (20) not NULL,
 email VARCHAR(100)  not null,
 requests int not null
);

CREATE TYPE card_brand AS ENUM (
  'VISA',
  'MASTERCARD',
  'ELO',
  'HIPERCARD'
);

CREATE TABLE tb_cards (
 id           SERIAL        PRIMARY KEY,
 brand        card_brand    NOT NULL,
 income       NUMERIC(15,2) NOT NULL
);