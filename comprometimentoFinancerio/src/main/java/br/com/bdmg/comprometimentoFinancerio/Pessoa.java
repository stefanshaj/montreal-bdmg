package br.com.bdmg.comprometimentoFinancerio;

import java.util.ArrayList;

public abstract class Pessoa {
	
	private String nome;
	private int documento;
	private TipoPessoa tipoPessoa;
	private ArrayList<Bens> bens = new ArrayList<Bens>();	
	protected ArrayList<Pessoa> sociedade;

	public Pessoa( int documento, String nome, ArrayList<Bens> bens,TipoPessoa tipoPessoa) {
		super();
		this.documento = documento;
		this.nome = nome;
		this.bens = bens;
		this.tipoPessoa = tipoPessoa;
	}
	

	public int getDocumento() {
		return documento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Bens> getBens() {
		return bens;
	}
	public void setBens(ArrayList<Bens> bens) {
		this.bens = bens;
	}


	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}


	public ArrayList<Pessoa> getSociedade() {
		return sociedade;
	}


	public void setSociedade(ArrayList<Pessoa> sociedade) {
		this.sociedade = sociedade;
	}
	
	
}
