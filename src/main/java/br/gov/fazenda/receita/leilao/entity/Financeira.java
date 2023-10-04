package br.gov.fazenda.receita.leilao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "fin_financeira")
@Data
public class Financeira {
    
    @Column(name = "fin_cnpj")
    private Long cnpj;

    @Column(name = "fin_nome")
    private String nome;

    @Column(name = "fin_razaoSocial")
    private String razaoSocial;

}
