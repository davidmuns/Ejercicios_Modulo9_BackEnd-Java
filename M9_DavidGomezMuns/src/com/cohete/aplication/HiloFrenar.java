package com.cohete.aplication;
import com.cohete.domain.Propulsor;

public class HiloFrenar extends Thread {
	private Propulsor propulsor;

	public HiloFrenar(Propulsor propulsor) {
		this.propulsor = propulsor;
	}

	public void run() {
		for (int i = propulsor.getPotenciaActual(); i >= 0; i--) {	
			try {
				propulsor.setPotenciaActual(i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				break;
			}
		}
	}
}