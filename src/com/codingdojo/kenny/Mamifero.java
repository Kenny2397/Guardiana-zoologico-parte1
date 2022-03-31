package com.codingdojo.kenny;

public class Mamifero {
	public Integer nivelDeEnergia;
	
	/*
	 * constructor
	 */
	
	public Mamifero(Integer nivelDeEnergia) {
		super();
		this.nivelDeEnergia = nivelDeEnergia;
	}
	
	public Mamifero() {
		super();
	}

	public Integer mostrarEnergia() {
		System.out.println("Energía: "+this.nivelDeEnergia);
		return this.nivelDeEnergia;
	}

}
