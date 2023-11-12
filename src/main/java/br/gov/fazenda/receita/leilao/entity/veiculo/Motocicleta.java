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
@Table(name = "mot_motocicleta")
@AttributeOverride(name = "id", column = @Column(name = "mot_id"))
@AttributeOverride(name = "marca", column = @Column(name = "mot_marca"))
@AttributeOverride(name = "modelo", column = @Column(name = "mot_modelo"))
@AttributeOverride(name = "cor", column = @Column(name = "mot_cor"))
@AttributeOverride(name = "combustivel", column = @Column(name = "mot_combustivel"))
public class Motocicleta extends Veiculo{

    @Column(name = "mot_cilindrada")
    private Integer cilindrada;
    
}
