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
public class Rectangulo {
    private int base;
    private int perimetro;
    private int altura;
    private int superficie;

    public Rectangulo() {
    }

    public Rectangulo(int base, int perimetro, int altura, int superficie) {
        this.base = base;
        this.perimetro = perimetro;
        this.altura = altura;
        this.superficie = superficie;
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the perimetro
     */
    public int getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the superficie
     */
    public int getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     */
    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    
}
