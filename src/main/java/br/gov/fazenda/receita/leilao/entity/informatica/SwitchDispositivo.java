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
@Table(name = "swi_switch_dispositivo")
public class SwitchDispositivo {

    @Column(name = "swi_numero_portas")
    private Integer numeroPortas;
    
}