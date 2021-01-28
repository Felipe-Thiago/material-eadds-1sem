import javax.swing.JOptionPane;

public class exercicio0132 {

	public static void main(String[] args) {
		double[] notas = new double[5];
		double soma = 0;
		double media = 0;
		int i;
		
		for (i=0;i<5;i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a " + (i + 1) + "º nota: ")) ;
		}
		for (i=0;i<5;i++) {
			soma = soma + notas[i];
		}
		media = soma/5;
		if (media<5) {
			JOptionPane.showMessageDialog(null, "Que pena, você foi reprovado com uma média de " + media);
		} else {
			JOptionPane.showMessageDialog(null, "Parabéns, você foi aprovado com uma média de " + media);
		}
	}

}
