import java.util.Scanner;

public class AtividadeAlunos {

	public static void main(String[] args) {
		double n1, n2, media;
		n1 = 0;
		n2 = 0;
		
		Scanner ler = new Scanner(System.in);
		for (int i=0; i<=30; i++) {
			System.out.println("Digite a primeira nota: " + n1);
			n1 = ler.nextDouble();
			
			System.out.println("Digite a segunda nota: " + n2);
			n2 = ler.nextDouble();
			
			media = (n1 + n2)/2;
			if (media >= 7.0) {
				System.out.println("Sua situação é: Aprovada " + media);
			} else {
				System.out.println("Sua situação é: Reprovada " + media);
			}
		}

	}

}
