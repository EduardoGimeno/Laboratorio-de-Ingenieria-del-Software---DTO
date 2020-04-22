/*
 * Dia.java 1.0 30/03/2020
 */

/**
 * @author Gonzalo Berné
 * @version 1.0, 22/04/2020
 */

package ObjetoValor;

public enum Dia {
    LUNES("Lunes"),
    MARTES("Martes"),
    MIERCOLES("Miercoles"),
    JUEVES("Jueves"),
    VIERNES("Viernes");

    private String dia;

    Dia(String dia) {
        this.dia = dia;
    }

    Dia() {}
 
    public String getDia() {
        return this.dia;
    }

}