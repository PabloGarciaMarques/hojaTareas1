import java.util.Scanner;

public class tareas4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio9Bucles(2, 20);
	}

	public static void tarea1(int a, int b) {
		int i = 0;

		for (i = a; i <= b; i++) {
			System.out.println(i);
		}
	}

	public static void tarea2(int a, int b, int c) {

		int i = 0, j = 0;

		for (i = a; i <= b; i++) {

			if (i % 2 == 0) {

				System.out.println(i);

			}
		}

		for (j = b; j <= c; j++) {

			if (j % 3 == 0) {

				System.out.println(j);
			}

		}

	}

	public static void tarea3(double radio, double altura) {

		double volumen = Math.PI * altura * (radio * radio);
		System.out.println(volumen);
	}

	public static void tarea4(int a, int b) {

		if (a > b) {
			System.out.println(a);

		} else {
			System.out.println(b);
		}
	}

	public static void tarea5(char letra) {

		boolean vocal;

		if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' || letra == 'a' || letra == 'e'
				|| letra == 'i' || letra == 'o' || letra == 'u') {
			vocal = true;

		} else {
			vocal = false;
		}

		System.out.println(vocal);
	}

	public static void tarea6(int num) {
		boolean primo = false;
		int i = 0;

		for (i = 2; i < num; i++) {

			if (num % 2 == 0) {
				primo = false;
			} else if (num % 2 == 0 && num % 3 == 0) {
				primo = false;
			} else if (num % 2 != 0 && num % 3 != 0) {
				primo = true;
			}

		}
		System.out.println(primo);

	}

	public static int tarea7(int a, int b, int operacion) {
		int resultado = 0;

		switch (operacion) {

		case 1:
			resultado = a + b;

			System.out.println("La suma de estos dos números es: " + resultado);

			break;
		case 2:
			resultado = a - b;

			System.out.println("La resta de estos dos números es: " + resultado);

			break;
		case 3:
			resultado = a * b;

			System.out.println("La multiplicación de estos dos números es: " + resultado);

			break;
		case 4:
			if (b == 0) {
				System.out.println("No es posible dividir por 0");
			} else {

				resultado = a / b;

				System.out.println("La división de estos números es: ");

				break;
			}
		}
		return resultado;

	}

	public static void tarea4(int a, int b, int c) {

		if (a > b && a > c) {
			System.out.println("El mayor es: " + a);

		} else if (b > a && b > c) {
			System.out.println("El mayor es: " + b);

		} else if (c > a && c > b) {
			System.out.println("El mayor es: " + c);

		}

	}

	public static int tarea9(int base, int exponente) {
		int i;
		int resultado = base;
		if (exponente > 0) {

			if (exponente == 0)
				return 1;
			else
				return base * tarea9(base, exponente - 1);
		}

		return resultado;
	}

	public static int tarea10(int n) {
		int n1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");

		n1 = sc.nextInt();

		if (n1 == 0) {
			return 0;

		} else if (n1 == 1) {
			return 1;
		} else {

			return tarea10(n1 - 1) + tarea10(n1 - 2);
		}

	}

	public static double tarea11(int x1, int x2, int y1, int y2) {
		double distancia = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		return distancia;
	}

	public static int tarea12(int horas1, int minutos1, int segundos1, int horas2, int minutos2, int segundos2) {

		int segundosTotales1 = (horas1 * 3600) + (minutos1 * 60) + segundos1;

		int segundosTotales2 = (horas2 * 3600) + (minutos2 * 60) + segundos2;

		int resultado = segundosTotales2 - segundosTotales1;

		System.out.println(+resultado);
		return resultado;

	}

	public static int tarea13(int a, int b, int i) {

		for (i = a; i <= b; i++) {

			int numsA = (int) Math.random();

			System.out.println(+numsA);

		}
		return 0;

	}

	public static int tarea14(int factor, int nuM) {
		Scanner teclado = new Scanner(System.in);
		double factorial;
		int num;
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		factorial = 1;

		for (int i = num; i > 0; i--) {
			factorial = factorial * i;

		}
		System.out.println("El factorial de " + num + " es: " + factorial);
		return factor;

	}

	public static void tarea15() {
		int nfilas = 10;
		int[] a = new int[1];
		{
			for (int i = 1; i <= nfilas; i++) {
				int[] x = new int[i];
				for (int j = 0; j < i; j++) {
					if (j == 0 || j == (i - 1)) {
						x[j] = 1;
					} else {
						x[j] = a[j] + a[j - 1];
					}
					System.out.print(x[j] + " ");
				}
				a = x;
				System.out.println();
			}
		}
	}

	public static long ejercicio9Bucles(int base, int exponente) {
		long potencia = 1;
		for (int i = 0; i < exponente; i++) {
			potencia *= base;
		}
		System.out.println(potencia);
		return potencia;
	}

}
