package model;

import java.util.HashSet;
import java.util.Set;

public class Indirizzo {
	private String nome;
	private long codice;
	private Set<Studente> studenti;
	
	public Indirizzo(Long codice,String nome) {
		this.codice=codice;
		this.nome=nome;
	}
	
	public Indirizzo() {
		this.studenti = new HashSet<>();
	}
	public long getCodice() {
		return codice;
	}
	public void setCodice(Long codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(Set<Studente> studenti) {
		this.studenti = studenti;
	}

	public void setCodice(long codice) {
		this.codice = codice;
	}
	
	
	
}
