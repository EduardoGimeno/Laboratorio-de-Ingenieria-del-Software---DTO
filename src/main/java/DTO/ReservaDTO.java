package DTO;

import Enum.Dia;
import Enum.EstadoReserva;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

public class ReservaDTO implements Serializable {

    private String id;
    private int horaInicio;
    private int horaFin;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    private EstadoReserva estado;
    private UsuarioDTO usuario;
    private String idEspacio;
    private List<Dia> dias;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
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

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public String getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(String idEspacio) {
        this.idEspacio = idEspacio;
    }

    public List<Dia> getDias() {
        return this.dias;
    }

    public void setDias(List<Dia> dias) {
        this.dias = dias;
    }

    public List<Integer> getDiasString() {
        return this.dias.stream()
                .map(Dia::getDia)
                .collect(Collectors.toList());
    }

    public void addDia(Dia dia) {
        this.dias.add(dia);
    }
}
