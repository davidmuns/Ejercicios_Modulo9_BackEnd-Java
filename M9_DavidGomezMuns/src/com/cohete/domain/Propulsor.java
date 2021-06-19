package com.cohete.domain;


public class Propulsor {
	
	private int potenciaActual;
	private int potenciaMaxima;
	private Thread thread;
	
	
	public Propulsor(int potencia) {
		this.potenciaMaxima = potencia;
	}
	
	public Thread getHilo() {
		return thread;
	}
	
	public void setHilo(Runnable r) {
		thread = new Thread(r);
	}
	
	public int getPotenciaActual() {
		return potenciaActual;
	}

	public void setPotenciaActual(int potenciaActual) {
		this.potenciaActual = potenciaActual;
	}

	public int getPotenciaMaxima() {
		return potenciaMaxima;
	}

	@Override
	public String toString() {
		return "Actual=" + potenciaActual + ", Maxima=" + potenciaMaxima;
	}
	
}
