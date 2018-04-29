/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Agustin
 */
public class RectanguloBean {
    Rectangulo rectangulo;
    ListaRectangulo listaRectangulo;

    public RectanguloBean() {
        listaRectangulo=new ListaRectangulo();
    }
    public Rectangulo crearRectangulos(int base, int altura){
        Rectangulo unRectangulo=new Rectangulo();
        unRectangulo.setAltura(altura);
        unRectangulo.setBase(base);
        unRectangulo.setPerimetro(base*2+altura*2);
        unRectangulo.setSuperficie(base*altura);
        return unRectangulo;
    }
    public void llenarListado(){
        listaRectangulo.getListadoRectangulo().add(crearRectangulos(3,6));
        listaRectangulo.getListadoRectangulo().add(crearRectangulos(5,8));
        listaRectangulo.getListadoRectangulo().add(crearRectangulos(2,5));
    }
    public void visualizarListado(){
        System.out.println("Rectangulos: ");
        for(Rectangulo cadaRectangulo:listaRectangulo.getListadoRectangulo())
            System.out.println("Rectangulo - Base: "+cadaRectangulo.getBase()+" - Altura: "+cadaRectangulo.getAltura());
    }
    public void eliminarRectanguloDeListado(int indice){
        listaRectangulo.getListadoRectangulo().remove(indice);
    }
}
