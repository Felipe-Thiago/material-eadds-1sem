import javax.swing.JOptionPane;

public class exercicio0133 {

	public static void main(String[] args) {
		int[] valores = new int[20];
		int i;
		String num = " ";
		int mult;
		
		for (i=0;i<20;i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (i + 1) + "º valor inteiro: "));
		}
		
		num = "Os números digitados foram: ";
		
		for (i=0;i<20;i++) {
			if (valores[i]%2==0) {
				mult = valores[i]*2;
				num = num + String.valueOf(mult) + " ";
			} else {
				num = num + String.valueOf(valores[i]) + " ";
			}
		}
		JOptionPane.showMessageDialog(null, num);
	}

}
