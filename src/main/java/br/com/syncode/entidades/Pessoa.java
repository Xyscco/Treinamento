package br.com.syncode.entidades;

public class Pessoa {

	private PessoaFisica pf;
	private PessoaJuridica pj;
	private Usuario cliente;

	public PessoaFisica getPf() {
		return pf;
	}

	public void setPf(PessoaFisica pf) {
		this.pf = pf;
	}

	public PessoaJuridica getPj() {
		return pj;
	}

	public void setPj(PessoaJuridica pj) {
		this.pj = pj;
	}

}
