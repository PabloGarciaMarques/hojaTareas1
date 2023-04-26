package cajaGlovo;

import caja.Caja;

public class CajaGlovo extends Caja {

	public CajaGlovo(double alto, double ancho, double fondo, String etiqueta) {
		super(alto, ancho, fondo, etiqueta);
		// TODO Auto-generated constructor stub
	}

	public double VolumenCarton() {

		double volumen = (alto * ancho * fondo) * (0.8);

		System.out.println("El volumen de la caja es de " + volumen);

		return volumen;

	}
}
