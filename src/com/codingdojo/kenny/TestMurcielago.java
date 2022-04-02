package com.codingdojo.kenny;

public class TestMurcielago {
	public static void main(String[] args) {
		
		Murcielago m1 = new Murcielago();
		
		m1.mostrarEnergia();
		m1.atacarPueblo();
		m1.atacarPueblo();
		m1.atacarPueblo();
		
		m1.mostrarEnergia();
		m1.comerHumanos();
		m1.comerHumanos();
		
		m1.mostrarEnergia();
		m1.volar();
		
		m1.mostrarEnergia();
	}
}
