import javax.swing.JOptionPane;
public class compara100 {

	public static void main(String[] args) {
		double numero;
		String aux;
		
		aux = JOptionPane.showInputDialog("Insira um n�mero."); //pede um n�mero em string
		numero = Double.parseDouble(aux); //transforma a string obtida em n�mero
		
		if(numero >= 100) {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero + " � maior ou igual a 100.");
			} else {
				JOptionPane.showMessageDialog(null, "O n�mero " + numero + " � menor que 100.");
		}

	}

}
