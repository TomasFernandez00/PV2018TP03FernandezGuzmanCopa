/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Tomas Fernandez EdM
 */
public class ListaLibro {
	private ArrayList<Libro> listadoLibro;

	public ListaLibro(ArrayList<Libro> listadoLibro) {
		this.listadoLibro = listadoLibro;
	}

	public ListaLibro() {
		listadoLibro = new ArrayList();
	}

	/**
	 * @return the listadoLibro
	 */
	public ArrayList<Libro> getListadoLibro() {
		return listadoLibro;
	}

	/**
	 * @param listadoLibro the listadoLibro to set
	 */
	public void setListadoLibro(ArrayList<Libro> listadoLibro) {
		this.listadoLibro = listadoLibro;
	}
}