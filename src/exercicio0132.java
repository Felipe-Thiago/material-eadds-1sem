import javax.swing.JOptionPane;

public class exercicio0132 {

	public static void main(String[] args) {
		double[] notas = new double[5];
		double soma = 0;
		double media = 0;
		int i;
		
		for (i=0;i<5;i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a " + (i + 1) + "� nota: ")) ;
		}
		for (i=0;i<5;i++) {
			soma = soma + notas[i];
		}
		media = soma/5;
		if (media<5) {
			JOptionPane.showMessageDialog(null, "Que pena, voc� foi reprovado com uma m�dia de " + media);
		} else {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� foi aprovado com uma m�dia de " + media);
		}
	}

}
