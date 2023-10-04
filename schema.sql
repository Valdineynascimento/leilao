drop table if exists usr_usuario;

create table usr_usuario (
  usr_cpf bigint not null PRIMARY KEY,
  usr_nome varchar(100) not null,
  usr_email varchar(100) not null,
  usr_telefone varchar(100) not null  
);

