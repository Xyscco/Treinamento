package br.com.syncode.Treinamento;

import java.io.Serializable;

public class Entidade<ID extends Serializable> {

	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public void persiste() {

	}

	public boolean isTransient() {
		return getId() == null;
	}

	public void excluir() {

	}

}
