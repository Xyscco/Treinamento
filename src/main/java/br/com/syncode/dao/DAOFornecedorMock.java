package br.com.syncode.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.syncode.Treinamento.Entidade;

public class DAOFornecedorMock implements DAO {
	
	private Map<Serializable, Entidade> fornecedores = new HashMap<Serializable, Entidade>();

	public <T extends Entidade<ID>, ID extends Serializable> void persisteObjeto(T objeto) {
		fornecedores.put(objeto.getId(), objeto);

	}

	public <T extends Entidade<ID>, ID extends Serializable> void excluiObjeto(T objeto) {
		fornecedores.remove(objeto.getId());

	}

	public Entidade getObjetos(String id) {
		return fornecedores.get(id.toString());
	}

	public Collection<Entidade> getObjetos() {
		return fornecedores.values();
	}

}
