/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal05;

import java.util.Scanner;
import modelo.AutosBean;

/**
 *
 * @author Agustin
 */
public class Principal05 {

    public static void main(String[] args) {
        Scanner ingreso=new Scanner(System.in);
        AutosBean autosBean=new AutosBean();
        autosBean.llenarListado();
        autosBean.visualizarListado();
        System.out.println("Ingrese numero de Auto a modificar");
        int i=ingreso.nextInt();
        autosBean.modificarAuto(i);
        autosBean.visualizarListado();
    }
}
