/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static java.lang.System.exit;
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
			try {
			getDiezNumeros()[i]=in.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("Debe ingresar un numero entero!");
				exit(0);
			}
		}
	}

	public void procesarDiezNumeros() {
		int n = getDiezNumeros().length;
		int promedio = 0;
		for (int i = 0; i < n; i++) {
			System.out.println(getDiezNumeros()[i]);
			promedio = promedio + getDiezNumeros()[i];
		}
		promedio = promedio / n;
		int[] clon = getDiezNumeros().clone();
		for (int h = 0 ; h < n ; h++) {
			for (int j = 1 ; j < (n - h) ; j++) {
				if (clon[j - 1] > clon[j]) {
					int temp = clon[j - 1];
					clon[j - 1] = clon[j];
					clon[j] = temp;
				}
			}
		}
		System.out.println("El numero mas alto es: "+clon[n - 1]);
		System.out.println("El numero mas pequeño es: "+clon[0]);
		System.out.println("El promedio es: "+promedio);
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
