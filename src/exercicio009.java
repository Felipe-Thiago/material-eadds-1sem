import javax.swing.JOptionPane;
public class exercicio009 {

	public static void main(String[] args) {
		int numero = 0;
		String aux;
		
		try {
			aux = JOptionPane.showInputDialog("Entre com um n�mero inteiro.");
			numero = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null, "O n�mero inserido foi " + numero + ".");
		} catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Entre somente com um n�mero Inteiro", "E R R O", JOptionPane.NO_OPTION );
		}
	}

}
