import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Hoja9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		devolverEntero();
	}

	public static void tarea2() {
		String ruta = "C:\\Users\\Alumno\\Desktop\\eclipse-workspace\\Tareas1\\src\\tareas 1.txt";

		try {
			FileReader reader = new FileReader(ruta);
			BufferedReader buffer = new BufferedReader(reader);
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(ruta));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

		}

	}

	public static void devolverEntero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entero por teclado.");
		String num = sc.nextLine();
		if (num.matches("\\d*")) {
			System.out.println("El numero introducido es el: " + num);
		} else {
			System.out.println("Tipo de dato introducido incorrecto.");
		}
	}

}
