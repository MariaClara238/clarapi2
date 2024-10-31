package ifrn.pi.eventos.models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexaobanco {

	    public static void main(String[] args) {
	        // Configurações de conexão
	        String url = "jdbc:mysql://localhost:3306/eventos"; 
	        String usuario = "root"; 
	        String senha = "123456";     

	        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
	            System.out.println("Conexão bem-sucedida!");
	        } catch (SQLException e) {
	            System.out.println("Erro ao conectar: " + e.getMessage());
	        }
	    }
	}

