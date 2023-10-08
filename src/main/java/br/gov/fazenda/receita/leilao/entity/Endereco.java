package br.gov.fazenda.receita.leilao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "end_endereco")
@Data
public class Endereco {

    @Id
    @Column(name = "end_id")
    private Long id;
    
    @Column(name = "end_estado")
    private String estado;

    @Column(name = "end_cidade")
    private String cidade;

    @Column(name = "end_bairro")
    private String bairro;

    @Column(name = "end_logradouro")
    private String logradouro;

    @Column(name = "end_numero")
    private Integer numero;

    @Column(name = "end_cep")
    private Integer cep;

    @Column(name = "end_complemento")
    private String complemento;
    
}
