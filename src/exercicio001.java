import java.util.Scanner;

public class exercicio001 {
	public static void main(String[] str) {
		String nome;
		String telefone;
		String serie;
		String media;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("T�cnico em Inform�tica EAD");
		System.out.println("Informe seu nome.");
		nome = leitor.next();
		System.out.println("Informe seu telefone.");
		telefone = leitor.next();
		System.out.println("Informe sua s�rie.");
		serie = leitor.next();
		System.out.println("Informe sua m�dia.");
		media = leitor.next();
		
		System.out.println("--------------------------- T�cnico em Inform�tica EaD ---------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("S�rie: " + serie);
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("M�dia: " + media);
		System.out.println("------------------------------------------------------------------------------------------------");
	}
}
