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

    private int[] lados;

    public Triangulo() {
    }

    public void calcPer() {
        ingreso();
        Boolean a = verificarTriang();
        if (a == true) {
            System.out.println(getLados()[0] + getLados()[1] + getLados()[2]);
        } else {
            System.out.println("Ingrese lados validos para formar triangulo");
            calcPer();
        }

    }

    public Boolean verificarTriang() {
        if (getLados()[0] + getLados()[1] > getLados()[2]) {
            if (getLados()[0] + getLados()[2] > getLados()[1]) {
                if (getLados()[2] + getLados()[1] > getLados()[0]) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void ingreso() {
        setLados(new int[3]);
        Scanner ingreso = new Scanner(System.in);
        for (int i = 0; i < getLados().length; i++) {
            System.out.println("Ingrese lado ");
            getLados()[i] = ingreso.nextInt();
        }
    }

    /**
     * @return the lados
     */
    public int[] getLados() {
        return lados;
    }

    /**
     * @param lados the lados to set
     */
    public void setLados(int[] lados) {
        this.lados = lados;
    }
}
