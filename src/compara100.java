import javax.swing.JOptionPane;
public class compara100 {

	public static void main(String[] args) {
		double numero;
		String aux;
		
		aux = JOptionPane.showInputDialog("Insira um número."); //pede um número em string
		numero = Double.parseDouble(aux); //transforma a string obtida em número
		
		if(numero >= 100) {
			JOptionPane.showMessageDialog(null, "O número " + numero + " é maior ou igual a 100.");
			} else {
				JOptionPane.showMessageDialog(null, "O número " + numero + " é menor que 100.");
		}

	}

}
