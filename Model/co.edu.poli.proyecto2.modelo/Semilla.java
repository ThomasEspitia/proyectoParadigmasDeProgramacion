package co.edu.poli.proyecto2.modelo;

import java.io.*;
import java.util.*;
import java.io.Serializable;

public class Semilla implements Serializable {
    private String id;
    private String nombre;
    private int cantidadDisponible;
    private int tiempoDeCosecha;
    private String origen;


    public Semilla(String id, String nombre, int cantidadDisponible, int tiempoDeCosecha, String origen) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.tiempoDeCosecha = tiempoDeCosecha;
        this.origen = origen;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	public int getTiempoDeCosecha() {
		return tiempoDeCosecha;
	}

	public void setTiempoDeCosecha(int tiempoDeCosecha) {
		this.tiempoDeCosecha = tiempoDeCosecha;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "Semilla [id=" + id + ", nombre=" + nombre + ", cantidad Disponible=" + cantidadDisponible
				+ ", tiempo de cosecha=" + tiempoDeCosecha + ", origen=" + origen + "]";
	}
	
	
}
