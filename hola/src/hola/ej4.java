package hola;

import javax.swing.JOptionPane;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double radio, area;
			String textoNum = JOptionPane.showInputDialog("Di el radio del circulo");
			
			radio = Double.parseDouble(textoNum);
			
			area = Math.PI * Math.pow(radio, 2);
			
			JOptionPane.showMessageDialog(null, "El área es = " + area);
	}
}
