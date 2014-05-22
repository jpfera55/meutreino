
package usuario.model;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class RepositorioBDRUsuario implements IRepositoriousuario  {

	private Connection conn = null;
	
    public RepositorioBDRUsuario() throws Exception {
    	    	    		
    	   this.conn = ConnectionManager.reservaStatement("mysql");

    	 
    	
    }
    
    //throws RepositorioException, SQLException
    public void inserir(Usuario usuario) throws RepositorioException, SQLException {
    	PreparedStatement stmt=null;
        if (usuario != null) {
            try {
            	
            	          	
            	String sql = "INSERT INTO USUARIO (nome, apelido, email, idade, altura, nivel, senha, tipo )"
            			+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            	
            	           	
            	stmt = this.conn.prepareStatement(sql);
            	
            	stmt.setString(1, usuario.getNome());
            	stmt.setString(2, usuario.getApelido());
            	stmt.setString(3, usuario.getEmail());
            	stmt.setInt(4, usuario.getIdade());
            	stmt.setFloat(5, usuario.getAltura());
            	stmt.setInt(6, usuario.getNivel());
            	stmt.setString(7, usuario.getSenha());
            	stmt.setInt(8, usuario.getTipo());
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
	public void remover(int idUsuario) throws UsuarioNaoEncontradoException, RepositorioException, SQLException {
		PreparedStatement stmt=null;
        try{
        	String sql = "DELETE FROM USUARIO WHERE idUsuario = ?"; 
        	stmt = this.conn.prepareStatement(sql);
        	stmt.setInt(1, idUsuario);
        	stmt.execute();
		} catch(SQLException e){
            throw new RepositorioException(e);
		} finally {
			stmt.close();
		}
	}
	public Usuario procurar(int idUsuario) throws UsuarioNaoEncontradoException, RepositorioException, SQLException {
   	    Usuario usuario = null;
   	    PreparedStatement stmt=null;
		ResultSet rs = null;
        try {
        	String sql = "SELECT * FROM USUARIO WHERE cpf = ?";
        	stmt = this.conn.prepareStatement(sql);
        	stmt.setInt(1, idUsuario);
        	rs = stmt.executeQuery();
        	
        	if (!rs.next()) throw new UsuarioNaoEncontradoException(idUsuario);
            usuario = new Usuario(rs.getString("idUsuario"), rs.getString("nome"), idUsuario, sql, sql, idUsuario, idUsuario, idUsuario, idUsuario);
        } catch (SQLException e) {
			throw new RepositorioException(e);
		} finally {
			stmt.close();
			rs.close();
		}
        
		return usuario;
	}
	public void atualizar(Usuario usuario) throws UsuarioNaoEncontradoException, RepositorioException, SQLException {
		PreparedStatement stmt=null;
	    try {
            if (usuario != null) {
                try {
                	String sql = "UPDATE CLIENTE SET idUsuario = ? ";
                		  
                		   
                	stmt = this.conn.prepareStatement(sql);
                	               	
                	stmt.setString(1, usuario.getNome());
                	stmt.setString(2, usuario.getApelido());
                	stmt.setString(3, usuario.getApelido());
                	stmt.setString(4, usuario.getEmail());
                	stmt.setInt(5, usuario.getIdade());
                	stmt.setFloat(6, usuario.getAltura());
                	stmt.setInt(7, usuario.getNivel());
                	stmt.setInt(9, usuario.getTipo());
                	                	
                	Integer resultado = stmt.executeUpdate();
                    if (resultado == 0) throw new UsuarioNaoEncontradoException(usuario.getIdUsuario());
                }
                catch (SQLException e) {
    			    throw new RepositorioException(e);
    		    }
            }
        } finally {
        	stmt.close();
		}
	}

/*	public boolean existe(String cpf) throws RepositorioException, SQLException {
		PreparedStatement stmt=null;
		ResultSet rs = null;
        try {
        	String sql = "SELECT count(*) as quantidade FROM CLIENTE WHERE cpf = ?";
        	stmt = this.conn.prepareStatement(sql);
        	stmt.setString(1, cpf);
        	rs = stmt.executeQuery();
        	rs.next();
        	if (rs.getInt("quantidade") == 0) return false;
        	else return true;
        	
        } catch (SQLException e) {
			throw new RepositorioException(e);
		} finally {
			stmt.close();
        	rs.close();
		}
    }
	public ArrayList<Cliente> listar() throws SQLException {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
        try {
            String sql = "SELECT * FROM CLIENTE";
            stmt = this.connection.prepareStatement(sql);
            rs = stmt.executeQuery();
        	
            while(rs.next()) {
            	Cliente cliente = new Cliente(rs.getString("cpf"), rs.getString("nome"));
            	clientes.add(cliente);
            	System.out.println(rs.getString("cpf"));
            }
            
        } catch (SQLException e) {
        	throw new SQLException(e.getMessage());
        } 
        finally {
        	stmt.close();
        	rs.close();
		}
        return clientes;
	}
*/

	@Override
	public Usuario procurarId(int idUsuario)
			throws UsuarioNaoEncontradoException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean existe(String string) throws RepositorioException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	
	public int ultimoRegistroId() throws RepositorioException, SQLException {
		// TODO Auto-generated method stub
		PreparedStatement stmt=null;
	    try {
           
                
                	String sql = "select max(idUsuario) from usuario ";
                		  
                	stmt = this.conn.prepareStatement(sql);
                	
                	ResultSet rs = stmt.executeQuery();
                	int resultado = rs.getInt("max(idUsuario)");
                	                	                	
                	return resultado;
                	
                } catch (SQLException e) {
        			throw new RepositorioException(e);
        		} finally {
        			stmt.close();
                	
      	} 	
	 
		
	}

	
}
