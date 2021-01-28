import javax.swing.JOptionPane;

public class exercicio013 {

	public static void main(String[] args) {
		String [] convidados = new String[10];
		int i;
		String listaladoesq = "";
		String listaladodir = "";
		
		for (i=0;i<10;i++) {
			convidados[i] = JOptionPane.showInputDialog("Nome do " + (i + 1) + "º convidado.");
		}
		
		listaladoesq = "Lista de convidados ao lado esquerdo: \n";
		listaladodir = "Lista de convidados ao lado direito: \n";
		
		for (i=0;i<10;i++) {
			if (i%2==0) {
				listaladoesq = listaladoesq + convidados[i] + "\n";
			} else {
				listaladodir = listaladodir + convidados[i] + "\n";
			}
		}
		
		JOptionPane.showMessageDialog(null, listaladoesq + "\n\n\n" + listaladodir);
	
	}

}
