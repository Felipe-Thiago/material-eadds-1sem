import javax.swing.JOptionPane;

public class LotoComsorteio {

	public static void main(String[] args) {
		int [] num = new int[3];
		int i, soma = 0;
		String result = " ";
		
		for (i=0;i<3;i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i + 1) + "� n�mero de 0 a 38:"));
			if (num[i]>38 || num[i]<0) {
				JOptionPane.showMessageDialog(null, "Insira somente n�meros de 0 a 38", "E R R O", JOptionPane.ERROR_MESSAGE);
				i--;
			}
		}
		result = "Os n�meros foram: ";
		
		for (i=0;i<3;i++) {
			if (num[i]%4==0) {
				soma = soma + num[i];
				result = result + String.valueOf(num[i]) + " ";
			} else {
				result = result + String.valueOf(num[i]) + " ";
			}
		}
		JOptionPane.showMessageDialog(null, result + "\nE os n�meros divis�veis por 4 somados s�o iguais a: " + soma);
	}

}
