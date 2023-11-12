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
@Table(name = "car_carro")
@AttributeOverride(name = "id", column = @Column(name = "car_id"))
@AttributeOverride(name = "marca", column = @Column(name = "car_marca"))
@AttributeOverride(name = "modelo", column = @Column(name = "car_modelo"))
@AttributeOverride(name = "cor", column = @Column(name = "car_cor"))
@AttributeOverride(name = "combustivel", column = @Column(name = "car_combustivel"))
public class Carro extends Veiculo{

    @Column(name = "car_numero_porta")
    private Integer numeroPortas;
    
}
