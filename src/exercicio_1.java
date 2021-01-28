import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// fazer uma soma simples entre dois numeros
		//declaração das variáveis
		int numero1;
		int numero2;
		int soma;
		//habilitação do leitor
		Scanner leitor = new Scanner(System.in);
		//programa
		System.out.println("Esse programa fará a soma entre dois números.");
		System.out.println("Informe o primeiro valor.");
		numero1 = leitor.nextInt();
		System.out.println("Informe o segundo valor.");
		numero2 = leitor.nextInt();
		//processamento
		soma = numero1 + numero2;
		//saída
		System.out.println("O resultado da soma é " + soma);
	}

}
