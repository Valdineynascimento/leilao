package br.gov.fazenda.receita.leilao.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "lei_leilao")
@Data
public class Leilao {
    
    @Id
    @Column(name = "lei_id")
    private Long id;

    @Column(name = "lei_data_hora")
    private LocalDateTime dataInicial;

    @Column(name = "lei_data_visitacao")
    private LocalDate dataVisitacao;

    @Column(name = "lei_descricao")
    private String descricao;
    
    @OneToOne(mappedBy = "leilao")
    private Endereco endereco;

}
