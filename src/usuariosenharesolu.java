import javax.swing.JOptionPane;

public class usuariosenharesolu {

	public static void main(String[] args) {
		//login e senha
		//login = aluno
		//senha = aluno
		
		//declaração de variáveis
		String login, senha;
		
		//Entrada de dados
		login = JOptionPane.showInputDialog("Entre com o login.");
		senha = JOptionPane.showInputDialog("Entre com a senha.");
		
		if (login.equals("aluno") && senha.equals("aluno")) {
			JOptionPane.showMessageDialog(null, "Acesso liberado.");
		} else {
			JOptionPane.showMessageDialog(null, "Login ou senha incorretos.");
		}
	}

}
