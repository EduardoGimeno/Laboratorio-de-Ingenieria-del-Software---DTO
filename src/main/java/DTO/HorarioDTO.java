package DTO;


import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class HorarioDTO implements Serializable {

    private String idEspacio;
    private Timestamp dia;
    private Integer horaInicio;
    private Integer horaFin;
    private List<Integer> horasOcupadas = new ArrayList<>();

    public String getIdEspacio() {
        return idEspacio;
    }

    public void setIdEspacio(String idEspacio) {
        this.idEspacio = idEspacio;
    }

    public Timestamp getDia() {
        return dia;
    }

    public void setDia(Timestamp dia) {
        this.dia = dia;
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

    public List<Integer> getHorasOcupadas() {
        return horasOcupadas;
    }

    public void setHorasOcupadas(List<Integer> horasOcupadas) {
        this.horasOcupadas = horasOcupadas;
    }

    public void addHoraOcupada(Integer hora) {
        this.horasOcupadas.add(hora);
    }

    public void addListaHorasOcupadas(List<Integer> horas) {
        this.horasOcupadas.addAll(horas);
    }
}
