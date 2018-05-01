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
public class Autos {
    private String marca;
    private String modelo;
    private String tip_comb;
    private String color;
    private String patente;

    public Autos() {
    }

    public Autos(String marca, String modelo, String tip_comb, String color, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.tip_comb = tip_comb;
        this.color = color;
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the tip_comb
     */
    public String getTip_comb() {
        return tip_comb;
    }

    /**
     * @param tip_comb the tip_comb to set
     */
    public void setTip_comb(String tip_comb) {
        this.tip_comb = tip_comb;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }
    
}
