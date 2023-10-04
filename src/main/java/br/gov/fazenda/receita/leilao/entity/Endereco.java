package br.gov.fazenda.receita.leilao.entity;

import lombok.Data;

@Data
public class Endereco {

    private Long id;

    private String estado;

    private String cidade;

    private String bairro;

    private String logradouro;

    private Integer numero;

    private Integer cep;
    
}
