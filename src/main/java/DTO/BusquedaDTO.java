package DTO;

import java.io.Serializable;
import java.util.List;

public class BusquedaDTO implements Serializable {
    private String edificio;
    private String tipoEspacio;
    private List<EquipamientoDTO> equipamiento;
    private int capacidad;

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public String getTipoEspacio() {
        return tipoEspacio;
    }

    public void setTipoEspacio(String tipoEspacio) {
        this.tipoEspacio = tipoEspacio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<EquipamientoDTO> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(List<EquipamientoDTO> equipamiento) {
        this.equipamiento = equipamiento;
    }
}
