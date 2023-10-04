package br.gov.fazenda.receita.leilao.entity;

import lombok.Data;

@Data
public class Usuario {
    
    private Long cpf;
    
    private String nome;

    private String email;

    private String telefone;

}
