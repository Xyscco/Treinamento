package br.com.syncode.entidades;

import br.com.syncode.enumerados.StatusPedido;

public class HistoricoDePedido {

	private Pedido numPedido;
	private Funcionario funcResponsavel;
	private StatusPedido status;

	public HistoricoDePedido() {
		super();
	}

	public HistoricoDePedido(Pedido numPedido, Funcionario funcResponsavel, StatusPedido status) {
		super();
		this.numPedido = numPedido;
		this.funcResponsavel = funcResponsavel;
		this.status = status;
	}

	public Pedido getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(Pedido numPedido) {
		this.numPedido = numPedido;
	}

	public Funcionario getFuncResponsavel() {
		return funcResponsavel;
	}

	public void setFuncResponsavel(Funcionario funcResponsavel) {
		this.funcResponsavel = funcResponsavel;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

}
