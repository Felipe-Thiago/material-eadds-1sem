import javax.swing.JOptionPane;
public class exercicio006 {

	public static void main(String[] args) {
		//declara��o de vari�veis
		int idade;
		String aux;
		
		//entrada de dados
		aux = JOptionPane.showInputDialog("Informe sua Idade:");
		//convers�o de tipos
		idade = Integer.parseInt(aux);
		
		//tomada de decis�o
		if (idade >= 18) {
			if(idade == 18) {
				JOptionPane.showMessageDialog(null, "Voc� tem 18 anos.");
			}else {
				JOptionPane.showMessageDialog(null, "Voc� j� � de maior.");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Voc� ainda � de menor.");
		}
	}

}
