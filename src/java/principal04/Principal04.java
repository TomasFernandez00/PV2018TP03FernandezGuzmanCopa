/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal04;

import java.util.Scanner;
import modelo.RectanguloBean;

/**
 *
 * @author Agustin
 */
public class Principal04 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        RectanguloBean rectanguloBean = new RectanguloBean();
        rectanguloBean.llenarListado();
        rectanguloBean.visualizarListado();
        System.out.println("Seleccione el Rectangulo a eliminar");
        int i = ingreso.nextInt();
        rectanguloBean.eliminarRectanguloDeListado(i);
        rectanguloBean.visualizarListado();
    }
}
