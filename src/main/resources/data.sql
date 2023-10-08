insert into usr_usuario (usr_cpf,usr_nome, usr_email, usr_telefone)
    values (22233344455, 'Valdiney', 'valdiney@meu.email', '12999887755');
insert into usr_usuario (usr_cpf,usr_nome, usr_email, usr_telefone)
    values (33344455566, 'Gilberto', 'gilberto@meu.email', '12988775544');
insert into end_endereco (end_id, end_estado, end_cidade, end_bairro, end_logradouro, end_numero, end_complemento) 
    values (1, 'SP', 'Sao Jose dos Campos', 'Cidade Morumbi', 'Rua Sete', 70,'Bloco 2, Apartamento 707');
insert into end_endereco (end_id, end_estado, end_cidade, end_bairro, end_logradouro, end_numero, end_complemento) 
    values (2, 'SP', 'Sao Jose dos Campos', 'Parque Industrial', 'Praça Natal', 60,'Bloco 1, Apartamento 770');
insert into fin_financeira (fin_cnpj,fin_nome, fin_razao_social, fin_email, fin_telefone)
    values (22233344455000, 'ValdineyInveste', 'Financeira Leal do Brasil SA', 'valdiney@investe.email', '12999887755');
insert into fin_financeira (fin_cnpj,fin_nome, fin_razao_social, fin_email, fin_telefone)
    values (33344455566000, 'GilbertoInvest', 'Financeira Nº1 do Brasil SA', 'gilberto@invest.email', '12988775544');
insert into lei_leilao (lei_id,lei_data_hora, lei_data_visitacao, lei_descricao, lei_end_id)
    values (1, '2023-12-29T09:27:39', '2023-11-27', 'Este lei é um teste',1);
insert into lei_leilao (lei_id,lei_data_hora, lei_data_visitacao, lei_descricao, lei_end_id)
    values (2, '2024-01-25T09:00:00', '2023-12-01', 'Este lei é um teste também',2);
