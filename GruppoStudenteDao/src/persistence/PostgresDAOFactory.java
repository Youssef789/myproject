package persistence;



import persistence.dao.CorsoDao;
import persistence.dao.CorsoDiLaureaDao;
import persistence.dao.DipartimentoDao;
import persistence.dao.GruppoDao;
import persistence.dao.IndirizzoDao;
import persistence.dao.StudenteDao;

class PostgresDAOFactory extends DAOFactory {

	
	
	private static  DataSource dataSource;
	

	// --------------------------------------------

	static {
		try {
			Class.forName("org.postgresql.Driver").newInstance();
			//questi vanno messi in file di configurazione!!!	
			dataSource=new DataSource("jdbc:postgresql://127.0.0.1:5432/","postgres","postgres");
			//dataSource=new DataSource("jdbc:postgresql://localhost:5432/Segreteria","postgres","postgres");

		} 
		catch (Exception e) {
			System.err.println("PostgresDAOFactory.class: failed to load MySQL JDBC driver\n"+e);
			e.printStackTrace();
		}
	}

	
	// --------------------------------------------
	
	@Override
	public StudenteDao getStudentDAO() {
		return new StudenteDaoJDBC(dataSource);
	}

	@Override
	public GruppoDao getGruppoDAO() {
		return new GruppoDaoJDBC(dataSource);
	}
	@Override
	public UtilDao getUtilDAO(){
		return new UtilDao(dataSource);
	}

	@Override
	public CorsoDao getCorsoDAO() {
		return new CorsoDaoJDBC(dataSource);
	}

	@Override
	public IndirizzoDao getIndirizzoDAO() {
		return new IndirizzoDaoJDBC(dataSource);
	}

	@Override
	public CorsoDiLaureaDao getCorsoDiLaureaDAO() {
		return new CorsoDiLaureaDaoJDBC(dataSource);
	}

	@Override
	public DipartimentoDao getDipartimentoDAO() {
		return new DipartimentoDaoJDBC(dataSource);
	}
	

}
