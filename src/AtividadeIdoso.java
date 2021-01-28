import javax.swing.JOptionPane;
public class AtividadeIdoso {

	public static void main(String[] args) {
		int idade;
		String aux;
		
		aux = JOptionPane.showInputDialog("Fila de espera. Informe sua Idade para saber sua fila.");
		idade = Integer.parseInt(aux);
		
		if(idade >= 60) {
			if(idade >= 80) {
				JOptionPane.showMessageDialog(null, "Você será encaminhado à fila 80+.");
			} else {
				JOptionPane.showMessageDialog(null, "Você será encaminhado à fila prioritária.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Você será encaminhado à fila comum.");
		}

	}

}
