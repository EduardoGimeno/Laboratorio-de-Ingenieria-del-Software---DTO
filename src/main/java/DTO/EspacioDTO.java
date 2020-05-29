/*
 * UbicacionDTO.java 1.0 29/05/2020
 */

/**
 * Esta clase reprensenta el DTO de Espacio
 *
 * @author Gonzalo Berné
 * @version 1.0, 29/05/2020
 */

package DTO;

import java.io.Serializable;
import java.util.List;

public class EspacioDTO implements Serializable {

    private String id;
    private String tipo;
    private int capacidad;
    private List<EquipamientoDTO> equipamiento;
    private UbicacionDTO ubicacion;
    private String notas;
    private Boolean reservable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public UbicacionDTO getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(UbicacionDTO ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<EquipamientoDTO> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(List<EquipamientoDTO> equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Boolean getReservable() {
        return reservable;
    }

    public void setReservable(Boolean reservable) {
        this.reservable = reservable;
    }
}
