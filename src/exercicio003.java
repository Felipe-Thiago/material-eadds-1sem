import javax.swing.JOptionPane;

public class exercicio003 {
	public static void main(String[] args) {
		String auxiliar;
		int numeroInteiro;
		double numerodouble;
		float numerofloat;
		
		auxiliar = JOptionPane.showInputDialog("Entre com um n�mero inteiro");
		
		//convers�o de string pra inteiro - Integer.parseInt
		 numeroInteiro = Integer.parseInt(auxiliar);
		 numerodouble = Double.parseDouble(auxiliar);
		 numerofloat = Float.parseFloat(auxiliar);
		 
		 //mensagem sa�da
		 JOptionPane.showMessageDialog(null, "O n�mero inteiro � " + numeroInteiro);
		 JOptionPane.showMessageDialog(null, "O n�mero double � " + numerodouble);
		 JOptionPane.showMessageDialog(null, "O n�mero float � " + numerofloat);
	}
}
