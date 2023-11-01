package br.gov.fazenda.receita.leilao.entity.veiculo;

import br.gov.fazenda.receita.leilao.entity.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Veiculo extends Item{

    private String marca;

    private String modelo;

    private String cor;

    
}
