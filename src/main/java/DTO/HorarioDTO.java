package DTO;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class HorarioDTO implements Serializable {

    private String idEspacio;
    private Timestamp horaInicio;
    private Timestamp horaFin;
    private List<Timestamp> horasOcupadas;

    public String getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(String idEspacio) {
        this.idEspacio = idEspacio;
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

    public List<Timestamp> getHorasOcupadas() {
        return horasOcupadas;
    }

    public void setHorasOcupadas(List<Timestamp> horasOcupadas) {
        this.horasOcupadas = horasOcupadas;
    }

    public void addHoraOcupada(Timestamp hora) {
        this.horasOcupadas.add(hora);
    }

    public void addListaHorasOcupadas(List<Timestamp> horas) {
        this.horasOcupadas.addAll(horas);
    }
}
