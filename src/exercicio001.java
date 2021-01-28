import java.util.Scanner;

public class exercicio001 {
	public static void main(String[] str) {
		String nome;
		String telefone;
		String serie;
		String media;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Técnico em Informática EAD");
		System.out.println("Informe seu nome.");
		nome = leitor.next();
		System.out.println("Informe seu telefone.");
		telefone = leitor.next();
		System.out.println("Informe sua série.");
		serie = leitor.next();
		System.out.println("Informe sua média.");
		media = leitor.next();
		
		System.out.println("--------------------------- Técnico em Informática EaD ---------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("Série: " + serie);
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Média: " + media);
		System.out.println("------------------------------------------------------------------------------------------------");
	}
}
