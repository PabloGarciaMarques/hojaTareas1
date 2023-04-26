import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class tareas5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = { 2, 5, 66, 5, 2, 34, 43, 66, 21, 21, 21, 43, 44, 5, 16, 7, 87, 16, 7 };
		eliminarMayores(tabla, 35);
	}

	public static void ejercicio8() {
		int[] tabla = { 2, 5, 66, 5, 2, 34, 43, 66, 21, 21, 21, 43, 44, 5, 16, 7, 87, 16, 7 };
		int[] menores = eliminarMayores(tabla, 35);
		System.out.println(Arrays.toString(menores));
	}

	public static int[] eliminarMayores(int tabla[], int valor) {
		/*
		 * Creamos una tabla vacia y añadimos a ésta todos los elementos que son menores
		 * o iguales a valor
		 */
		int[] menores = new int[0];
		System.out.println(Arrays.toString(tabla));
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] <= valor) {
				// ampliamos el array menores en una unidad
				menores = Arrays.copyOf(menores, menores.length + 1);
				// introducimos el nuevo valor en la última posición
				menores[menores.length - 1] = tabla[i];
			}
		}
		System.out.println(Arrays.toString(menores));
		return menores;
	}

	public static void tarea1() {

		int i = 0;

		int[] aleatorios = new int[12];

		for (i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = (int) ((int) 99 * Math.random() + 1);
		}
		System.out.println(Arrays.toString(aleatorios));
	}

	public static void tarea2() {

		double[] tablaOriginal = new double[5];
		int i = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce 5 números decimales:");

		for (i = 0; i < tablaOriginal.length; i++) {

			tablaOriginal[i] = sc.nextDouble();

		}
		System.out.println(Arrays.toString(tablaOriginal));

		for (i = tablaOriginal.length - 1; i >= 0; i--) {

			System.out.println(tablaOriginal[i]);
		}

	}

	public static void tarea3() {
		int i = 0, max = 0;

		int[] aleatorios = new int[12];

		for (i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = (int) ((int) 99 * Math.random() + 1);

			if (aleatorios[i] > max) {
				max = aleatorios[i];
			}
		}

		System.out.println(Arrays.toString(aleatorios));
		System.out.println(max);

	}

	public static void tarea4() {
		Scanner sc = new Scanner(System.in);
		int tabla1 = sc.nextInt();
		int tabla2 = sc.nextInt();
		int[] arrayPares = rellenaPares(tabla1, tabla2);
		for (int i = 0; i < tabla1; i++) {
			System.out.println(arrayPares[i]);
		}
		main(null);
	}

	public static int[] rellenaPares(int tabla1, int tabla2) {
		int[] dasdasdgdfd = new int[tabla1];
		for (int i = 0; i < tabla1; i++) {
			dasdasdgdfd[i] = ((int) (Math.random() * tabla2 + 1));
			if (dasdasdgdfd[i] % 2 != 0) {
				dasdasdgdfd[i] = dasdasdgdfd[i] + 1;
			}
		}
		return dasdasdgdfd;
	}

	public static void tarea5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("di 6 numeros");
		int[] numerosJugador = new int[6];
		for (int i = 0; i < 6; i++) {
			numerosJugador[i] = sc.nextInt();
		}
		System.out.println("otros 6");
		int[] numerosGanador = new int[6];
		for (int i = 0; i < 6; i++) {
			numerosGanador[i] = sc.nextInt();
		}
		int vecesquesiporquesifueraquenoseriaquenoperoesquesi = wertyuiopasdfghjklñ(numerosGanador, numerosJugador);
		System.out.println((vecesquesiporquesifueraquenoseriaquenoperoesquesi) + " son iguales");
		System.out.println((vecesquesiporquesifueraquenoseriaquenoperoesquesi / 6) + " son iguales");
		main(null);
	}

	public static int wertyuiopasdfghjklñ(int[] numerosJugador, int[] numerosGanador) {
		int aciertos = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (numerosJugador[i] == numerosGanador[j]) {
					aciertos++;
				}
			}
		}
		return aciertos;

	}

	public static void tarea6() {
		Scanner sc = new Scanner(System.in);
		int[] tabla = new int[4];
		int[] tablaInvertida = new int[0];
		int indice = 0;

		for (int i = 0; i < 4; i++) {
			tabla[i] = sc.nextInt();

		}
		Arrays.sort(tabla);
		for (int i = tabla.length - 1; i >= 0; i--) {
			tablaInvertida[indice] = tabla[i];
			indice++;
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(tablaInvertida[i]);
		}
		main(null);
	}

	public static void tarea7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tamaño del array??");
		int n = sc.nextInt();
		int[] tabla = new int[n];
		int[] par = new int[n];
		int[] impar = new int[n];
		System.out.println("Valores del array");
		for (int i = 0; i < n; i++) {
			tabla[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (tabla[i] % 2 == 0) {
				par[i] = tabla[i];
			} else {
				impar[i] = tabla[i];
			}
		}
		Arrays.sort(par);
		Arrays.sort(impar);
		System.out.println("Pares:");
		for (int i = 0; i < n; i++) {
			if (par[i] != 0)
				System.out.println(par[i] + "");
		}
		System.out.println("Impares:");
		for (int i = 0; i < n; i++) {
			if (impar[i] != 0)
				System.out.println(impar[i]);
		}
		main(null);
	}

	public static void tarea8() {
		Scanner sc = new Scanner(System.in);
		int[] tabla = new int[5];
		System.out.println("añade 5 valores a la tabla");
		for (int i = 0; i < 5; i++) {
			tabla[i] = sc.nextInt();
		}
		System.out.println("Valor discriminante");
		int discriminante = sc.nextInt();
		int[] arrayFinal = eliminarMayores(discriminante, tabla);
		for (int i = 0; i < 5; i++) {
			if (arrayFinal[i] != 0) {
				System.out.println(arrayFinal[i]);
			}
		}
		main(null);
	}

	public static int[] eliminarMayores(int discriminante, int[] tabla) {
		int[] aux = new int[5];
		for (int i = 0; i < 5; i++) {
			if (tabla[i] <= discriminante) {
				aux[i] = tabla[i];
			}
		}
		return aux;
	}

	public static void tarea9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("dificultad:");
		int dificultad = sc.nextInt();
		boolean logracion = false;
		int[] combinacion = new int[dificultad];
		for (int i = 0; i < dificultad; i++) {
			combinacion[i] = (int) (Math.random() * 5 + 1);
		}
		while (logracion == false) {
			logracion = camaraDeLosSecretos(combinacion, dificultad);
		}
		System.out.println("Lo has adivinado!!!");
		main(null);
	}

	public static boolean camaraDeLosSecretos(int combinacion[], int dificultad) {
		Scanner sc = new Scanner(System.in);
		boolean logracion = false;
		int aux = 0;
		System.out.println("Adivina el numero");
		for (int i = 0; i < dificultad; i++) {
			System.out.println("digito numero: " + (i + 1));
			int respuesta = sc.nextInt();
			if (respuesta > combinacion[i]) {
				System.out.println("el digito numero " + (i + 1) + " de la combinacion es menor");
			} else if (respuesta < combinacion[i]) {
				System.out.println("el digito numero " + (i + 1) + " de la combinacion es mayor");
			} else {
				System.out.println("el digito numero " + (i + 1) + " de la combinacion es correcto");
				logracion = false;
				aux++;
			}
		}
		if (aux == dificultad) {
			logracion = true;
		}
		return logracion;

	}

	public static void tarea10() {
		int[][] num = new int[5][5];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				num[i][j] = i + j;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println();
			for (int j = 0; j < num.length; j++) {
				System.out.print(2 * (num[i][j]) + " ");
			}
		}
		main(null);
	}

	public static void tarea11() {
		Scanner sc = new Scanner(System.in);
		float[] primerTrimestre = new float[5];
		float[] segundoTrimestre = new float[5];
		float[] tercerTrimestre = new float[5];
		float mediaPriTri = 0;
		float mediaSegTri = 0;
		float mediaTerTri = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Trimestre 1, Alumno " + (i + 1) + " nota:");
			float respuesta = sc.nextFloat();
			primerTrimestre[i] = (float) respuesta;
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Trimestre 2, Alumno " + (i + 1) + " nota:");
			float respuesta = sc.nextFloat();
			segundoTrimestre[i] = (float) respuesta;
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Trimestre 3, Alumno " + (i + 1) + " nota:");
			float respuesta = sc.nextFloat();
			tercerTrimestre[i] = (float) respuesta;
		}
		for (int i = 0; i < 5; i++) {
			mediaPriTri = mediaPriTri + primerTrimestre[i];
		}
		System.out.println("Media primer trimestre: " + (mediaPriTri / 5));
		for (int i = 0; i < 5; i++) {
			mediaSegTri = mediaSegTri + segundoTrimestre[i];

		}
		System.out.println("Media segundo trimestre: " + (mediaSegTri / 5));
		for (int i = 0; i < 5; i++) {
			mediaTerTri = mediaTerTri + tercerTrimestre[i];

		}
		System.out.println("Media tercer trimestre: " + (mediaTerTri / 5));
		for (int i = 0; i < 5; i++) {
			System.out.println("Media Alumno " + (i + 1) + ": "
					+ ((primerTrimestre[i] + segundoTrimestre[i] + tercerTrimestre[i]) / 3));
		}
		main(null);
	}

	public static void tarea12() {
		Scanner sc = new Scanner(System.in);
		int[] sueldo = new int[30];
		int i = 1;
		int j = 0;
		int aux = 0;
		int aux2 = 0;
		int aux3 = 1000000;
		int respuesta = 0;
		while (respuesta != -1) {
			System.out.println("Sueldo persona " + i + ":");
			respuesta = sc.nextInt();
			if (respuesta != -1) {
				sueldo[j] = respuesta;
				i++;
				j++;
			}
		}
		Arrays.sort(sueldo);
		for (int k = 0; k < 30; k++) {
			if (sueldo[k] != 0) {
				System.out.println(sueldo[k]);
			}

		}
		int[] invertido = new int[j];
		for (int e = 0, w = sueldo.length - 1; e < sueldo.length; e++, w--) {
			invertido[w] = sueldo[e];
		}
		sueldo = invertido;
		for (int k = 0; k < sueldo.length - 1; k++) {
			if (sueldo[k] != 0) {
				System.out.println(sueldo[k]);
			}
		}
		for (int k = 0; k < 30; k++) {
			if (sueldo[k] > aux2) {
				aux2 = sueldo[k];

			}
		}
		System.out.println("mayor salario: " + aux2);
		for (int k = 0; k < 30; k++) {
			if (sueldo[k] < aux3 && sueldo[k] != 0) {
				aux3 = sueldo[k];

			}
		}
		System.out.println("menor salario: " + aux3);
		main(null);
	}

	public static void tarea13() {
		Scanner sc = new Scanner(System.in);
		int[] t = new int[5];
		int[] u = new int[5];
		System.out.println("clave:");
		int clave = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			System.out.println("posicion indice: " + i);
			t[i] = sc.nextInt();
		}
		int v[] = buscarTodos(t, clave, u);
		for (int i = 0; i < 5; i++) {
			if (v[i] != 0) {
				System.out.println(v[i]);
			}
		}
		main(null);
	}

	public static int[] buscarTodos(int t[], int clave, int u[]) {
		for (int i = 0; i < 5; i++) {
			if (t[i] == clave) {
				u[i] = i;
			}
		}
		return u;
	}

	public static void tarea14() {
		Scanner sc = new Scanner(System.in);
		int[] t = new int[5];
		System.out.println("di cinco valores");
		for (int i = 0; i < 5; i++) {
			t[i] = sc.nextInt();
		}
		int v[] = aleatoriazor(t);
		for (int i = 0; i < 5; i++) {
			System.out.println(v[i]);
		}
		main(null);
	}

	private static int[] aleatoriazor(int[] t) {
		int ind;
		Random random = new Random();
		for (int i = t.length - 1; i > 0; i--) {
			ind = random.nextInt(i + 1);
			if (ind != i) {
				t[ind] ^= t[i];
				t[i] ^= t[ind];
				t[ind] ^= t[i];
			}
		}
		return t;
	}

	public static void tarea15() {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[5][5];
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				System.out.print("| ");
				System.out.print((int) (Math.random() * 2 + 1));
				System.out.print(" |");
			}
			System.out.println();
		}
		System.out.println("coordenada inicial x:");
		int cordinx = sc.nextInt();
		System.out.println("coordenada inicial y:");
		int cordiny = sc.nextInt();
		System.out.println("coordenada final x:");
		int cordfinx = sc.nextInt();
		System.out.println("coordenada final y:");
		int cordfiny = sc.nextInt();
		encuentracosas(cordfiny, cordfinx, cordiny, cordinx, matriz);
	}

	public static boolean encuentracosas(int cordfiny, int cordfinx, int cordiny, int cordinx, int[][] matriz) {
		boolean llegar = false;
		System.out.println("x: " + cordinx + " y: " + cordiny);
		while ((cordinx != cordfinx) && (cordiny != cordfiny)) {
			cordinx++;
			System.out.println("x: " + cordinx + " y: " + cordiny);
			if (matriz[(cordinx)][cordiny] == 1) {
				System.out.println("x: " + cordinx + " y: " + cordiny);
				cordiny++;
				cordinx--;
			} else if (matriz[(cordinx)][cordiny] == 1) {
				System.out.println("x: " + cordinx + " y: " + cordiny);

			} else {
				System.out.println("x: " + cordinx + " y: " + cordiny);
			}
		}
		return llegar;
	}

	public static void tarea16() {

	}
}