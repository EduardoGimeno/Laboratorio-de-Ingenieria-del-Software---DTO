/*
 * TipoEquipamiento.java 1.0 01/04/2020
 */

/**
 * @author Eduardo Gimeno
 * @version 1.0, 01/04/2020
 */

package Enum;

public enum TipoEquipamiento {
    CANON("cañon"),
    PANTALLA("pantalla"),
    TV("tv"),
    VIDEO("video"),
    DVD("dvd"),
    PIZARRA("pizarra"),
    ORDENADOR("ordenador");

    private String nombre;
 
    TipoEquipamiento(String nombre) {
        this.nombre = nombre;
    }

    TipoEquipamiento() {}
 
    public String getNombre() {
        return this.nombre;
    }
}