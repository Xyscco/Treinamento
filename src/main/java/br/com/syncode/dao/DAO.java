package br.com.syncode.dao;

import java.io.Serializable;
import java.util.Collection;

import br.com.syncode.Treinamento.*;

@SuppressWarnings("rawtypes")
public interface DAO {

	<T extends Entidade<ID>, ID extends Serializable> void persisteObjeto(T objeto);

	<T extends Entidade<ID>, ID extends Serializable> void excluiObjeto(T objeto);

	Entidade getObjetos(String id);

	Collection<Entidade> getObjetos();

}
