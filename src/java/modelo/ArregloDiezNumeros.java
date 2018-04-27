/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Scanner;

/**
 *
 * @author Tomas Fernandez EdM
 */
public class ArregloDiezNumeros {
	private int[] diezNumeros;

	public void ingresarDiezNumeros() {
		diezNumeros = new int[10];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese un numero");
			getDiezNumeros()[i]=in.nextInt();
		}
		setDiezNumeros(diezNumeros);
	}

	public void procesarDiezNumeros() {
		
	}
	public int[] getDiezNumeros() {
		return diezNumeros;
	}

	public void setDiezNumeros(int[] diezNumeros) {
		this.diezNumeros = diezNumeros;
	}

	public ArregloDiezNumeros() {
	}

	public ArregloDiezNumeros(int[] diezNumeros) {
		this.diezNumeros = diezNumeros;
	}
	
}
