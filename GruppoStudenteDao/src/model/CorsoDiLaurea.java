package model;

import java.util.HashSet;
import java.util.Set;

import org.omg.CORBA.PRIVATE_MEMBER;

public class CorsoDiLaurea {
	private long codice ;
	private String nome;
	private Set<Corso> corsi;
	private Dipartimento dipartimento;
	
	
	public CorsoDiLaurea() {
		
		
	}
	public CorsoDiLaurea(String nome) {
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

	public Set<Corso> getCorsi() {
		return corsi;
	}
	public void setCorsi(Set<Corso> corsi) {
		this.corsi = corsi;
	}
	public Dipartimento getDipartimento() {
		return dipartimento;
	}
	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}
	public void addCorso(Corso corso) {
		if(corsi == null)
		{
			corsi=new HashSet<Corso>();
		}
		corsi.add(corso);
	}
	
	
}
