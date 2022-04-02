package com.codingdojo.kenny;

public class Murcielago extends Mamifero{
	
	public Murcielago() {
		this.nivelDeEnergia = 300;
	}
	
	public void volar() {
		System.out.println("sonido de un murciélago al despegar");
		nivelDeEnergia -= 50;
	}
	public void comerHumanos() {
		System.out.println("sonido de cuando el murciélago... ");
		nivelDeEnergia += 25;
	}
	public void atacarPueblo() {
		System.out.println("sonido de pueblo llamas ");
		nivelDeEnergia -= 100;
	}

}
