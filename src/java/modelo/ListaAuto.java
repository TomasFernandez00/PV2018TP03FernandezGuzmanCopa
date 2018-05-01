/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Agustin
 */
public class ListaAuto {
    private ArrayList<Autos> listadoAutos;

    public ListaAuto() {
        listadoAutos=new ArrayList();
    }

    public ListaAuto(ArrayList<Autos> listadoAutos) {
        this.listadoAutos = listadoAutos;
    }

    /**
     * @return the listadoAutos
     */
    public ArrayList<Autos> getListadoAutos() {
        return listadoAutos;
    }

    /**
     * @param listadoAutos the listadoAutos to set
     */
    public void setListadoAutos(ArrayList<Autos> listadoAutos) {
        this.listadoAutos = listadoAutos;
    }
    
    
}
