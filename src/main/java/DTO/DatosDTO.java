package DTO;

import java.io.Serializable;
import java.util.List;

public class DatosDTO implements Serializable {

    private String id;
    private List<EquipamientoDTO> equipamiento;
    private int capacidad;
    private boolean reservable;
    private String notas;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<EquipamientoDTO> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(List<EquipamientoDTO> equipamiento) {
        this.equipamiento = equipamiento;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isReservable() {
        return reservable;
    }

    public void setReservable(boolean reservable) {
        this.reservable = reservable;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
