import javax.swing.JOptionPane;

public class atividadeelevador2 {

	public static void main(String[] args) {
		int i = 0;
		String elevador;
		String periodo;
		int periodomaior = 0;
		int A = 0;
		int B = 0;
		int C = 0;
		int M = 0;
		int V = 0;
		int N = 0;
		
		JOptionPane.showMessageDialog(null, "Levantamento sobre os elevadores do pr�dio \nPor favor responda:");
		do {
			elevador = JOptionPane.showInputDialog("Qual � o elevador que voc� mais usa? (A, B ou C)");
			
			if (elevador.equals("A")) {
				A = A + 1;
				periodo = JOptionPane.showInputDialog("Em qual per�odo voc� utiliza esse elevador? (M, V ou N)");
				if (periodo.equals("M")) {
					M = M + 1;
				} else {
					if (periodo.equals("V")) {
						V = V + 1;
					} else {
						if (periodo.equals("N")) {
							N = N + 1;
						} else {
							JOptionPane.showMessageDialog(null, "Per�odo n�o existente.", "E R R O", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
				
			} else {
				if (elevador.equals("B")) {
					B = B + 1;
					periodo = JOptionPane.showInputDialog("Em qual per�odo voc� utiliza esse elevador? (M, V ou N)");
					if (periodo.equals("M")) {
						M = M + 1;
					} else {
						if (periodo.equals("V")) {
							V = V + 1;
						} else {
							if (periodo.equals("N")) {
								N = N + 1;
							} else {
								JOptionPane.showMessageDialog(null, "Per�odo n�o existente.", "E R R O", JOptionPane.ERROR_MESSAGE);
							}
						}
					}
					
				} else {
					if (elevador.equals("C")) {
						C = C + 1;
						periodo = JOptionPane.showInputDialog("Em qual per�odo voc� utiliza esse elevador? (M, V ou N)");
						if (periodo.equals("M")) {
							M = M + 1;
						} else {
							if (periodo.equals("V")) {
								V = V + 1;
							} else {
								if (periodo.equals("N")) {
									N = N + 1;
								} else {
									JOptionPane.showMessageDialog(null, "Per�odo n�o existente.", "E R R O", JOptionPane.ERROR_MESSAGE);
								}
							}
						}
						
					} else {
						JOptionPane.showMessageDialog(null,"Elevador n�o existente.", "E R R O", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
			
			i++;
			
		} while (i <= 50);
		
		//Muitos ifs abaixo pois n�o tive dificuldades para fazer de outras formas
		if(A > B && M > V) {
			JOptionPane.showMessageDialog(null, "O elevador mais usado � o A no per�odo Matutino.");
		} else {
			if (B > A && M > V) {
				JOptionPane.showMessageDialog(null,"O elevador mais usado � o B no per�odo Matutino");
			} else {
				if (C > A && M > V) {
					JOptionPane.showMessageDialog(null,"O elevador mais usado � o C no per�odo Matutino");
				} else {
					if (A > B && V > M) {
						JOptionPane.showMessageDialog(null, "O elevador mais usado � o A no per�odo Vespertino.");
					} else {
						if (A > B && N > M) {
							JOptionPane.showMessageDialog(null, "O elevador mais usado � o A no per�odo Noturno.");
						} else {
							if (B > A && V > M) {
								JOptionPane.showMessageDialog(null, "O elevador mais usado � o B no per�odo Vespertino.");
							} else {
								if (B > A && N > M) {
									JOptionPane.showMessageDialog(null, "O elevador mais usado � o B no per�odo Noturno.");
								} else {
									if (C > A && V > M) {
										JOptionPane.showMessageDialog(null, "O elevador mais usado � o C no per�odo Vespertino.");
									} else {
										if (C > A && N > M) {
											JOptionPane.showMessageDialog(null, "O elevador mais usado � o C no per�odo Noturno.");
										}
									}
								}
							}
						}
					}
				}
			}
		} 

		if (periodomaior < A && periodomaior < M) {
			JOptionPane.showMessageDialog(null, "O maior per�odo � o matutino e pertence ao elevador A");
		} else {
			if (periodomaior < A && periodomaior < V) {
				JOptionPane.showMessageDialog(null, "O maior per�odo � o vespertino e pertence ao elevador A");
			} else {
				if (periodomaior < A && periodomaior < N) {
					JOptionPane.showMessageDialog(null, "O maior per�odo � o noturno e pertence ao elevador A");
				} else {
					if (periodomaior < B && periodomaior < M) {
						JOptionPane.showMessageDialog(null, "O maior per�odo � o matutino e pertence ao elevador B");
					} else {
						if (periodomaior < B && periodomaior < V) {
							JOptionPane.showMessageDialog(null, "O maior per�odo � o vespertino e pertence ao elevador B");
						} else {
							if (periodomaior < B && periodomaior < N) {
								JOptionPane.showMessageDialog(null, "O maior per�odo � o noturno e pertence ao elevador B");
							} else {
								if (periodomaior < C && periodomaior < M) {
									JOptionPane.showMessageDialog(null, "O maior per�odo � o matutino e pertence ao elevador C");
								} else {
									if (periodomaior < C && periodomaior < V) {
										JOptionPane.showMessageDialog(null, "O maior per�odo � o vespertino e pertence ao elevador C");
									} else {
										if (periodomaior < C && periodomaior < N) {
											JOptionPane.showMessageDialog(null, "O maior per�odo � o noturno e pertence ao elevador ");
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
	}
}
