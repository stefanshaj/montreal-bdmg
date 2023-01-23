package br.com.bdmg.comprometimentoFinancerio;

public class Bens {
	private int idBens;
	private String nome;
	private double valor;
	
	
	public Bens(int idBens, String nome, double valor) {
		super();
		this.idBens = idBens;
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getIdBens() {
		return idBens;
	} 
	
}
