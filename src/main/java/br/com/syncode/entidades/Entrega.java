package br.com.syncode.entidades;

public class Entrega {

	private Long codEntrega;
	private Pedido pedido;
	private Entregador entregador;

	public Entrega() {
		super();
	}

	public Entrega(Long codEntrega, Pedido pedido, Entregador entregador) {
		super();
		this.codEntrega = codEntrega;
		this.pedido = pedido;
		this.entregador = entregador;
	}

	public Long getCodEntrega() {
		return codEntrega;
	}

	public void setCodEntrega(Long codEntrega) {
		this.codEntrega = codEntrega;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Entregador getEntregador() {
		return entregador;
	}

	public void setEntregador(Entregador entregador) {
		this.entregador = entregador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codEntrega == null) ? 0 : codEntrega.hashCode());
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
		Entrega other = (Entrega) obj;
		if (codEntrega == null) {
			if (other.codEntrega != null)
				return false;
		} else if (!codEntrega.equals(other.codEntrega))
			return false;
		return true;
	}

}
