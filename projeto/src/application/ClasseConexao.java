package application;

import java.sql.Connection;

public class ClasseConexao {
public Connection conexao;

public static Connection getConexao() throws Exception{

	String USUARIO = "root"; 
	String SENHA = "etec"; 
	String BANCO = "jdbc:mysql://localhost:3306/banco_funcionarios";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conexao = DriverManager.getConnection(BANCO, USUARIO, SENHA);
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return conexao;
	
}
}
