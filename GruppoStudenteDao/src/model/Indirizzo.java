package model;

import java.util.HashSet;
import java.util.Set;

public class Indirizzo {
	private String nome;
	private long codice;
	
	public Indirizzo() {
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

	
	
	public String toString() {
		return "Indirizzo[" + this.getCodice() + ", " + this.getNome()+"]"; 		
	}
	
	
}
