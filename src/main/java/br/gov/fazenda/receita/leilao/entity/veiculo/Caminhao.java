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
@Table(name = "cam_caminhao")
@AttributeOverride(name = "id", column = @Column(name = "cam_id"))
@AttributeOverride(name = "marca", column = @Column(name = "cam_marca"))
@AttributeOverride(name = "modelo", column = @Column(name = "cam_modelo"))
@AttributeOverride(name = "cor", column = @Column(name = "cam_cor"))
@AttributeOverride(name = "combustivel", column = @Column(name = "cam_combustivel"))
public class Caminhao extends Veiculo{

    @Column(name = "cam_numero_eixo")
    private Integer numeroEixos;
    
}
