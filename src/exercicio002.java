import javax.swing.JOptionPane;

public class exercicio002 {

	public static void main(String[] args ) {
		String nome;
		nome = JOptionPane.showInputDialog("Entre com um nome"); //pede o nome para a vari�vel "nome"
		JOptionPane.showMessageDialog(null, "Seu nome � " + nome + "."); //faz uma caixa de texto
	}
}
