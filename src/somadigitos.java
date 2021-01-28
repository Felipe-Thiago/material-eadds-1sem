import javax.swing.JOptionPane;

public class somadigitos {

	public static void main(String[] args) {
		int num, soma = 0;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro: "));
		
		soma = (num % 10); //pega a casa das dezenas de um número
		
		while (num > 0) { //maior que 0 é maior que 10
 			num /= 10;
			soma = soma + (num%10); //soma a casa das dezenas com ela mesma
		}
		JOptionPane.showMessageDialog(null, soma);
	}

}
