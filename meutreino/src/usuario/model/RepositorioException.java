package usuario.model;

import java.sql.SQLException;

public class RepositorioException extends Exception {
	
	public RepositorioException(SQLException e){
		super(e);
	}

	

}
