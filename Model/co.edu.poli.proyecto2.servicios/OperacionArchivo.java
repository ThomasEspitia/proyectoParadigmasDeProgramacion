package co.edu.poli.proyecto2.servicios;

import java.io.*;
import java.util.*;

public interface OperacionArchivo {
    String serializar(Semilla[] semillas, int total);
    Semilla[] deserializar();
}
