import java.util.Scanner;

public class numeromaior {

	public static void main(String[] args) {
		int x = 2;
		int num;
		int maior = 0;
		int compara;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite quantos n�meros quer comparar: ");
		compara = entrada.nextInt();
		System.out.println("Insira o primeiro n�mero: " + maior);
		maior = entrada.nextInt();
		
		while (x <= compara) {
			System.out.println("Digite o " + x + "� n�mero ");
			num = entrada.nextInt();
			
			if (num > maior) {
				maior = num;
			}
			x++;
		}
		System.out.println("O maior n�mero digitado foi " + maior);
	}

}
