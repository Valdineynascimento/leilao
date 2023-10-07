drop table if exists usr_usuario;
drop table if exists end_endereco;
drop table if exists itm_item;

create table usr_usuario (
  usr_cpf bigint not null PRIMARY KEY,
  usr_nome varchar(100) not null,
  usr_email varchar(100) not null,
  usr_telefone varchar(100) not null  
);

create table end_endereco (
  end_id bigint not null PRIMARY KEY auto_increment,
  end_estado varchar(50) not null,
  end_cidade varchar(100) not null,
  end_bairro varchar(150) not null,
  end_logradouro varchar(200) not null,
  end_numero int not null,
  end_cep int
);

create table itm_item (
    itm_id bigint not null PRIMARY KEY auto_increment, 
    itm_nome varchar(50),
    itm_descricao varchar(100)
);




