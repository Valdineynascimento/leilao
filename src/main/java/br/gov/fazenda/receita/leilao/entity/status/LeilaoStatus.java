package br.gov.fazenda.receita.leilao.entity.status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum LeilaoStatus {
    
    ABERTO("Em aberto"),
    ANDAMENTO("Em andamento"),
    FECHADO("Fechado");

    private String status;
}
