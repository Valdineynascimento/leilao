package br.gov.fazenda.receita.leilao.entity.informatica;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "mon_monitor")
public class Monitor extends DispositivosInformatica{

    @Column(name = "mon_tipo_tela")
    private String tipoTela;

    @Column(name = "mon_tamanho")
    private Double tamanho;
    
}

