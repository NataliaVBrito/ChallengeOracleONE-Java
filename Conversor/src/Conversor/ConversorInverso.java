package Conversor;

import javax.swing.JOptionPane;

public class ConversorInverso {

	public void ConvertirDolaresAPesos(double valor) {
		double dolar = valor * 286.87;
		dolar = (double) Math.round(dolar * 100d) / 100;

		JOptionPane.showMessageDialog(null, "Tienes " + dolar + "Pesos(ARG)");
	}

	public void ConvertirEurosAPesos(double valor) {
		double euro = valor * 314.54;
		euro = (double) Math.round(euro * 100d) / 100;

		JOptionPane.showMessageDialog(null, "Tienes " + euro + "Pesos(ARG)");
	}

	public void ConvertirLibrasAPesos(double valor) {
		double libra = valor * 364.15;
		libra = (double) Math.round(libra * 100d) / 100;

		JOptionPane.showMessageDialog(null, "Tienes " + libra + "Pesos(ARG)");
	}

	public void ConvertirYenAPesos(double valor) {
		double yen = valor * 1.98;
		yen = (double) Math.round(yen * 100d) / 100;

		JOptionPane.showMessageDialog(null, "Tienes " + yen + "Pesos(ARG)");
	}

	public void ConvertirWonAPesos(double valor) {
		double won = valor * 0.22;
		won = (double) Math.round(won * 100d) / 100;

		JOptionPane.showMessageDialog(null, "Tienes " + won + "Pesos(ARG)");
	}
}
