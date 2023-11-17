package br.gov.fazenda.receita.leilao.entity.informatica;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class DispositivosInformatica {
    
    @Column(name = "dis_nome")
    private String nome;

    @Column(name = "dis_valor_inicial")
    private Double valorInicial;
}
