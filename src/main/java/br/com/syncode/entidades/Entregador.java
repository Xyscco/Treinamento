package br.com.syncode.entidades;

public class Entregador {

	private Long codEntregador;
	private String nome;

	public Entregador() {
		super();
	}

	public Entregador(Long codEntregador, String nome) {
		super();
		this.codEntregador = codEntregador;
		this.nome = nome;
	}

	public Long getCodEntregador() {
		return codEntregador;
	}

	public void setCodEntregador(Long codEntregador) {
		this.codEntregador = codEntregador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codEntregador == null) ? 0 : codEntregador.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entregador other = (Entregador) obj;
		if (codEntregador == null) {
			if (other.codEntregador != null)
				return false;
		} else if (!codEntregador.equals(other.codEntregador))
			return false;
		return true;
	}

}
