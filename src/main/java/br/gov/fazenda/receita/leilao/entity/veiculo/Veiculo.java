package br.gov.fazenda.receita.leilao.entity.veiculo;

import br.gov.fazenda.receita.leilao.entity.Item;
//import br.gov.fazenda.receita.leilao.entity.Item;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public abstract class Veiculo extends Item{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "cor")
    private String cor;

    @Column(name = "combustivel")
    private String combustivel;
    
}
