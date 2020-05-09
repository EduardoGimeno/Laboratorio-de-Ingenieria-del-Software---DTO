package DTO;

import ObjetoValor.Equipamiento;
import ObjetoValor.Ubicacion;

import java.io.Serializable;
import java.util.List;

public class EspacioDTO implements Serializable {

    private String id;
    private String tipo;
    private int capacidad;
    private List<Equipamiento> equipamiento;
    private Ubicacion ubicacion;
    private String notas;

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

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Equipamiento> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(List<Equipamiento> equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
