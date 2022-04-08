package hola;

import javax.swing.JOptionPane;

public class ej13 {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Di el primer num");
		int num1 = Integer.parseInt(texto);
		texto = JOptionPane.showInputDialog("Di el segundo num");
		int num2 = Integer.parseInt(texto);
		texto = JOptionPane.showInputDialog("Di el signo aritmético");
		double resultado = 0;
		
		switch (texto) {
			case ("+"):
				resultado = num1 + num2;
				break;
			case ("-"):
				resultado = num1 - num2;
				break;
			case ("*"):
				resultado = num1 * num2;
				break;
			case ("/"):
				resultado = num1 / num2;
				break;
			case ("^"):
				resultado = Math.pow(num1, num2);
				break;
			case ("%"):
				resultado = num1 % num2;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Signo aritmetico Fallat");
		}
		JOptionPane.showMessageDialog(null, "Resultado " + resultado);
	}

}
