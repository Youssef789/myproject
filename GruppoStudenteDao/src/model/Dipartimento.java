package model;

public class Dipartimento {
	private long codice ;
	private String nome;
	
	public Dipartimento() {
	}
	public Dipartimento(String nome) {
		this.nome=nome;
	}
	public long getCodice() {
		return codice;
	}
	public void setCodice(long codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
