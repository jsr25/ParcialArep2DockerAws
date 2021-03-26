package co.escuelaing.edu.arep.api;

/**
 * Interfaz que se usa para la generacion de la calculadora de los datos
 *
 * Autor= Juan Sebastian Ramos Isaza
 */
public interface CalculApi {
    /**
     * Funcion que realiza la operacion ln
     * @param value valor a calcular
     * @return resultado operacion
     */
    public Double ln(Double value);

    /**
     * Funcion que realiza la operacion atan
     * @param value valor a calcular
     * @return resultado operacion
     */
    public Double atan(Double value);
}
