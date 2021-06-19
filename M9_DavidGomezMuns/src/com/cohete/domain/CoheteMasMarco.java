package com.cohete.domain;

public class CoheteMasMarco {
	
	public static void crear(String id_cohete, int[] potPropCohete, int xPositionMarco) {
		new MarcoCohete(new Cohete(id_cohete, potPropCohete), xPositionMarco);
	}

}
