package com.cohete.domain;

import javax.swing.JFrame;
import com.cohete.aplication.LaminaControlCohete;

@SuppressWarnings("serial")
public class MarcoCohete extends JFrame{

	public MarcoCohete(Cohete cohete, int xPosition) {
		this.setBounds(xPosition, 265, 500, 200);
		
		setTitle("Panel de control");	
		
		LaminaControlCohete laminaControlCohete = new LaminaControlCohete(cohete);
		laminaControlCohete.setBounds(0, 0, 490, 170);
		add(laminaControlCohete); //Añadir laminaControlCohete a MarcoCohete 
		
		setResizable(false);
		
		setLayout(null);

		setVisible(true);	
	}
}
