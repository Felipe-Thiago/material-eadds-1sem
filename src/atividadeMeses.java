import javax.swing.JOptionPane;
public class atividadeMeses {

	public static void main(String[] args) {
		int mes;
		
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero de 1 a 12: "));
		switch (mes) {
		case 1:
			JOptionPane.showMessageDialog(null, "O m�s digitado foi janeiro");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "O m�s digitado foi fevereiro");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "O m�s digitado foi mar�o");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "O m�s digitado foi abril");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "O m�s digitado foi maio");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "O m�s digitado foi junho");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "O m�s digitado foi julho");
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "O m�s digitado foi agosto");
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "O m�s digitado foi setembro");
			break;
		case 10:
			JOptionPane.showMessageDialog(null, "O m�s digitado foi outubro");
			break;
		case 11:
			JOptionPane.showMessageDialog(null, "O m�s digitado foi novembro");
			break;
		case 12:
			JOptionPane.showMessageDialog(null, "O m�s digitado foi dezembro");
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "M�s inv�lido");
		}

	}

}
