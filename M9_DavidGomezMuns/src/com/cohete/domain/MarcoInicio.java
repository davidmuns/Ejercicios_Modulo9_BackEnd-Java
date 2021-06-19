package com.cohete.domain;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class MarcoInicio extends JFrame {

	public MarcoInicio() {
		LaminaMarcoInicio laminaMarcoInicio = new LaminaMarcoInicio();
		
		// Establecer tamaño del marco
		setSize(200, 200);

		// Posición marco en el centro de la pantalla
		setLocationRelativeTo(null);

		// Terminar ejecución programa al cerrar marco
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Cambiar tamaño del marco
		setResizable(false);

		setTitle("INICIO");

		// Añadir objeto lamina al marco
		add(laminaMarcoInicio);

		// Establecer visivilidad del marco
		setVisible(true);
	}
}
