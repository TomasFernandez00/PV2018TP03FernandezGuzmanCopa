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
public class Triangulo {

    int[] lados;

    public Triangulo() {
    }

    public void calcPer() {
        ingreso();
        Boolean a = verificarTriang();
        if (a == true) {
            System.out.println(lados[1] + lados[2] + lados[3]);
        } else {
            System.out.println("Ingrese lados validos para formar triangulo");
            calcPer();
        }

    }

    public Boolean verificarTriang() {
        if (lados[0] + lados[1] > lados[2]) {
            if (lados[0] + lados[2] > lados[1]) {
                if (lados[2] + lados[1] > lados[0]) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void ingreso() {
        lados = new int[2];
        Scanner ingreso = new Scanner(System.in);
        for (int i = 0; i <= lados.length; i++) {
            System.out.println("Ingrese lado ");
            lados[i] = ingreso.nextInt();
        }
    }
}
