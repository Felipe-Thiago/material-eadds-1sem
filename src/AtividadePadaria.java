import java.util.Scanner;

public class AtividadePadaria {

	public static void main(String[] args) {
		double preco, desconto;
		String produto;
		
		preco = 0;
		desconto = preco;
		
		Scanner ler = new Scanner(System.in);
		for (int i=0; i<10; i++) {
			System.out.print("Informe o produto desejado: ");
			produto = ler.next();
			System.out.print("Informe o preço do produto: R$");
			preco = ler.nextDouble();
			desconto = preco/2;
			System.out.println("Você poderá comprar " + produto + " por R$" + desconto);
		}
	}

}
