import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// fazer uma soma simples entre dois numeros
		//declara��o das vari�veis
		int numero1;
		int numero2;
		int soma;
		//habilita��o do leitor
		Scanner leitor = new Scanner(System.in);
		//programa
		System.out.println("Esse programa far� a soma entre dois n�meros.");
		System.out.println("Informe o primeiro valor.");
		numero1 = leitor.nextInt();
		System.out.println("Informe o segundo valor.");
		numero2 = leitor.nextInt();
		//processamento
		soma = numero1 + numero2;
		//sa�da
		System.out.println("O resultado da soma � " + soma);
	}

}
