import javax.swing.JOptionPane;
public class exercicio005 {

	public static void main(String[] args) {
		int idade;
		String aux;
		
		//Entrada de Dados
		aux = JOptionPane.showInputDialog("Informe sua Idade:");
		idade = Integer.parseInt(aux);
		
		if(idade >= 18) {
			JOptionPane.showMessageDialog(null, "Você é maior de Idade.");
		} else {
			JOptionPane.showMessageDialog(null, "Você é menor de Idade.");
		}
	}

}
