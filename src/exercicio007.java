import javax.swing.JOptionPane;
public class exercicio007 {

	public static void main(String[] args) {
		int dia;
		
		//entrada de dados com conversão de tipos juntas 
		dia = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número de 1 a 7:"));
		
		//processamento
		if (dia == 1) {
			JOptionPane.showMessageDialog(null, "Você escolheu Domingo.");
		} else {
			if (dia == 2) {
				JOptionPane.showMessageDialog(null, "Você escolheu Segunda-Feira.");
			} else {
				if (dia == 3) {
					JOptionPane.showMessageDialog(null, "Você escolheu Terça-Feira.");
				} else {
					if (dia == 4) {
						JOptionPane.showMessageDialog(null, "Você escolheu Quarta-Feira.");
					} else {
						if (dia == 5) {
							JOptionPane.showMessageDialog(null, "Você escolheu Quinta-Feira.");
						} else {
							if (dia == 6) {
								JOptionPane.showMessageDialog(null, "Você escolheu Sexta-Feira.");
							} else {
								if (dia == 7) {
									JOptionPane.showMessageDialog(null, "Você escolheu Sábado.");
								} else {
									JOptionPane.showMessageDialog(null, "Número Inválido.");
								}
							}
						}
					}
				}
			}
		}
	}

}
