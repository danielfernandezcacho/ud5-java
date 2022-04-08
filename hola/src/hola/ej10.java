package hola;

import javax.swing.JOptionPane;

public class ej10 {

	public static void main(String[] args) {
		String textoNum = JOptionPane.showInputDialog("Di el numero de ventas");
		int i, ventas = Integer.parseInt(textoNum);
		double pFinal = 0, precio;
		
		for (i = 0; i < ventas; i++) {
			textoNum = JOptionPane.showInputDialog("Di el precio");
			precio = Integer.parseInt(textoNum);
			pFinal += precio;
		}
		
		JOptionPane.showMessageDialog(null, "El precio final es " + pFinal);

	}

}
