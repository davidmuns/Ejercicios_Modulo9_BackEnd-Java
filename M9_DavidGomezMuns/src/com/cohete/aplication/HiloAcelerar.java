package com.cohete.aplication;
import com.cohete.domain.Propulsor;

public class HiloAcelerar extends Thread{
	private Propulsor propulsor;

	public HiloAcelerar(Propulsor propulsor) {
		this.propulsor = propulsor;
	}

	public void run() {
		for (int i = propulsor.getPotenciaActual(); i <= propulsor.getPotenciaMaxima(); i++) {	
			try {
				propulsor.setPotenciaActual(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				break;
			}
		}
	}
}