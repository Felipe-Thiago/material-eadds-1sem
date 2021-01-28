import javax.swing.JOptionPane;
public class exercicio008 {

	public static void main(String[] args) { //uso do .equals, comparações com String
		String nome;
		
		nome = JOptionPane.showInputDialog("Entre com um nome");
		
		if (nome .equals("Felipe")) {
			JOptionPane.showMessageDialog(null, "O nome digitado foi 'Felipe'.");
		} else {
			JOptionPane.showMessageDialog(null, "O nome digitado foi '" + nome + "'.");
		}
	}

}
