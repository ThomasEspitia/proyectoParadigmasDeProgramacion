package co.edu.poli.proyecto2.servicios;

import java.io.*;
import java.util.*;

/**
 * 
 */
public interface OperacionArchivo {

    /**
     * @param path 
     * @return
     */
    public String serializar(String path);

    /**
     * @param path 
     * @return
     */
    public String deserializar(String path);

}