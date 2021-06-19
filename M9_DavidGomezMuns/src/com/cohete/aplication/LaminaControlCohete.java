package com.cohete.aplication;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.cohete.domain.Cohete;
import com.cohete.domain.Propulsor;


@SuppressWarnings("serial")
public class LaminaControlCohete extends JPanel {

	JButton botonAcelerar = new JButton("Acelerar");
	JButton botonFrenar = new JButton("Frenar");
	JButton botonParar = new JButton("Parar");
	Cohete cohete;
	
	public LaminaControlCohete(Cohete cohete) {
		this.cohete = cohete;
		
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		Font tipoFuente2 = new Font("Arial", Font.BOLD, 20);
		
		JLabel tagCohete = new JLabel("COHETE: " + cohete.getCode(), SwingConstants.CENTER);
		tagCohete.setFont(tipoFuente2);
		tagCohete.setForeground(Color.ORANGE);
		tagCohete.setBounds(0, 0, 500, 100);				
		add(tagCohete); // Añadir etiqueta a LaminaControlCohete
		
		botonFrenar.setBounds(200, 100, 100, 40);
		botonAcelerar.setBounds(50, 100, 100, 40);
		botonParar.setBounds(350, 100, 100, 40);
		
		//Añadir botones a LaminaControlCohete
		add(botonFrenar);
		add(botonAcelerar);
		add(botonParar);

		botonFrenar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eventoBoton(e);
			}
		});

		botonAcelerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eventoBoton(e);
			}
		});
		
		botonParar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eventoBoton(e);
			}
		});
	}
	private void eventoBoton(ActionEvent e) {
		if(e.getSource() == botonAcelerar) {
			for(Propulsor propulsor: cohete.getPropulsores()) {
				if(propulsor.getHilo() != null) {
					propulsor.getHilo().interrupt();
				}
				propulsor.setHilo(new HiloAcelerar(propulsor));
				propulsor.getHilo().start();
				
				Thread velocidad = new HiloVelocidad(cohete);
				velocidad.start();
			}		
		}else if(e.getSource() == botonFrenar) {
			for(Propulsor propulsor: cohete.getPropulsores()) {
				if(propulsor.getHilo() != null) {
					propulsor.getHilo().interrupt();
				}
				propulsor.setHilo(new HiloFrenar(propulsor));
				propulsor.getHilo().start();
			}
		}else if(e.getSource() == botonParar) {
			for(Propulsor propulsor: cohete.getPropulsores()) {
				propulsor.getHilo().interrupt();
			}
		}	
	}
}
