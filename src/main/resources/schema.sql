drop table if exists end_endereco;
drop table if exists lei_leilao;
drop table if exists car_carro;
drop table if exists mot_motocicleta;
drop table if exists uti_utilitario;
drop table if exists cam_caminhao;
drop table if exists itm_item;
drop table if exists lot_lote;
drop table if exists usr_usuario;
drop table if exists fin_financeira;
--drop table if exists end_endereco;




create table usr_usuario (
    usr_cpf bigint not null PRIMARY KEY,
    usr_nome varchar(100) not null,
    usr_email varchar(100) not null,
    usr_telefone varchar(100) not null  
);

create table fin_financeira (
    fin_cnpj bigint not null PRIMARY KEY,
    fin_nome varchar(100) not null,
    fin_razao_social varchar(100) not null,
    fin_email varchar(100) not null,
    fin_telefone varchar(100) not null  
);

create table lei_leilao (
    lei_id bigint not null PRIMARY KEY,
    lei_data_hora dateTime not null,
    lei_data_visitacao date not null,
    lei_descricao varchar(250) not null
    --lei_end_id bigint not null
);

create table end_endereco (
    end_id bigint not null PRIMARY KEY auto_increment,
    end_estado varchar(50) not null,
    end_cidade varchar(100) not null,
    end_bairro varchar(150),
    end_logradouro varchar(200) not null,
    end_numero int,
    end_cep int,
    end_complemento varchar(50),
    end_usr_id bigint,
    end_fin_id bigint,
    end_lei_id bigint,
    foreign key (end_usr_id) references usr_usuario(usr_cpf),
    foreign key (end_fin_id) references fin_financeira(fin_cnpj),
    foreign key (end_lei_id) references lei_leilao(lei_id)
);

create table itm_item (
    itm_id bigint not null PRIMARY KEY auto_increment, 
    itm_tipo varchar(50),
    itm_nome varchar(50),
    itm_descricao varchar(100)
);

create table lot_lote(
    lot_id bigint not null PRIMARY KEY auto_increment,
    lot_lance float not null,
    lot_valor_inicial float not null
);

create table car_carro (
    car_id bigint not null PRIMARY KEY,
    car_marca varchar(150) not null,
    car_modelo varchar(150) not null,
    car_cor varchar(100),
    car_combustivel varchar(100),
    car_numero_porta int not null
    --FOREIGN KEY (car_id) REFERENCES veiculo (id)
);

CREATE TABLE mot_motocicleta (
    mot_id bigint PRIMARY KEY,
    mot_marca varchar(150) not null,
    mot_modelo varchar(150) not null,
    mot_cor varchar(100),
    mot_combustivel varchar(100),
    mot_cilindrada int
);

CREATE TABLE uti_utilitario (
    uti_id bigint PRIMARY KEY,
    uti_marca varchar(150) not null,
    uti_modelo varchar(150) not null,
    uti_cor varchar(100),
    uti_combustivel varchar(100),
    uti_capacidade_carga DOUBLE
);

CREATE TABLE cam_caminhao (
    cam_id bigint PRIMARY KEY,
    cam_capacidade_carga DOUBLE,
    cam_marca varchar(150),
    cam_modelo varchar(150),
    cam_cor varchar(100),
    cam_combustivel varchar(100),
    cam_numero_eixo int
);
