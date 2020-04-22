/*
 * Dia.java 1.0 30/03/2020
 */

/**
 * @author Gonzalo Berné
 * @version 1.0, 22/04/2020
 */

package ObjetoValor;

public enum Dia {
    DOMINGO(1),
    LUNES(2),
    MARTES(3),
    MIERCOLES(4),
    JUEVES(5),
    VIERNES(6),
    SABADO(7);

    private Integer dia;

    Dia(Integer dia) {
        this.dia = dia;
    }

    Dia() {}
 
    public Integer getDia() {
        return this.dia;
    }

}