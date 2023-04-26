package caja;

public class TestCaja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caja c1 = new Caja(2.45, 1.7, 3.8, "hola");
		Caja c2 = new Caja("la concha de tu hermana");
		c1.CalcularVolumen();
		c2.CambiarEtiqueta("akjsdhfkjashdfkjdhasfashdfkjhaskjdhfkjashfkhasdf");
		c1.representacion();
	}

}
