package br.com.bdmg.comprometimentoFinancerio;

import java.util.ArrayList;

public class PessoaFisica extends Pessoa {

	public PessoaFisica(int documento, String nome, ArrayList<Bens> bens) {
		super(documento, nome, bens, TipoPessoa.FISICA);
	}
	
	

}
