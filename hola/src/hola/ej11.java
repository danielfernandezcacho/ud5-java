package hola;

import javax.swing.JOptionPane;

public class ej11 {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog("Di un dia de la semana").toLowerCase();
		boolean laboral = true; // Inicializo el boolean a true

		switch (texto) {
			case ("sabado"):
				laboral = false;
				break;
			case ("domingo"):
				laboral = false;
				break;
		}
		
		if (laboral) {
			JOptionPane.showMessageDialog(null, "Es un dia laboral");
		}
		else {
			JOptionPane.showMessageDialog(null, "No es un dia laboral");
		}
	}

}
