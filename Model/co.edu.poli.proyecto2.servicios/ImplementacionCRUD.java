package co.edu.poli.proyecto2.servicios;

import co.edu.poli.proyecto2.modelo.Semilla;

import java.io.*;
import java.util.*;

import java.util.Arrays;

public class ImplementacionCRUD implements CRUD, OperacionArchivo {
    private Semilla[] semillas;
    private int count;
    
    public ImplementacionCRUD() {
        semillas = new Semilla[10];
        count = 0;
    }
    
    private void expandArray() {
        semillas = Arrays.copyOf(semillas, semillas.length * 2);
    }
    
    @Override
    public String create(Semilla semilla) {
        if (count == semillas.length) {
            expandArray();
        }
        semillas[count++] = semilla;
        return "Semilla creada exitosamente.";
    }
    
    @Override
    public Semilla read(String id) {
        for (int i = 0; i < count; i++) {
            if (semillas[i].getId().equals(id)) {
                return semillas[i];
            }
        }
        return null;
    }
    
    @Override
    public Semilla[] readAll() {
        return Arrays.copyOf(semillas, count);
    }
    
    @Override
    public String update(Semilla semilla) {
        for (int i = 0; i < count; i++) {
            if (semillas[i].getId().equals(semilla.getId())) {
                semillas[i] = semilla;
                return "Semilla actualizada exitosamente.";
            }
        }
        return "No se encontró la semilla a actualizar.";
    }
    
    @Override
    public String delete(String id) {
        for (int i = 0; i < count; i++) {
            if (semillas[i].getId().equals(id)) {
                for (int j = i; j < count - 1; j++) {
                    semillas[j] = semillas[j + 1];
                }
                semillas[--count] = null;
                return "Semilla eliminada exitosamente.";
            }
        }
        return "No se encontró la semilla a eliminar.";
    }
    
    @Override
    public String serializar(String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(readAll());
            return "Serialización exitosa. Archivo guardado en " + path;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error durante la serialización: " + e.getMessage();
        }
    }
    
    @Override
    public String deserializar(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Semilla[] loaded = (Semilla[]) ois.readObject();
            semillas = loaded;
            count = loaded.length;
            return "Deserialización exitosa. Datos cargados desde " + path;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return "Error durante la deserialización: " + e.getMessage();
        }
    }
}
