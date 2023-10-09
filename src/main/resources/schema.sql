drop table if exists lei_leilao;
drop table if exists lot_lote;
drop table if exists itm_item;
drop table if exists usr_usuario;
drop table if exists end_endereco;
drop table if exists fin_financeira;


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
    end_bairro varchar(150),
    end_logradouro varchar(200) not null,
    end_numero int,
    end_cep int,
    end_complemento varchar(50)
);

create table fin_financeira (
    fin_cnpj bigint not null PRIMARY KEY,
    fin_nome varchar(100) not null,
    fin_razao_social varchar(100) not null,
    fin_email varchar(100) not null,
    fin_telefone varchar(100) not null  
);

create table itm_item (
    itm_id bigint not null PRIMARY KEY auto_increment, 
    itm_tipo varchar(50),
    itm_nome varchar(50),
    itm_descricao varchar(100)
);

create table lot_lote(
    lot_id bigint not null PRIMARY KEY,
    lot_lance float not null,
    lot_valorInicial float not null,
    lot_itm_id bigint not null,
    foreign key (lot_itm_id) references itm_item (itm_id)
);

create table lei_leilao (
    lei_id bigint not null PRIMARY KEY,
    lei_data_hora dateTime not null,
    lei_data_visitacao date not null,
    lei_descricao varchar(250) not null,
    lei_end_id bigint not null,
    lei_lot_id  bigint,
    foreign key (lei_end_id) references end_endereco (end_id),
    foreign key (lei_lot_id) references lot_lote (lot_id)
);


