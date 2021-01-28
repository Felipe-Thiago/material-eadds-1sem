import javax.swing.JOptionPane;

public class exercicio004 {
	public static void main(String[] args) {
		String nome;
		String sobrenome;
		
		nome = JOptionPane.showInputDialog("Informe seu nome: ");
		sobrenome = JOptionPane.showInputDialog("Informe seu sobrenome: ");
		JOptionPane.showMessageDialog(null, "Seu nome invertido é: " + sobrenome + " " + nome + ".");
	}
}
