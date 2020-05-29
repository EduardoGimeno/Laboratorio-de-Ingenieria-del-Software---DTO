/*
 * EquipamientoDTO.java 1.0 29/05/2020
 */

/**
 * Esta clase reprensenta el DTO de Equipamiento
 *
 * @author Gonzalo Berné
 * @version 1.0, 29/05/2020
 */

package DTO;

import Enum.TipoEquipamiento;

import java.io.Serializable;

public class EquipamientoDTO implements Serializable {

    private TipoEquipamiento tipo;

    private int cantidad;

    private int maxCantidad;

    public TipoEquipamiento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEquipamiento tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMaxCantidad() {
        return maxCantidad;
    }

    public void setMaxCantidad(int maxCantidad) {
        this.maxCantidad = maxCantidad;
    }
}
