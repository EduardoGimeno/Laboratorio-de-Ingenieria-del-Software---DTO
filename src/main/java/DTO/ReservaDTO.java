package DTO;

import ObjetoValor.EstadoReserva;
import ObjetoValor.Usuario;

import java.io.Serializable;
import java.sql.Timestamp;

public class ReservaDTO implements Serializable {

    private String id;
    private Timestamp horaInicio;
    private Timestamp horaFin;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    private EstadoReserva estado;
    private Usuario usuario;
    private String idEspacio;
    private int diasLectivos = 5;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Timestamp getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Timestamp horaFin) {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(String idEspacio) {
        this.idEspacio = idEspacio;
    }

    public int getDiasLectivos() {
        return diasLectivos;
    }

    public void setDiasLectivos(int diasLectivos) {
        this.diasLectivos = diasLectivos;
    }
}
