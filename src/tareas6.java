import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.text.Collator;
import java.util.ArrayList;

public class tareas6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea5();
	}

	public static void tarea1() {

		String frase = new String();
		Scanner sc = new Scanner(System.in);
		int longitud = frase.length();
		int x = 0, espacios = 0;

		System.out.println("Introduce una frase:");

		frase = sc.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				espacios++;
			}
		}
		System.out.println(espacios);

	}

	public static void tarea2() {

		String frase = new String();
		String inversa = new String();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase:");

		frase = sc.nextLine();

		for (int i = frase.length() - 1; i >= 0; i--) {
			inversa += frase.charAt(i);
		}
		System.out.println(inversa);
	}

	public static void tarea3() {

		String frase = new String();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase:");

		frase = sc.nextLine();

		frase = frase.replaceAll("a", " ");
		frase = frase.replaceAll("e", " ");
		frase = frase.replaceAll("i", " ");
		frase = frase.replaceAll("o", " ");
		frase = frase.replaceAll("u", " ");

		System.out.println(frase);
	}

	public static void tarea4() {

		int i = 0;
		Scanner sc = new Scanner(System.in);
		String texto = new String();
		String palabra = new String();

		int encuentros = 0;

		System.out.println("Inroduce una frase");
		texto = sc.nextLine();
		System.out.println("Introduce una palabra para buscar:");
		palabra = sc.nextLine();

		for (i = 0; i <= texto.length(); i++) {
			if (texto(i) == palabra) {
				encuentros++;
			}
		}
		System.out.println(encuentros);

	}

	public static void tarea5() {
		String palabra1 = new String();
		String palabra2 = new String();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una palabra:");
		palabra1 = sc.nextLine();
		char[] chars1 = palabra1.toCharArray();
		Arrays.sort(chars1);

		System.out.println("Introduce otra palabra:");
		char[] chars2 = palabra2.toCharArray();
		Arrays.sort(chars2);

	}

	private static String texto(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void tarea9() {
		// de nada guapo
		int indiceNum = 0;
		int indiceNom = 0;
		String[] nombres = new String[0];
		String[] numeros = new String[0];
		agenda(indiceNum, indiceNom, nombres, numeros);
	}

	public static void agenda(int indiceNum, int indiceNom, String[] nombres, String[] numeros) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Agenda:");
		System.out.println("1.- añadir contacto");
		System.out.println("2.- buscar numero");
		System.out.println("3.- lista de contactos");
		int eleccion = sc.nextInt();
		if (eleccion == 1) {
			añadirContacto(indiceNum, indiceNom, nombres, numeros);
		} else if (eleccion == 2) {
			buscarNumero(indiceNum, indiceNom, nombres, numeros);
		} else if (eleccion == 3) {
			listaContactos(indiceNum, indiceNom, nombres, numeros);
		} else {
			System.out.println("del 1 al 3 bro");
			agenda(indiceNum, indiceNom, nombres, numeros);
		}
	}

	public static void añadirContacto(int indiceNum, int indiceNom, String[] nombres, String[] numeros) {
		Scanner sc = new Scanner(System.in);
		numeros = Arrays.copyOf(numeros, numeros.length + 1);
		nombres = Arrays.copyOf(nombres, nombres.length + 1);
		System.out.print("nombre: ");
		String nombre = sc.nextLine();
		nombres[indiceNom] = nombre;
		indiceNom++;
		System.out.print("numero: ");
		String numero = sc.nextLine();
		numeros[indiceNum] = numero;
		indiceNum++;
		System.out.println("");
		agenda(indiceNum, indiceNom, nombres, numeros);
	}

	public static void buscarNumero(int indiceNum, int indiceNom, String[] nombres, String[] numeros) {
		Scanner sc = new Scanner(System.in);
		boolean aux = false;
		System.out.print("nombre del contacto: ");
		String nombre = sc.nextLine();
		for (int i = 0; i < nombres.length; i++) {
			if (nombre.equals(nombres[i])) {
				System.out.println("el numero de " + nombre + " es: " + numeros[i]);
				aux = true;
			}
			if (aux == false) {
				System.out.println("No hay ningun contacto con ese nombre");
			}
			System.out.println("");
			agenda(indiceNum, indiceNom, nombres, numeros);
		}

	}

	public static void listaContactos(int indiceNum, int indiceNom, String[] nombres, String[] numeros) {
		// Arrays.sort(nombres);
		// Arrays.sort(numeros);
		// esto ordena tbn los numeros de menor a mayor estonces no sirve, en el
		// enunciado decia de hacerlo de otra forma pero meh
		for (int i = 0; i < (nombres.length); i++) {
			System.out.println("Contacto " + (i + 1));
			System.out.println("nombre: " + nombres[i]);
			System.out.println("numero: " + numeros[i]);
			System.out.println("");
		}
		agenda(indiceNum, indiceNom, nombres, numeros);
	}
}
