package persistence.dao;

import java.util.List;

import model.Corso;
import model.Dipartimento;

public interface DipartimentoDao {
	public void save(Dipartimento dipartimenti);  // Create
	public Dipartimento findByPrimaryKey(long codice);     // Retrieve
	public List<Dipartimento> findAll();       
	public void update(Dipartimento dipartimenti); //Update
	public void delete(Dipartimento dipartimenti); //Delete
}
