import java.util.Scanner;

public class media50nums {

	public static void main(String[] args) {
		int num, soma, media;
		int contagem;
		num = 0;
		contagem = 0;
		soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		while (contagem < 10) {
			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();
			contagem++;
			soma = soma + num;
		}
		media = soma/10;
		System.out.println("A soma dos n�meros � de: " + soma);
		System.out.println("A m�dia dos n�meros somados � de: " + media);
	}

}
