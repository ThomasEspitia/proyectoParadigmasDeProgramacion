package co.edu.poli.proyecto2.servicios;

import co.edu.poli.proyecto2.modelo.Semilla;

import java.io.*;
import java.util.*;

/**
 * 
 */
public interface CRUD {

    /**
     * @param semilla 
     * @return
     */
    public String create(Semilla semilla);

    /**
     * @param id 
     * @return
     */
    public Semilla read(String id);

    /**
     * @return
     */
    public List<Semilla> readAll();

    /**
     * @param id 
     * @return
     */
    public String update(String id);

    /**
     * @param id 
     * @return
     */
    public String delete(String id);

}