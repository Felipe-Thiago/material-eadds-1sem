import javax.swing.JOptionPane;
public class usuariosenha {

	public static void main(String[] args) {
	String usuario, senha;
	
	usuario = JOptionPane.showInputDialog("Informe o nome de usu�rio.");
	
	
		if (usuario .equals("LipeCipher")) {
			senha = JOptionPane.showInputDialog("Informe a senha.");
			if (senha .equals("12345")) {
				JOptionPane.showMessageDialog(null, "Senha correta. Bem-vindo(a) ao programa, " + usuario + ".");
			} else {
				JOptionPane.showMessageDialog(null, "Senha Incorreta.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Usu�rio n�o encontrado.");
		}
	}
}
