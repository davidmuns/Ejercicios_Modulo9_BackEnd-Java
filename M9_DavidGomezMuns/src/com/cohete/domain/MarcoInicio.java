package com.cohete.domain;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class MarcoInicio extends JFrame {

	public MarcoInicio() {
		LaminaMarcoInicio laminaMarcoInicio = new LaminaMarcoInicio();
		
		// Establecer tama�o del marco
		setSize(200, 200);

		// Posici�n marco en el centro de la pantalla
		setLocationRelativeTo(null);

		// Terminar ejecuci�n programa al cerrar marco
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Cambiar tama�o del marco
		setResizable(false);

		setTitle("INICIO");

		// A�adir objeto lamina al marco
		add(laminaMarcoInicio);

		// Establecer visivilidad del marco
		setVisible(true);
	}
}
