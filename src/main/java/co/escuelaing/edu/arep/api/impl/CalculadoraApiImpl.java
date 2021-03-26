package co.escuelaing.edu.arep.api.impl;

import co.escuelaing.edu.arep.api.CalculApi;

/**
 * Clase que implementa los metodos de la calculadora
 *
 * Autor= Juan Sebastian Ramos Isaza
 */
public class CalculadoraApiImpl implements CalculApi {
    @Override
    public Double ln(Double value) {
        return Math.log(value);
    }

    @Override
    public Double atan(Double value) {
        return Math.atan(value);
    }
}
