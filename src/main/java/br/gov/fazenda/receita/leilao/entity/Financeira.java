package br.gov.fazenda.receita.leilao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "fin_financeira")
@Data
public class Financeira {
    
    @Id
    @Column(name = "fin_cnpj")
    private Long cnpj;

    @Column(name = "fin_nome")
    private String nome;

    @Column(name = "fin_razao_social")
    private String razaoSocial;

    @Column(name = "fin_email")
    private String email;

    @Column(name = "fin_telefone")
    private String telefone;

}
