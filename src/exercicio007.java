import javax.swing.JOptionPane;
public class exercicio007 {

	public static void main(String[] args) {
		int dia;
		
		//entrada de dados com convers�o de tipos juntas 
		dia = Integer.parseInt(JOptionPane.showInputDialog("Entre com um n�mero de 1 a 7:"));
		
		//processamento
		if (dia == 1) {
			JOptionPane.showMessageDialog(null, "Voc� escolheu Domingo.");
		} else {
			if (dia == 2) {
				JOptionPane.showMessageDialog(null, "Voc� escolheu Segunda-Feira.");
			} else {
				if (dia == 3) {
					JOptionPane.showMessageDialog(null, "Voc� escolheu Ter�a-Feira.");
				} else {
					if (dia == 4) {
						JOptionPane.showMessageDialog(null, "Voc� escolheu Quarta-Feira.");
					} else {
						if (dia == 5) {
							JOptionPane.showMessageDialog(null, "Voc� escolheu Quinta-Feira.");
						} else {
							if (dia == 6) {
								JOptionPane.showMessageDialog(null, "Voc� escolheu Sexta-Feira.");
							} else {
								if (dia == 7) {
									JOptionPane.showMessageDialog(null, "Voc� escolheu S�bado.");
								} else {
									JOptionPane.showMessageDialog(null, "N�mero Inv�lido.");
								}
							}
						}
					}
				}
			}
		}
	}

}
