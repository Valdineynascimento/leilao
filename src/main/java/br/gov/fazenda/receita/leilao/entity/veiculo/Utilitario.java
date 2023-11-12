package br.gov.fazenda.receita.leilao.entity.veiculo;

import jakarta.persistence.AttributeOverride;
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
@Table(name = "uti_utilitario")
@AttributeOverride(name = "id", column = @Column(name = "uti_id"))
@AttributeOverride(name = "marca", column = @Column(name = "uti_marca"))
@AttributeOverride(name = "modelo", column = @Column(name = "uti_modelo"))
@AttributeOverride(name = "cor", column = @Column(name = "uti_cor"))
@AttributeOverride(name = "combustivel", column = @Column(name = "uti_combustivel"))
public class Utilitario extends Veiculo{

    @Column(name = "uti_capacidade_carga")
    private Double capacidadeCarga;
    
}
