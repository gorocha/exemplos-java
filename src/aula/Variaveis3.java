package aula;

import javax.swing.JOptionPane;

public class Variaveis3 {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
			System.out.println("i = " + i);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
