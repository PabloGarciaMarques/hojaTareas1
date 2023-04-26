package calendario;

import calendario.Calendario;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendario c1 = new Calendario(3, 4, 2002);
		Calendario c2 = new Calendario(32, 1, 2022);

		c2.incrementarDia();
		c2.mostrarFecha();
	}

}
