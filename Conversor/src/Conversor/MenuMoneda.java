package Conversor;

import javax.swing.JOptionPane;

public class MenuMoneda {

	ConversorMonedas monedas = new ConversorMonedas();
	ConversorInverso pesos = new ConversorInverso();

	public void menuPrincipal() {
		boolean salir = true;
		while (salir) {
			String menu = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Conversor de Moneda", "Conversor de Temperatura" }, "Seleccion")).toString();

			switch (menu) {
			case "Conversor de Moneda":
				String entrada = JOptionPane.showInputDialog("Ingresa la cantidad de dinero a convertir");

				if (ValidarEntrada(entrada) == true) {
					double input = Double.parseDouble(entrada);
					menuOpciones(input);

					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversion?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Vamos a realizar otra conversion");
						salir = true;
					} else {
						JOptionPane.showMessageDialog(null, "¡Gracias por usar nuestro conversor!");
						salir = false;
					}

				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;

			case "Conversor de Temperatura":
				System.out.println("Conversor de temperatura a desarrollar");
				break;
			}
		}
	}

	public void menuOpciones(double entrada) {
		String opcion = (JOptionPane.showInputDialog(null, "Seleccione una opcion", "Menu",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Conversor de Moneda a Pesos(ARG)", "Conversor de Pesos(ARG) a Moneda" }, "Seleccion"))
				.toString();

		if (opcion.equals("Conversor de Moneda a Pesos(ARG)")) {
			menuPesoAMoneda(entrada);
		} else {
			menuMonedaAPeso(entrada);
		}

	}

	public void menuPesoAMoneda(double entrada) {
		String opcion = (JOptionPane.showInputDialog(null, "Elige la moneda a convertir tus pesos(ARG)", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Dolar", "Euro", "Libras Esterlinas", "Yen", "Won" },
				"Seleccion")).toString();

		switch (opcion) {
		case "Dolar":
			monedas.ConvertirPesosADolares(entrada);
			break;
		case "Euro":
			monedas.ConvertirPesosAEuros(entrada);
			break;
		case "LibrasEsterlinas":
			monedas.ConvertirPesosALibras(entrada);
			break;
		case "Yen":
			monedas.ConvertirPesosAYen(entrada);
			break;
		case "Won":
			monedas.ConvertirPesosAWon(entrada);
			break;
		}
	}

	public void menuMonedaAPeso(double entrada) {
		String opcion = (JOptionPane.showInputDialog(null, "Elige la moneda a convertir en pesos(ARG)", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Dolar", "Euro", "Libras Esterlinas", "Yen", "Won" },
				"Seleccion")).toString();

		switch (opcion) {
		case "Dolar":
			pesos.ConvertirDolaresAPesos(entrada);
			break;
		case "Euro":
			pesos.ConvertirEurosAPesos(entrada);
			break;
		case "LibrasEsterlinas":
			pesos.ConvertirLibrasAPesos(entrada);
			break;
		case "Yen":
			pesos.ConvertirYenAPesos(entrada);
			break;
		case "Won":
			pesos.ConvertirWonAPesos(entrada);
			break;
		}
	}

	public static boolean ValidarEntrada(String entrada) {
		try {
			double x = Double.parseDouble(entrada);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
