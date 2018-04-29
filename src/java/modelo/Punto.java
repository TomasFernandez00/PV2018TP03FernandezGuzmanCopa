/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Scanner;

/**
 *
 * @author Agustin
 */
public class Punto {
    int a;
    int b;
    int c;
    int d;
    double res;

    public Punto() {
    }

    public Punto(int a, int b, int c, int d, int res) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.res = res;
    }

    public void ingresarPuntos() {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("ingrese x del punto 1");
        a = ingreso.nextInt();
        System.out.println("Ingrese y del punto 1");
        b = ingreso.nextInt();
        System.out.println("Ingrese x del punto 2");
        c = ingreso.nextInt();
        System.out.println("Ingrese y del punto 2");
        d = ingreso.nextInt();
    }

    public void calcularDist() {
        double p= Math.pow((c-a), 2) + Math.pow((d-b), 2);
        res=Math.sqrt(p);
        System.out.println(res);
    }
}
