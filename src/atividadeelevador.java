import java.util.Scanner;

public class atividadeelevador {

	public static void main(String[] args) {
		int i = 0;
		String elevador;
		String periodo;
		int maisusado = 0;
		int A = 0;
		int B = 0;
		int C = 0;
		int M = 0;
		int V = 0;
		int N = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("==========================================");
		System.out.println("Levantamento sobre os Elevadores do pr�dio");
		System.out.println("==========================================");
		do {
			i = i + 1;

			System.out.println("- - - - - Por favor, responda: - - - - - -");
			
			System.out.println("Qual � o elevador que voc� mais usa? (A, B ou C)");
			elevador = ler.next();
			
			if (elevador.equals("A")) {
				A = A + 1;
			} else {	
				if (elevador.equals("B")) {
					B = B + 1;
				} else {
					if (elevador.equals("C")) {
						C = C + 1;
					} else {
						System.out.println("Elevador n�o existente.");
					}
				}
			}
			
			System.out.println("Qual � o per�odo em que voc� mais o usa? (Matutino - M, Vespertino - V e Noturno - N)");
			periodo = ler.next();
			
			if (periodo.equals("M")) {
				M = M + 1;
			} else {	
				if (periodo.equals("V")) {
					V = V + 1;
				} else {
					if (periodo.equals("N")) {
						N = N + 1;
					} else {
						System.out.println("Per�odo n�o existente.");
					}
				}
			}
		
		} while (i <= 5);
		
		if(A > B) {
			System.out.println("O elevador mais usado � o A");
		} else {
			if (B > A) {
				System.out.println("O elevador mais usado � o B");
			} else {
				if (C > A) {
					System.out.println("O elevador mais usado � o C");
				} 
				
			}
		} 
			
	}

}
