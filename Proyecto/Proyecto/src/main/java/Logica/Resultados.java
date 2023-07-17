/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author JRS
 */
public class Resultados {
    //Estas propiedades int deben cambiar a goels o algo asi.. creo que si pero ahora no se por donde en todo lado estan aparte 
    private int pos;
    private String  selecion1;
    private String  selecion2;
    private int puntos;

    public Resultados(int pos, String sele1, String sele2, int pts) {
        this.pos = pos;
        this.selecion1 = sele1;
        this.selecion2 = sele2;
        this.puntos = pts;
    }
    
    /**
     * @return the pos
     */
    public int getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(int pos) {
        this.pos = pos;
    }

    /**
     * @return the selecion1
     */
    public String getSelecion1() {
        return selecion1;
    }

    /**
     * @param selecion1 the selecion to set
     */
    public void setSelecion1(String selecion1) {
        this.selecion1 = selecion1;
    }

        /**
     * @return the selecion2
     */
    public String getSelecion2() {
        return selecion2;
    }

    /**
     * @param selecion2 the selecion2 to set
     */
    public void setSelecion2(String selecion2) {
        this.selecion2 = selecion2;
    }
    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
