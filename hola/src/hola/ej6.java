package hola;

import javax.swing.JOptionPane;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textoNum =  JOptionPane.showInputDialog("Di el precio");
		double precio = Double.parseDouble(textoNum), pFinal;
		final double IVA = 0.21;
		
		pFinal = precio + (precio * IVA);
		
		JOptionPane.showMessageDialog(null, "El precio final es " + pFinal);
	}

}
