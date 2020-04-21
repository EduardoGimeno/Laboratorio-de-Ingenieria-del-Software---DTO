/*
 * TipoEquipamiento.java 1.0 01/04/2020
 */

/**
 * @author Eduardo Gimeno
 * @version 1.0, 01/04/2020
 */

package ObjetoValor;

public enum TipoEquipamiento {
    CANON("cañon"),
    PIZARRA("pizarra");

    private String nombre;
 
    TipoEquipamiento(String nombre) {
        this.nombre = nombre;
    }


 
    public String getNombre() {
        return this.nombre;
    }
}