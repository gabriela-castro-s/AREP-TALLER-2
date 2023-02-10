package edu.eci.arep.Services;

public interface Service {
    /**
     * Retorna el header de una petición HTTP
     * @return Encabezado del HTTP
     */
    public String getHeader();

    /**
     * Retorna el body de una petición HTTP
     * @return Cuerpo de la petición HTTP
     */
    public String getBody();
}