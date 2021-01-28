import javax.swing.JOptionPane;

public class exercicio002 {

	public static void main(String[] args ) {
		String nome;
		nome = JOptionPane.showInputDialog("Entre com um nome"); //pede o nome para a variável "nome"
		JOptionPane.showMessageDialog(null, "Seu nome é " + nome + "."); //faz uma caixa de texto
	}
}
