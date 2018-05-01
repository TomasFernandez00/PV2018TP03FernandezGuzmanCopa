/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Tomas Fernandez EdM
 */
@ManagedBean
@ViewScoped
public class LibroBean {
	private Libro libro;
	private ListaLibro listaLibro;
	private String titulo;
	private String autor;
	private String isbn;
	private int precio;
	/**
	 * Creates a new instance of LibroBean
	 */
	public LibroBean() {
		listaLibro = new ListaLibro();
	}
	public void crearLibro() {
		Libro unLibro = new Libro();
		unLibro.setAutor(autor);
//		unLibro.setIsbn(isbn);
//		unLibro.setPrecio(precio);
//		unLibro.setTitulo(titulo);
		getListaLibro().getListadoLibro().add(unLibro);
	}

	/**
	 * @return the libro
	 */
	public Libro getLibro() {
		return libro;
	}

	/**
	 * @param libro the libro to set
	 */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	/**
	 * @return the listaLibro
	 */
	public ListaLibro getListaLibro() {
		return listaLibro;
	}

	/**
	 * @param listaLibro the listaLibro to set
	 */
	public void setListaLibro(ListaLibro listaLibro) {
		this.listaLibro = listaLibro;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
