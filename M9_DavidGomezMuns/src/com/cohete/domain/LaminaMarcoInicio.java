package com.cohete.domain;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LaminaMarcoInicio extends JPanel {

	JButton botonCohete1 = new JButton("Cohete1");
	JButton botonCohete2 = new JButton("Cohete2");

	public LaminaMarcoInicio() {
		setLayout(null);

		setBackground(Color.DARK_GRAY);
		
		botonCohete1.setBounds(50, 30, 100, 40);
		botonCohete2.setBounds(50, 100, 100, 40);
		
		add(botonCohete1);
		add(botonCohete2);
		
		botonCohete1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
		
				eventoBoton(e);

			}
		});

		botonCohete2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				eventoBoton(e);

			}
		});
	}
	private void eventoBoton(ActionEvent e) {
		String codigoCohete;
		int marcoPosicionX;
		
		if(e.getSource() == botonCohete1) {
			
			codigoCohete = "32WESSDS";
			marcoPosicionX = 50;
			int [] potenciaPropulsores = { 10, 30, 80 };
			
			CoheteMasMarco.crear(codigoCohete, potenciaPropulsores, marcoPosicionX);	
			
			botonCohete1.setEnabled(false);
			
		}else if(e.getSource() == botonCohete2) {
			
			codigoCohete = "LDSFJA32";
			marcoPosicionX = 820;
			int[] potenciaPropulsores = { 30, 40, 50, 50, 30, 10 };
			
			CoheteMasMarco.crear(codigoCohete, potenciaPropulsores, marcoPosicionX);
			
			botonCohete2.setEnabled(false);
		}
	}
}
