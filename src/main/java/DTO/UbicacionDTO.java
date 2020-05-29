/*
 * UbicacionDTO.java 1.0 29/05/2020
 */

/**
 * Esta clase reprensenta el DTO de Ubicacion
 *
 * @author Gonzalo Berné
 * @version 1.0, 29/05/2020
 */

package DTO;

import java.io.Serializable;

public class UbicacionDTO implements Serializable {

    private String edificio;

    private int planta;

    public UbicacionDTO() { }

    public UbicacionDTO(String edificio, int planta) {
        this.edificio = edificio;
        this.planta = planta;
    }

    public String getEdificio() {
        return this.edificio;
    }

    public int getPlanta() {
        return this.planta;
    }
}