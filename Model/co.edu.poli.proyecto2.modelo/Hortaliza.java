package co.edu.poli.proyecto2.modelo;

import java.io.*;
import java.util.*;

public class Hortaliza extends Semilla {
    private String tipoHortaliza;

    public Hortaliza(String id, String nombre, int cantidadDisponible, int tiempoDeCosecha, String origen, String tipoHortaliza) {
        super(id, nombre, cantidadDisponible, tiempoDeCosecha, origen);
        this.tipoHortaliza = tipoHortaliza;
    }

	public String getTipoHortaliza() {
		return tipoHortaliza;
	}

	public void setTipoHortaliza(String tipoHortaliza) {
		this.tipoHortaliza = tipoHortaliza;
	}

	@Override
	public String toString() {
        return super.toString() + ", Tipo de Hortaliza: " + tipoHortaliza;
    }
}
