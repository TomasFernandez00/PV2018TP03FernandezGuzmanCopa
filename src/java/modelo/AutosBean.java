/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Agustin
 */
public class AutosBean {
    Autos auto;
    ListaAuto listadoAuto;

    public AutosBean() {
        listadoAuto=new ListaAuto();
    }
    
    public Autos crearAuto(String modelo, String marca, String patente, String combustible, String color){
        Autos unAuto=new Autos();
        unAuto.setColor(color);
        unAuto.setMarca(marca);
        unAuto.setModelo(modelo);
        unAuto.setPatente(patente);
        unAuto.setTip_comb(combustible);
        return unAuto;
    }
    public void llenarListado(){
        listadoAuto.getListadoAutos().add(crearAuto("corolla", "toyota", "tuvi832", "naftapapi", "verdepusi"));
        listadoAuto.getListadoAutos().add(crearAuto("chevette", "gmc", "tumami860", "gasoilpapi", "amarillopusi"));
        listadoAuto.getListadoAutos().add(crearAuto("ranger", "ford", "tuse650", "naftapapi", "naranjapusi"));
        
        
    }
    public void visualizarListado(){
        System.out.println("Autos: ");
        int i=1;
        for(Autos cadaAuto:listadoAuto.getListadoAutos()){
            System.out.println("Auto "+i);
            System.out.println("Modelo: "+cadaAuto.getModelo());
            System.out.println("Marca: "+cadaAuto.getMarca());
            System.out.println("Color: "+cadaAuto.getColor());
            System.out.println("Patente: "+cadaAuto.getPatente());
            System.out.println("Combustible: "+cadaAuto.getTip_comb());
            System.out.println("------------------------------------");
            i=i+1;
        }
    }
    public void modificarAuto(int indice){
        listadoAuto.getListadoAutos().remove(indice);
        listadoAuto.getListadoAutos().add(crearAutoMod());
    }
    public Autos crearAutoMod(){
        Scanner ingreso=new Scanner(System.in);
        Autos unAuto=new Autos();
        System.out.println("Ingrese Color");
        String a=ingreso.next();
        unAuto.setColor(a);
        System.out.println("Ingrese Marca");
        a=ingreso.next();
        unAuto.setMarca(a);
        System.out.println("Ingrese Modelo");
        a=ingreso.next();
        unAuto.setModelo(a);
        System.out.println("Ingrese Patente");
        a=ingreso.next();
        unAuto.setPatente(a);
        System.out.println("Ingrese Combustible");
        a=ingreso.next();
        unAuto.setTip_comb(a);
        return unAuto;
    }
}
