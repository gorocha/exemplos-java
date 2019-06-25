package aula;

import javax.swing.JOptionPane;

public class Variaveis3 {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			System.out.println("i = " + i);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
