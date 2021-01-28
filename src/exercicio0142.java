import javax.swing.JOptionPane;
public class exercicio0142 {
public static void main(String[] args) {
	//declaração de variáveis
	double notas [] [] = new double [10][4];
	int linha, coluna;
	double media = 0;
	
	//entrada de dados
	JOptionPane.showMessageDialog (null, "Inserindo os dados na Matriz");
	for (linha = 0; linha < 10; linha++) {
		for (coluna = 0; coluna < 3; coluna++) {
			notas[linha][coluna] = Double.parseDouble(JOptionPane.showInputDialog("Entre a nota do " + (linha+1) +"º "+"aluno"));
		}
	}
	
	//cálculo da média
	for (linha = 0; linha < 10; linha++) {
		for (coluna = 0; coluna < 3; coluna++) {
			media = media + notas[linha][coluna];

		}
		notas[linha][3] = media/3;
		
		//atribuindo o valor 0 para iniciar o cálculo da media para o próximo aluno
		media=0;
	}
	
	//saída de dados
	JOptionPane.showMessageDialog (null, "Mostrando as menções");
	for (linha = 0; linha < 10; linha++) {
		for (coluna = 0; coluna < 3; coluna++) {
			JOptionPane.showMessageDialog(null,"Aluno " + (linha+1) + "\n " + (coluna+1) + "\nNúmero " + notas[linha][coluna]);
		}//fim do for
		//exibe média de aluno
		JOptionPane.showMessageDialog(null, "Média: " + notas[linha][3]);
	}//fim do for
}//fim do método main
}
