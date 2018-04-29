/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Scanner;

/**
 *
 * @author Elena
 */
public class AutoBean {

    ListaAutos listaAutos;
    Auto unAuto;

    public AutoBean() {
    }

    public AutoBean(ListaAutos listaAutos, Auto unAuto) {
        this.listaAutos = listaAutos;
        this.unAuto = unAuto;
    }

    
    
    public Auto crearAuto() {
        Auto auto = new Auto();
        String a;
        Scanner un = new Scanner(System.in);
        System.out.println("Ingrese patente");
        a = un.next();
        auto.setPatente(a);
        System.out.println("Ingrese Marca");
        a = un.next();
        auto.setMarca(a);
        System.out.println("Ingrese Color");
        a = un.next();
        auto.setColor(a);
        System.out.println("Ingrese Modelo");
        a = un.next();
        auto.setModelo(a);
        System.out.println("Ingrese Tipo de Combustible");
        a = un.next();
        auto.setTipoDeCombustible(a);
        return auto;
    }

    public void llenarListado() {
        listaAutos.getListadoAutos().add(crearAuto());
    }

    public void modificarAuto() {
        Scanner ro = new Scanner(System.in);
        System.out.println("Ingrese la patente del auto que quiere modificar: ");
        String Patente = ro.next();
        for (Auto cadaAuto : listaAutos.getListadoAutos()) {
            if (cadaAuto.getPatente() == Patente) {
                Scanner ma = new Scanner(System.in);
                int opt = ma.nextInt();
                System.out.println("Ingrese la opcion que desea modificar: ");
                System.out.println("1.Color.");
                System.out.println("2.Modelo.");
                System.out.println("3.Marca.");
                System.out.println("4.Tipo de Combustible.");
                switch (opt) {
                    case 1:
                        String nuevoColor = ro.next();
                        cadaAuto.setColor(nuevoColor);
                    case 2:
                        String nuevoModelo = ro.next();
                        cadaAuto.setModelo(nuevoModelo);
                    case 3:
                        String nuevaMarca = ro.next();
                        cadaAuto.setMarca(nuevaMarca);
                    case 4:
                        String nuevoTipo = ro.next();
                        cadaAuto.setTipoDeCombustible(nuevoTipo);
                }
            }
        }

    }

    public void menu() {
        Scanner jo = new Scanner(System.in);
        int opt;
        System.out.println("Ingrese una Opcion: ");
        System.out.println("1. Agregar un Auto al listado.");
        System.out.println("2. Modificar un Auto existente.");
        System.out.println("3. Salir.");
        opt = jo.nextInt();
        switch (opt) {
            case 1:
                llenarListado();
                menu();
            case 2:
                modificarAuto();
                menu();
            case 3:
                System.exit(0);
        }
    }
}
