import java.util.Scanner;

public class tarea1 {

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
