/*
 * EstadoReserva.java 1.0 30/03/2020
 */

/**
 * @author Gonzalo Berné
 * @author Eduardo Gimeno
 * @version 2.0, 01/04/2020
 */

package Enum;

public enum EstadoReserva {
    ACEPTADA("Aceptada"),
    RECHAZADA("Rechazada"),
    PENDIENTE("Pendiente");

    private String estado;
 
    EstadoReserva(String estado) {
        this.estado = estado;
    }

    EstadoReserva() {}
 
    public String getEstado() {
        return this.estado;
    }

}