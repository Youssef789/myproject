package persistence.dao;

import java.util.List;

import model.Corso;


public interface CorsoDao {
	public void save(Corso corso);  // Create
	public Corso findByPrimaryKey(long codice);     // Retrieve
	public List<Corso> findAll();       
	public void update(Corso corso); //Update
	public void delete(Corso corso); //Delete	
}
