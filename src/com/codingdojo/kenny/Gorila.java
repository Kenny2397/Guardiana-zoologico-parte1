package com.codingdojo.kenny;

public class Gorila extends Mamifero{
	

	public Gorila(Integer nivelDeEnergia) {
		this.nivelDeEnergia = nivelDeEnergia;
	}
	
	public void lanzarAlgo() {
		System.out.println("Lanzando");
		nivelDeEnergia -= 5;
	}
	public void comerBananas() {
		System.out.println("Satisfaccion xd");
		nivelDeEnergia += 10;
	}
	public void escalar() {
		System.out.println("escalandoando un arbolito");
		nivelDeEnergia -= 10;
	}
	

}
