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

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }
}