import javax.swing.JOptionPane;
public class exercicio0142 {
public static void main(String[] args) {
	//declara��o de vari�veis
	double notas [] [] = new double [10][4];
	int linha, coluna;
	double media = 0;
	
	//entrada de dados
	JOptionPane.showMessageDialog (null, "Inserindo os dados na Matriz");
	for (linha = 0; linha < 10; linha++) {
		for (coluna = 0; coluna < 3; coluna++) {
			notas[linha][coluna] = Double.parseDouble(JOptionPane.showInputDialog("Entre a nota do " + (linha+1) +"� "+"aluno"));
		}
	}
	
	//c�lculo da m�dia
	for (linha = 0; linha < 10; linha++) {
		for (coluna = 0; coluna < 3; coluna++) {
			media = media + notas[linha][coluna];

		}
		notas[linha][3] = media/3;
		
		//atribuindo o valor 0 para iniciar o c�lculo da media para o pr�ximo aluno
		media=0;
	}
	
	//sa�da de dados
	JOptionPane.showMessageDialog (null, "Mostrando as men��es");
	for (linha = 0; linha < 10; linha++) {
		for (coluna = 0; coluna < 3; coluna++) {
			JOptionPane.showMessageDialog(null,"Aluno " + (linha+1) + "\n " + (coluna+1) + "\nN�mero " + notas[linha][coluna]);
		}//fim do for
		//exibe m�dia de aluno
		JOptionPane.showMessageDialog(null, "M�dia: " + notas[linha][3]);
	}//fim do for
}//fim do m�todo main
}
