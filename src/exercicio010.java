import javax.swing.JOptionPane;
public class exercicio010 {

	public static void main(String[] args) {
		int dia;
		String m;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número de 1 a 7"));
		switch (dia) {
		case 1:
			m = "Domingo"; // para somente uma linha, com + linhas precisa de {}
			break;
		case 2:
			m = "Segunda-Feira";
			break;
		case 3:
			m = "Terça-Feira";
			break;
		case 4:
			m = "Quarta-Feira";
			break;
		case 5:
			m = "Quinta-Feira";
			break;
		case 6:
			m = "Sexta-Feira";
			break;
		case 7:
			m = "Sábado";
			break;
			
		default:
			m = "inválido";
			break;

	}
		
		JOptionPane.showMessageDialog(null, "O dia escolhido foi " + m + ".");
}
}
