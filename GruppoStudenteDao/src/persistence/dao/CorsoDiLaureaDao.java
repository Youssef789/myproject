package persistence.dao;

import java.util.List;


import model.CorsoDiLaurea;

public interface CorsoDiLaureaDao {
	public void save(CorsoDiLaurea corsodilaurea);  // Create
	public CorsoDiLaurea findByPrimaryKey(Long codice);     // Retrieve
	public List<CorsoDiLaurea> findAll();       
	public void update(CorsoDiLaurea corsodilaurea); //Update
	public void delete(CorsoDiLaurea corsodilaurea); //Delete

}
