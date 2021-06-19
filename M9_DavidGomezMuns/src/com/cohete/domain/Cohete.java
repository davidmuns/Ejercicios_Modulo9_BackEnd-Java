package com.cohete.domain;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Cohete {
	private String code;
	private ArrayList<Propulsor> propulsores = new ArrayList<Propulsor>();
	private double velocidad;
	private DecimalFormat df = new DecimalFormat("##,###.#");
	
	public Cohete(String code, int[] numeroPropulsores) {
		this.code = code;
		for (Integer potencia : numeroPropulsores) {
			propulsores.add(new Propulsor(potencia));
		}
	}

	public String getCode() {
		return code;
	}

	public ArrayList<Propulsor> getPropulsores() {
		return propulsores;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int potenciaTotal) {
		this.velocidad = 100 * Math.sqrt(potenciaTotal);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(code + ": ");
		sb.append(" Potencias" + propulsores);
		sb.append(" Velocidad=" + df.format(velocidad));
		return sb.toString();
	}

}
