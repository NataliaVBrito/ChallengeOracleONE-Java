package Conversor;

import javax.swing.JOptionPane;

public class ConversorMonedas {

	public void ConvertirPesosADolares(double valor) {
		double dolar = valor / 286.87;
		dolar = (double)Math.round(dolar * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes " + dolar + "USD");
	}
	
	public void ConvertirPesosAEuros(double valor) {
		double euro = valor / 314.54;
		euro = (double) Math.round(euro * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes " + euro + "€");
	}
	
	public void ConvertirPesosALibras(double valor) {
		double libra = valor / 364.15;
		libra = (double) Math.round(libra * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes " + libra + "£");
	}
	
	public void ConvertirPesosAYen(double valor) {
		double yen = valor / 1.98;
		yen = (double) Math.round(yen * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes " + yen + "¥");
	}
	
	public void ConvertirPesosAWon(double valor) {
		double won = valor / 0.22;
		won = (double) Math.round(won * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes " + won + "₩");
	}
	
	

}
