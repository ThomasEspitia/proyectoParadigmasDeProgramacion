package co.edu.poli.proyecto2.servicios;

import java.io.*;
import java.util.*;

public interface OperacionArchivo {
    String serializar(String path);
    String deserializar(String path);
}

