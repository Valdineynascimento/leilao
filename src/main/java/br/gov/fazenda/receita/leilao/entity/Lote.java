package br.gov.fazenda.receita.leilao.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lot_lote")
public class Lote implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lot_id")
	private Long id;
	
	@Column(name = "lot_lace")
	private Double lance;
	
	@Column(name = "lot_valorInicial")
	private Double valorInicial;
	
	public Lote() {
	}

	public Lote(Long id, Double lance, Double valorInicial) {
		super();
		this.id = id;
		this.lance = lance;
		this.valorInicial = valorInicial;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLance() {
		return lance;
	}

	public void setLance(Double lance) {
		this.lance = lance;
	}

	public Double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(Double valorInicial) {
		this.valorInicial = valorInicial;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lote other = (Lote) obj;
		return Objects.equals(id, other.id);
	}
	
	
}