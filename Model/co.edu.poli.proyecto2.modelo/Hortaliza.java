package co.edu.poli.proyecto2.modelo;

import java.io.*;
import java.util.*;

public class Legumbre extends Semilla {
    private double temperaturaIdeal;
    public Legumbre(String id, String nombre, int cantidadDisponible, int tiempoDeCosecha, String origen, double temperaturaIdeal) {
        super(id, nombre, cantidadDisponible, tiempoDeCosecha, origen);
        this.temperaturaIdeal = temperaturaIdeal;
    }
	public double getTemperaturaIdeal() {
		return temperaturaIdeal;
	}
	public void setTemperaturaIdeal(double temperaturaIdeal) {
		this.temperaturaIdeal = temperaturaIdeal;
	}
	@Override
	public String toString() {
		return super.toString() + ", Temperatura Ideal: " + temperaturaIdeal;		
	}
}
