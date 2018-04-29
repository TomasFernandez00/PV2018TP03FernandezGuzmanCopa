/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Elena
 */
public class Auto {

    private String patente;
    private String modelo;
    private String marca;
    private String color;
    private String tipoDeCombustible;

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
     * @return the tipoDeCombustible
     */
    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    /**
     * @param tipoDeCombustible the tipoDeCombustible to set
     */
    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public Auto() {
    }

    public Auto(String patente, String modelo, String marca, String color, String tipoDeCombustible) {
        this.patente = patente;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.tipoDeCombustible = tipoDeCombustible;
    }

}
