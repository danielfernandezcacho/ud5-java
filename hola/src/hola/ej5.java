package hola;

import javax.swing.JOptionPane;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textoNum =  JOptionPane.showInputDialog("Di un numero");
		int num = Integer.parseInt(textoNum);
		
		if (num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Es divisible entre 2");
		}
		else {
			JOptionPane.showMessageDialog(null, "No es divisible entre 2");
		}
	}

}
