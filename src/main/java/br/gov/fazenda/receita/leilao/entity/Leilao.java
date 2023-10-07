package br.gov.fazenda.receita.leilao.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "lei_leilao")
@Data
public class Leilao {
    
    @Id
    @Column(name = "lei_id")
    private Long id;

    @Column(name = "lei_dataInicial")
    private LocalDateTime dataInicial;

    @Column(name = "lei_dataFinal")
    private LocalDateTime dataFinal;

    @Column(name = "lei_end_local")
    private Endereco local;

    @Column(name = "lei_descricao")
    private String descricao;
}
