package co.edu.poli.proyecto2.modelo;

import java.io.*;
import java.util.*;

public class Cereal extends Semilla {
    private String tipoSuelo;

    public Cereal(String id, String nombre, int cantidadDisponible, int tiempoDeCosecha, String origen, String tipoSuelo) {
        super(id, nombre, cantidadDisponible, tiempoDeCosecha, origen);
        this.tipoSuelo = tipoSuelo;
    }

	public String getTipoSuelo() {
		return tipoSuelo;
	}

	public void setTipoSuelo(String tipoSuelo) {
		this.tipoSuelo = tipoSuelo;
	}

    @Override
    public String toString() {
        return super.toString() + ", Tipo de Suelo: " + tipoSuelo;
    }
    
}
