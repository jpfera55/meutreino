package treino.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import usuario.model.ConnectionManager;
import usuario.model.RepositorioException;
import usuario.model.Usuario;

public class RepositorioBDRTreino implements IRepositorioTreino {

private Connection conn = null;
	
    public RepositorioBDRTreino() throws Exception {
    	    	    		
    	   this.conn = ConnectionManager.reservaStatement("mysql");

    	 
    	
    }
    
    //throws RepositorioException, SQLException
    public void inserir(Treino treino) throws RepositorioException, SQLException {
    	PreparedStatement stmt=null;
        if (treino != null) {
            try {
            	
            	          	
            	String sql = "INSERT INTO Treino (idUsuario, data, intensidade, pontuacao, duracao, grup1, grup2 )"
            			+ " VALUES (?, ?, ?, ?, ?, ?, ? )";
            	
            	           	
            	stmt = this.conn.prepareStatement(sql);
            	
            	stmt.setInt(1, treino.getIdUsuario());
            	stmt.setString(2, treino.getData());
            	stmt.setString(3, treino.getIntensidade());
            	stmt.setInt(4, treino.getPontuacao());
            	stmt.setInt(5, treino.getDuracao());
            	stmt.setString(6, treino.getGrup1());
            	stmt.setString(7, treino.getGrup2());
            	
            	stmt.execute();
            	
            
            	
            }
            catch (SQLException e) {
                throw new RepositorioException(e);
		    }
            finally {
    			stmt.close();
    		}
        }    
    }

	@Override
	public boolean existe(String data) {
		// TODO Auto-generated method stub
		return false;
	}

}
