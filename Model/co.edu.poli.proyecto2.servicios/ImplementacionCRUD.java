package co.edu.poli.proyecto2.servicios;

import co.edu.poli.proyecto2.modelo.Semilla;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class ImplementacionCRUD implements CRUD, OperacionArchivo {

    /**
     * Default constructor
     */
    public ImplementacionCRUD() {
    }

    /**
     * 
     */
    public List<Semilla> semilla;

    /**
     * @param semilla 
     * @return
     */
    public String create(Semilla semilla) {
        // TODO implement CRUD.create() here
        return "";
    }

    /**
     * @param id 
     * @return
     */
    public Semilla read(String id) {
        // TODO implement CRUD.read() here
        return null;
    }

    /**
     * @return
     */
    public List<Semilla> readAll() {
        // TODO implement CRUD.readAll() here
        return null;
    }

    /**
     * @param id 
     * @return
     */
    public String update(String id) {
        // TODO implement CRUD.update() here
        return "";
    }

    /**
     * @param id 
     * @return
     */
    public String delete(String id) {
        // TODO implement CRUD.delete() here
        return "";
    }

    /**
     * @param path 
     * @return
     */
    public String serializar(String path) {
        // TODO implement OperacionArchivo.serializar() here
        return "";
    }

    /**
     * @param path 
     * @return
     */
    public String deserializar(String path) {
        // TODO implement OperacionArchivo.deserializar() here
        return "";
    }

}