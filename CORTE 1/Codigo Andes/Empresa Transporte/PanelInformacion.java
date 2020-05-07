/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n2_empresaTransporte
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.empresaTransporte.interfaz;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import uniandes.cupi2.empresaTransporte.mundo.Camion;
import uniandes.cupi2.empresaTransporte.mundo.EmpresaTransporte;

/**
 * Panel para mostrar la información general del barco.
 */
@SuppressWarnings("serial")
public class PanelInformacion extends JPanel {

	// ------------------------------------------------------------
	// Atributos de interfaz
	// ------------------------------------------------------------

	/**
	 * Etiqueta Total de carga.
	 */
	private JLabel lblCargaTotal;

	/**
	 * Etiqueta Promedio carga.
	 */
	private JLabel lblPromedioCarga;

	/**
	 * Etiqueta total de la gasolina.
	 */
	private JLabel lblConsumoTotalGasolina;

	/**
	 * Etiqueta promedio de la gasolina.
	 */
	private JLabel lblConsumoPromedioGasolina;

	/**
	 * Campo de texto para el total de la carga.
	 */
	private JTextField txtTotalCarga;

	/**
	 * Campo de texto para el promedio de carga por camión.
	 */
	private JTextField txtPromedioCarga;

	/**
	 * Campo de texto para el consumo total de gasolina
	 */
	private JTextField txtTotalConsumoGasolina;

	/**
	 * Campo de texto para promedio de la gasolina
	 */
	private JTextField txtPrecioTotalGasolina;

	// ------------------------------------------------------------
	// Constructor
	// ------------------------------------------------------------

	/**
	 * Constructor del panel de información de la empresa de transporte.
	 */
	public PanelInformacion() {
		setLayout(new GridLayout(4, 5, 5, 5));

		setBorder(new CompoundBorder(new EmptyBorder(4, 3, 3, 3), new TitledBorder("Información")));

		lblCargaTotal = new JLabel("Carga total:");
		add(lblCargaTotal);
		txtTotalCarga = new JTextField();
		txtTotalCarga.setEditable(false);
		add(txtTotalCarga);

		lblPromedioCarga = new JLabel("Carga promedio:");
		add(lblPromedioCarga);
		txtPromedioCarga = new JTextField();
		txtPromedioCarga.setEditable(false);
		add(txtPromedioCarga);

		lblConsumoTotalGasolina = new JLabel("Consumo total de gasolina");
		add(lblConsumoTotalGasolina);
		txtTotalConsumoGasolina = new JTextField();
		txtTotalConsumoGasolina.setEditable(false);
		add(txtTotalConsumoGasolina);

		lblConsumoPromedioGasolina = new JLabel("Precio de gasolina total [$9702/gal]");
		add(lblConsumoPromedioGasolina);
		txtPrecioTotalGasolina = new JTextField();
		txtPrecioTotalGasolina.setEditable(false);
		add(txtPrecioTotalGasolina);
	}

	// ------------------------------------------------------------
	// Métodos
	// ------------------------------------------------------------

	/**
	 * Actualiza el panel.
	 * 
	 * @param pCargaTotal    Carga total de los 4 camiones. pCargaTotal >= 0.
	 * @param pCargaPromedio Promedio de carga por camión. pCargaPromedio >= 0.
	 */
	public void actualizarInformacion(int pCargaTotal, double pCargaPromedio) {
		txtTotalCarga.setText(pCargaTotal + " Kg.");
		txtPromedioCarga.setText(pCargaPromedio + " Kg.");
	}

	/**
	 * Actualiza el panel.
	 * 
	 * @param Camion c Objeto del camión cargado según la matrícula.
	 * @param opcion parámetro cargado para realizar operación en el switch.
	 * Case 1: Realiza la sumatoria de precio de gasolina y su consumo total por cada camión cargado
	 * Case 2: Realiza la resta de precio de gasolina y su consumo por cada camión descargado
	 */
	static double acumulador = 0;
	static double precioGasolina = 0;
	
	public void actualizarInformacion_Consumo_precio(Camion c, int opcion) {
		double consumo = c.darConsumo();
		double precioGasolina_galon = 9702;
		String sumatoria = String.valueOf(acumulador);
		switch (opcion) {
		case 1:
			acumulador = acumulador + consumo;
			sumatoria = String.valueOf(acumulador);
			txtTotalConsumoGasolina.setText(sumatoria + " gal/Km");
			precioGasolina = precioGasolina_galon * Double.parseDouble(sumatoria);
			txtPrecioTotalGasolina.setText("$ " + precioGasolina);
			break;
		case 2:
			acumulador = acumulador - consumo;
			txtTotalConsumoGasolina.setText(acumulador + " gal/Km");
			precioGasolina = precioGasolina - (consumo * precioGasolina_galon);
			txtPrecioTotalGasolina.setText("$ " + (precioGasolina));
			break;
		default:
			break;
		}
	}
}