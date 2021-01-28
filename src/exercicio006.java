import javax.swing.JOptionPane;
public class exercicio006 {

	public static void main(String[] args) {
		//declaração de variáveis
		int idade;
		String aux;
		
		//entrada de dados
		aux = JOptionPane.showInputDialog("Informe sua Idade:");
		//conversão de tipos
		idade = Integer.parseInt(aux);
		
		//tomada de decisão
		if (idade >= 18) {
			if(idade == 18) {
				JOptionPane.showMessageDialog(null, "Você tem 18 anos.");
			}else {
				JOptionPane.showMessageDialog(null, "Você já é de maior.");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Você ainda é de menor.");
		}
	}

}
