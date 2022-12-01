package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class arquivoController {
	
	@FXML
	private TextField campo;
	
	@FXML
	private Button botao;
	
	@FXML
	private Label texto;
	
	double idade;
	
	public void receberIdade() {
		
		idade = Double.parseDouble(campo.getText());
		
		if(idade >= 18) {
			texto.setText("Maior de idade!");
			ClasseConexao acesso = new ClasseConexao();
			Connection minhaConexao = acesso.getConexao();
			String insert_sql = "INSERT ";
		}
		else {
			texto.setText("Menor de idade!");
		}
		
	}
	
}
