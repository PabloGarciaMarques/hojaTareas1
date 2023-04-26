package caja;

import java.util.Scanner;

public class Caja {
	public double alto;
	public double ancho;
	public double fondo;
	public String etiqueta;

	public Caja(double alto, double ancho, double fondo, String etiqueta) {

		this.alto = alto;
		this.ancho = ancho;
		this.fondo = fondo;
		this.etiqueta = etiqueta;
	}

	public Caja(String etiqueta) {
		super();
		this.etiqueta = etiqueta;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getFondo() {
		return fondo;
	}

	public void setFondo(double fondo) {
		this.fondo = fondo;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public double CalcularVolumen() {
		double volumen = 0;
		volumen = alto * ancho * fondo;
		System.out.println("El volumen de esta caja es de: " + volumen);
		return volumen;

	}

	public boolean CambiarEtiqueta(String etiqueta) {
		boolean cambio = false;
		Scanner sc = new Scanner(System.in);
		if (etiqueta.length() > 30) {
			System.out.println("No podes poner una etiqueta tan larga forro");
		} else {
			this.etiqueta = etiqueta;
			System.out.println(etiqueta);
		}

		return cambio;
	}

	public void representacion() {
		System.out.println(
				"Esta caja tiene un alto de " + alto + " fondo " + fondo + " ancho " + ancho + " etiqueta " + etiqueta);

	}

}