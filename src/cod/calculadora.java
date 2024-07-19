package cod;

import javax.swing.JOptionPane;

public class calculadora {
	public static void main(String[] args) {
		double num1, num2;
		int opcion;
		boolean condicion = true;
		
		while (condicion) {
			String opcionstr = JOptionPane.showInputDialog(
					"Elige la opcion a realizar:\n"
					+ "1.-Suma\n"
					+ "2.-Resta\n"
					+ "3.-Multiplicacion\n"
					+ "4.-Division\n"
					+ "5.-Salir"
					);
			opcion = Integer.parseInt(opcionstr);
			
			switch (opcion) {
			case 1:
				num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa primer valor"));
				num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa primer valor"));
				double suma = num1 + num2;
				JOptionPane.showMessageDialog(null, "El resultado es: " + suma);
				break;
				
				
			case 2:
				num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa primer valor"));
				num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa primer valor"));
				double rest = num1 - num2;
				JOptionPane.showMessageDialog(null, "El resultado es: " + rest);
				break;
				
			case 3:
				num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa primer valor"));
				num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa primer valor"));
				double mult = num1 * num2;
				JOptionPane.showMessageDialog(null, "El resultado es: " + mult);
				break;
				
			case 4:
				num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa primer valor"));
				num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa primer valor"));
				double div = num1 / num2;
				JOptionPane.showMessageDialog(null, "El resultado es: " + div);
				break;

			case 5:
				condicion = false;
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "Numero invalido");
			}
		}
		JOptionPane.showMessageDialog(null, "Hasta pronto");
	}
}



