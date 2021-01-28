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
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			contagem++;
			soma = soma + num;
		}
		media = soma/10;
		System.out.println("A soma dos números é de: " + soma);
		System.out.println("A média dos números somados é de: " + media);
	}

}
