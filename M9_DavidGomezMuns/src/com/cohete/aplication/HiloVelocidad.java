package com.cohete.aplication;

import com.cohete.domain.Cohete;
import com.cohete.domain.Propulsor;

public class HiloVelocidad extends Thread {
	private Cohete cohete;
	
	public HiloVelocidad(Cohete cohete) {
		this.cohete = cohete;
	}

	public void run() {
		int potenciaTotal;
		try {
			while (true) {
				potenciaTotal = 0;
				Thread.sleep(2000); 
				for (Propulsor p : cohete.getPropulsores()) {
					potenciaTotal += p.getPotenciaActual();
					cohete.setVelocidad(potenciaTotal);
					System.out.println(cohete);
				}
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
