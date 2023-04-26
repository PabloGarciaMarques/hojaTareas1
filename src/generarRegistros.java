import java.util.Arrays;
import java.util.Random;

public class generarRegistros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nombres = { "Asus", "Nvidia", "Razer", "NewSkill", "Sony", "Microsoft", "Bethesda", "Fnatic", "Koi",
				"Rogue" };
		String[] apellidos = { "raton", "teclado", "tarjetaGrafica", "PlacaBase", "Microprocesador", "Monitor" };

		System.out.println("insert into fabricante (codigo, nombre) values");
		;
		int maximo = 11;
		for (int i = 0; i < maximo; i++) {
			int numeroAleatorio = new Random().nextInt(9999);
			String nombreAleatorio = (String) obtenerAleatorio(nombres);
			// String apellidoAleatorio = (String) obtenerAleatorio(apellidos);
			if (i != (maximo - 1)) {
				System.out.println("(" + numeroAleatorio + "," + "'" + nombreAleatorio + "'),");
				// } else {
				// System.out.println("("+nombreAleatorio+"','"+apellidoAleatorio+"');");
			}
		}

	}

	public static Object obtenerAleatorio(Object[] array) {
		int random = new Random().nextInt(array.length);
		return array[random];
	}

}