package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	public static Connection getConexao() {
		Connection cnx = null;
		String driverName = "com.mysql.cj.jdbc.Driver";  //Endereço do drive
		
		try {
			Class.forName(driverName);
			
			String serverName = "localhost:3306";
			String dataBase = "finalDB";
			String url ="jdbc:mysql://" + serverName + "/" + dataBase;
			String user = "root";
			String password = "";
			
			cnx = DriverManager.getConnection(url,user,password);
			
			return cnx;
			
			// se der erro ver se pode add o try catch
		} catch (ClassNotFoundException e) {
			System.out.println("O driver especificado não foi encontrado."); // ao inveis de mandar um erro padrao eu estou passando essa mensagem
	
			return null;
		} catch (SQLException e) {
			System.out.println("Não foi possivel conectar no banco de dados."); // ao inveis de mandar um erro padrao eu estou passando essa mensagem
			return null;
		}
		
	}
	
	public static boolean fecharConexao() {
		try {
			Dao.getConexao().close();
			return true;
		} catch (SQLException e) {
			return false;
			
		}
	}
}
