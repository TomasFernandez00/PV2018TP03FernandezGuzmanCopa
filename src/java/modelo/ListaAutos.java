/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Elena
 */
public class ListaAutos {
    private ArrayList <Auto> listadoAutos;

    /**
     * @return the listadoAutos
     */
    public ArrayList <Auto> getListadoAutos() {
        return listadoAutos;
    }

    /**
     * @param listadoAutos the listadoAutos to set
     */
    public void setListadoAutos(ArrayList <Auto> listadoAutos) {
        this.listadoAutos = listadoAutos;
    }

    public ListaAutos() {
        listadoAutos = new ArrayList();
    }

    public ListaAutos(ArrayList<Auto> listadoAutos) {
        this.listadoAutos = listadoAutos;
    }
    
}
