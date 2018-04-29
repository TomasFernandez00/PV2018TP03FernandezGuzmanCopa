/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal02;

import modelo.Punto;

/**
 *
 * @author Agustin
 */
public class Principal02 {
     public static void main(String[] args) {
    resPunto2();
    
    }   
    public static void resPunto2(){
        Punto unPunto=new Punto();
        unPunto.ingresarPuntos();
        unPunto.calcularDist();
    }
    
    
    
}
