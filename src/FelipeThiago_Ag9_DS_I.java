import javax.swing.JOptionPane;

public class FelipeThiago_Ag9_DS_I {

	public static void main(String[] args) {
		int num[][] = new int[10][10];
		int linha, coluna, soma = 0;

		JOptionPane.showMessageDialog(null, "Processo de inser��o de dados");
		for (linha = 0; linha<10; linha++) {
			for (coluna = 0; coluna<10; coluna++) {
				num[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (linha+1) + "� n�mero"));
			}
		}
		
		for (linha = 0; linha<10; linha++) {
			for (coluna = 0; coluna<10; coluna++) {
				soma = soma + num[linha][coluna];
			}
		}
		
				JOptionPane.showMessageDialog(null, "A soma de todos os n�meros inseridos foi de " + soma);

	}

}
