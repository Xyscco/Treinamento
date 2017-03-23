package br.com.syncode.entidades;

import br.com.syncode.Treinamento.Entidade;

public class Fornecedor extends Entidade<String> {

	private Usuario usuario;

	public Fornecedor() {
		super();
	}

	public Fornecedor(Usuario usuario) {
		super();
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
