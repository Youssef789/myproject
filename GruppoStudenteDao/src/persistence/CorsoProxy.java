package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import model.Corso;
import model.Studente;

public class CorsoProxy extends Corso{
	private DataSource dataSource;
	
	public CorsoProxy(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public Set<Studente> getStudenti() { 
		Set<Studente> studenti = new HashSet<>();
		Connection connection = this.dataSource.getConnection();
		try {
			PreparedStatement statement;
			String query = "select * from studente where corso_codice = ?";
			statement = connection.prepareStatement(query);
			statement.setLong(1, this.getCodice());
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Studente studente = new Studente();
				studente.setMatricola(result.getString("matricola"));				
				studente.setNome(result.getString("nome"));
				studente.setCognome(result.getString("cognome"));
				long secs = result.getDate("data_nascita").getTime();
				studente.setDataNascita(new java.util.Date(secs));
				studenti.add(studente);
			}
		} catch (SQLException e) {
			throw new PersistenceException(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new PersistenceException(e.getMessage());
			}
		}	
		this.setStudenti(studenti);
		return super.getStudenti(); 
	}
}
