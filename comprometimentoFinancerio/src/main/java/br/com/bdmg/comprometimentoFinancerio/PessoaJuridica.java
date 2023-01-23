package br.com.bdmg.comprometimentoFinancerio;

import java.util.ArrayList;

public class PessoaJuridica extends Pessoa {
	
    public PessoaJuridica(int documento, String nome, ArrayList<Bens> bens, ArrayList<Pessoa> sociedade) {
		super(documento, nome, bens, TipoPessoa.JURIDICA);
    }
    
	public void setSociedade(ArrayList<Pessoa> sociedade) {
		this.sociedade = sociedade;
	}
  
    
	
	
}
