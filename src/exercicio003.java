import javax.swing.JOptionPane;

public class exercicio003 {
	public static void main(String[] args) {
		String auxiliar;
		int numeroInteiro;
		double numerodouble;
		float numerofloat;
		
		auxiliar = JOptionPane.showInputDialog("Entre com um número inteiro");
		
		//conversão de string pra inteiro - Integer.parseInt
		 numeroInteiro = Integer.parseInt(auxiliar);
		 numerodouble = Double.parseDouble(auxiliar);
		 numerofloat = Float.parseFloat(auxiliar);
		 
		 //mensagem saída
		 JOptionPane.showMessageDialog(null, "O número inteiro é " + numeroInteiro);
		 JOptionPane.showMessageDialog(null, "O número double é " + numerodouble);
		 JOptionPane.showMessageDialog(null, "O número float é " + numerofloat);
	}
}
