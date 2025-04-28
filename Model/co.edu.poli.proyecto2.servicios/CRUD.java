package co.edu.poli.proyecto2.servicios;

import co.edu.poli.proyecto2.modelo.Semilla;

import java.io.*;
import java.util.*;

public interface CRUD {
    String create(Semilla semilla);
    Semilla read(String id);
    Semilla[] readAll();
    String update(Semilla semilla);
    String delete(String id);
}
