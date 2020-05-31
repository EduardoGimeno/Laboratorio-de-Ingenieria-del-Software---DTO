package DTO;

import Enum.Dia;
import java.io.Serializable;
import java.util.List;
import java.sql.Timestamp;

public class BusquedaDTO implements Serializable {
    private String edificio;
    private String tipoEspacio;
    private List<EquipamientoDTO> equipamiento;
    private int capacidad;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    private Integer horaInicio;
    private Integer horaFin;
    private List<Dia> dias;
    private boolean periodo;

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

    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Timestamp getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Integer horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Integer getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Integer horaFin) {
        this.horaFin = horaFin;
    }

    public List<Enum.Dia> getDias() {
        return dias;
    }

    public void setDias(List<Enum.Dia> dias) {
        this.dias = dias;
    }

    public boolean isPeriodo() {
        return periodo;
    }

    public void setPeriodo(boolean periodo) {
        this.periodo = periodo;
    }
}
