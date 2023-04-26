
public class baloncesto {

	private static String[] ciudades = { "'Palencia'", "'Valladolid'", "'Barcelona'", "'Madrid'", "'Zamora'", "'Vigo'",
			"'Burgos'", "'Sevilla'" };
	private static String[] tipoEquipo = { "'S.A.D.'", "'A.D.'", "'Club Deportivo'", "'C.B.'" };
	private static String[] nombreCorto = { "'Pal'", "'Vall'", "'Bar'", "'Mad'", "'Zam'", "'Vigo'", "'Bur'", "'Sev'" };

	public static void main(String[] args) {
		generarJugadores(80);

	}

	public static void generarEquipos(int n) {
		for (int i = 1; i < (n + 1); i++) {
			int idEquipo = i;
			String pais = "'Espana'";
			int aleatorioCiudad = (int) (Math.random() * 8);
			int aleatorioTipoEquipo = (int) (Math.random() * 4);
			int aleatorionombreCorto = (int) (Math.random() * 8);
			String nombre = ciudades[aleatorioCiudad] + " " + tipoEquipo[aleatorioTipoEquipo] + " "
					+ nombreCorto[aleatorionombreCorto];

			String nombreCorto = ciudades[aleatorioCiudad];

			System.out.println("INSERT INTO equipo (idEquipo,nombre, localidad, pais, nombreCorto)" + " values (" + i
					+ "," + nombre + "," + nombreCorto + "," + pais + "," + nombreCorto + ");");

		}

	}

	private static String[] nombres = { "'Pedro'", "'David'", "'Carlos'", "'Ricardo'", "'Luis'", "'Antonio'",
			"'Pepe'" };
	private static String[] apellidos = { "'Rodriguez'", "'Garcia'", "'Duque'", "'Rivas'", "'Hernandez'", "'Izquierdo'",
			"'Perez'" };
	private static int[] alturacm = { 189, 200, 194, 185, 204, 196, 198 };
	private static String[] nacionalidad = { "'Espaniola'", "'Argentina'", "'Portuguesa'", "'Britanica'", "'Marroqui'",
			"'Uruguaya'" };
	private static double[] alturaM = { 1.89, 2.00, 1.94, 1.85, 2.04, 1.96, 1.98 };
	private static int[] edad = { 19, 21, 25, 24, 23, 20, 30, 29, 31 };
	private static int[] idequipo = { 1, 2, 3, 4, 5, 6, 7, 8 };

	public static void generarJugadores(int n) {
		for (int i = 1; i < (n + 1); i++) {
			int aleatorioidEquipo = (int) ((Math.random() * 7) + 1);
			int idJugador = i;
			int aleatorioEdad = (int) (Math.random() * 8) + 1;
			int aleatorioNombre = (int) (Math.random() * 6) + 1;
			int aleatorioApellidos = (int) (Math.random() * 6) + 1;
			int aleatorioAlturaCm = (int) (Math.random() * 6) + 1;

			int aleatorioNacionalidad = (int) (Math.random() * 5) + 1;
			String nombre = idequipo[aleatorioidEquipo] + "," + nombres[aleatorioNombre] + ","
					+ apellidos[aleatorioApellidos] + "," + alturacm[aleatorioAlturaCm] + "," + edad[aleatorioEdad]
					+ "," + nacionalidad[aleatorioNacionalidad];

			System.out.println(
					"INSERT INTO jugador (idJugador, idEquipo, nombre, apellidos, alturaCm, edad, nacionalidad)"
							+ "values (" + i + "," + nombre + ");");
		}
	}

	private static int[] puntoslocal = { 80, 100, 97, 109, 87, 79, 88 };
	private static int[] puntosVisitante = { 100, 75, 87, 112, 106, 99, 88 };
	private static int[] equipoLocal = { 1, 2, 3, 4, 5, 6, 7, 8 };
	private static int[] equipoVisitante = { 1, 2, 3, 4, 5, 6, 7, 8 };

	public static void generarPartidos(int n) {

		for (int i = 1; i < (n + 1); i++) {
			int idPartido = i;
			int aleatorioPuntosLocal = (int) (Math.random() * 6) + 1;
			int aleatoriosPuntosVisitante = (int) (Math.random() * 6) + 1;
			int aleatorioEquipoLocal = (int) (Math.random() * 6) + 1;
			int aleatorioEquipoVisitante = (int) (Math.random() * 6) + 1;

			String partido = equipoLocal[aleatorioEquipoLocal] + "," + puntoslocal[aleatorioPuntosLocal] + ","
					+ equipoVisitante[aleatorioEquipoVisitante] + "," + puntosVisitante[aleatorioEquipoVisitante];

			System.out.println(
					"INSERT INTO partido(idPartido, equipoLocal, puntosLocal, equipoVisitante, puntosVisitante)"
							+ "values (" + i + "," + partido + ");");
		}

	}

	private static int[] idP = { 1, 2, 3, 4, 5, 6, 7 };
	private static int[] puntos = { 0, 15, 2, 3, 4, 7, 11, 20, 18, 16 };
	private static int[] rebotes = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
	private static int[] valoracion = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	private static int[] asistencias = { 0, 1, 2, 3, 4, 5, 6, 7 };
	private static int[] tapones = { 0, 1, 2, 3, 4, 5, 6 };

	public static void generardatosJugadorPartido(int n) {

		for (int i = 1; i < (n + 1); i++) {
			int idJugador = i;
			int aleatorioidPartido = (int) (Math.random() * 6) + 1;
			int aleatoriopuntosAnotados = (int) (Math.random() * 9) + 1;
			int aleatoriorebotes = (int) (Math.random() * 9) + 1;
			int aleatoriovaloracion = (int) (Math.random() * 9) + 1;
			int aleatorioasistencias = (int) (Math.random() * 6) + 1;
			int aleatoriotapones = (int) (Math.random() * 5) + 1;

			String datosjugadorpartido = idP[aleatorioidPartido] + "," + valoracion[aleatoriovaloracion] + ","
					+ puntos[aleatoriopuntosAnotados] + "," + asistencias[aleatorioasistencias] + ","
					+ rebotes[aleatoriorebotes] + "," + tapones[aleatoriotapones];

			System.out.println(
					"INSERT INTO datosjugadorpartido(idJugador, idP, valoracion, puntos, asistencias, rebotes, tapones)"
							+ "values (" + i + "," + datosjugadorpartido + ");");

		}
	}

}
