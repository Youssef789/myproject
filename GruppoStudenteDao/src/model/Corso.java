package model;

import java.util.HashSet;
import java.util.Set;

public class Corso {
	
	private String nome;
	private long codice;
	private Set<Studente> studenti;
	public Corso(long codice) {
		this.codice=codice;
		
	}
	public Corso() {
		this.studenti = new HashSet<>();
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
	public Set<Studente> getStudenti() {
		return studenti;
	}
	public void setStudenti(Set<Studente> studenti) {
		this.studenti = studenti;
	}
	
	public void addStudente(Studente studente){
		if (this.studenti == null){
			this.studenti = new HashSet<Studente>();
		}
		this.studenti.add(studente);
	}
	
}
