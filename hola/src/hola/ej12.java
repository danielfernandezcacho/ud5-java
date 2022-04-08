package hola;

import javax.swing.JOptionPane;

public class ej12 {

	public static void main(String[] args) {
		String password = "hola", prueva;
		int intentos;
		boolean flag = false;
		
		for (intentos = 3; intentos != 0 && !flag; intentos--) {
			prueva = JOptionPane.showInputDialog("Fica la password");
			if (prueva.equals(password)) {
				flag = true;
			}
		}
		
		if (intentos == 0) {
			JOptionPane.showMessageDialog(null, "Cuenta xapada");
	}
		else {
		JOptionPane.showMessageDialog(null, "Enhorabona");
		}

	}

}
