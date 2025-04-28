package co.edu.poli.proyecto2.modelo;

import java.io.*;
import java.util.*;

public class Frutal extends Semilla {
    private String mesFructificacion;

    public Frutal(String id, String nombre, int cantidadDisponible, int tiempoDeCosecha, String origen, String mesFructificacion) {
        super(id, nombre, cantidadDisponible, tiempoDeCosecha, origen);
        this.mesFructificacion = mesFructificacion;
    }

	public String getMesFructificacion() {
		return mesFructificacion;
	}

	public void setMesFructificacion(String mesFructificacion) {
		this.mesFructificacion = mesFructificacion;
	}
    
}
