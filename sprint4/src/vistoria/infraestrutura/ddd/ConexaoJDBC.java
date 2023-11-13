package vistoria.infraestrutura.ddd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJDBC {
	private String driver;
	private String connectionString;
	private String usuario;
	private String senha;
	
	public ConexaoJDBC(String driver, String connectionString, String usuario, String senha) {
		this.driver = "oracle.jdbc.OracleDriver";
		this.connectionString = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
		this.usuario = "RM551154";
		this.senha = "210105";
	}
	
	public Connection criarConexao() throws ClassNotFoundException, SQLException {
		Class.forName(this.driver);
		return DriverManager.getConnection(this.connectionString, this.usuario, this.senha);
	}
}
