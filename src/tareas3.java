import java.util.Scanner;

public class tareas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea2();
	}

	public static void tarea1() {
		int num;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce un número:");

			num = sc.nextInt();
			if (num == 0) {
				System.out.println("Fin del programa");
				break;
			}
			int cuadrado = num * num;
			if (num > 0) {
				System.out.println("El número es positivo");
			} else {
				System.out.println("El número es negativo");
			}
			if (num % 2 == 0) {
				System.out.println("El número es par");
			} else {
				System.out.println("El número es impar");
			}

		} while (num != 0);

		sc.close();
	}

	public static void tarea2() {
		int edad, alumnos = 0, MayoresEdad = 0, edadTotal = 0, alumnosTotales = 0, mediaEdad;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce una edad:");

			edad = sc.nextInt();
			edadTotal += edad;
			alumnosTotales += alumnos;

			if (edad > 0 && edad < 18) {
				alumnos++;

			} else if (edad >= 18) {
				alumnos++;
				MayoresEdad++;
			}
			if (edad == 0) {

				mediaEdad = edadTotal / (alumnosTotales - 1);
				System.out.println("Hay " + alumnos + " alumnos de los cuales " + MayoresEdad
						+ " son mayores de edad, y la media de edad es de " + mediaEdad + " años.");
				break;

			}
		} while (edad > 0);
		sc.close();
	}

	public static void tarea3() {
		int numS = (int) (99 * Math.random() + 1);
		int numJ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número e intenta adivinar el número secreto entre 1 y 100:");

		do {

			numJ = sc.nextInt();

			if (numJ < numS) {

				System.out.println("El número que buscamos es mayor.");

			} else if (numJ > numS) {

				System.out.println("El número que buscamos es menor.");

			} else if (numJ == numS) {
				System.out.println("Has acertado el número secreto titán");
				break;
			}
		} while (numJ != numS);
		sc.close();
	}

	public static void tarea4() {
		int k = 0, altura = 0, indiceArbolMasAlto = 0, alturaArbolMasAlto = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce la altura del árbol " + k);
			altura = sc.nextInt();
			if (altura > alturaArbolMasAlto) {
				indiceArbolMasAlto = k;
				alturaArbolMasAlto = altura;
			}
			k++;
		} while (altura != -1);
		System.out
				.println("El árbol más alto es el de índice " + indiceArbolMasAlto + " que mide " + alturaArbolMasAlto);

		/*
		 * int alturaMaxima = 0,id = 0,altura;
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * do { System.out.
		 * println("Introduce la altura de un árbol en cm, introducir -1 terminará el programa."
		 * );
		 * 
		 * altura=sc.nextInt(); if(altura>alturaMaxima) { id++; }else
		 * if(altura<alturaMaxima) { id=id; }else if(altura==-1) {
		 * System.out.println("El árbol mas alto mide "+alturaMaxima+" y tiene el id "
		 * +id); break; }
		 * 
		 * 
		 * }while(altura!=-1);
		 */

	}

	public static void tarea5() {
		int num1, num2;
		int resultado = 0;
		int respuesta;
		int racha = 0;

		Scanner sc = new Scanner(System.in);

		do {
			num1 = (int) (99 * Math.random() + 1);
			num2 = (int) (99 * Math.random() + 1);
			resultado = num1 + num2;

			System.out.println("Suma estos dos números: " + num1 + " + " + num2);

			respuesta = sc.nextInt();

			if (respuesta == resultado) {
				racha++;
			} else if (respuesta != resultado) {
				System.out
						.println("Lástima, has fallado, has conseguido una racha de " + racha + " aciertos seguidos.");
				break;
			}

		} while (resultado == respuesta);
		sc.close();
	}

	public static void tarea6() {
		int num = 0;
		Scanner sc = new Scanner(System.in);

		for (num = 0; num < 101; num++) {

			if (num % 2 == 0 && num % 3 == 0 && num % 8 != 0) {
				System.out.println("Los números multiplos de 2 y 3 menores que 100 son: " + num);

			}

		}
	}

	public static void tarea7() {
		int num = 0;
		Scanner sc = new Scanner(System.in);

		for (num = 0; num < 101; num++) {

			if (num % 7 == 0) {
				System.out.println("Los números multiplos de 7 menores que 100 son: " + num);

			}
		}
	}

	public static void tarea8() {
		int num, factorial = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para calcular su factorial:");
		num = sc.nextInt();

		while (num != 1) {

			factorial = factorial * num;
			num--;

		}

		System.out.println("El factorial de ese número es: " + factorial);
	}

	public static void tarea9() {// revisar no
		double notas, id;
		int suspensos = 0, aprobados = 0, notables = 0, sobresalientes = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la primera nota:");
		notas = sc.nextDouble();
		System.out.println("Introduce le segunda nota:");
		notas = sc.nextDouble();
		System.out.println("Introduce la tercera nota:");
		notas = sc.nextDouble();
		System.out.println("Introduce la cuarta nota:");
		notas = sc.nextDouble();
		System.out.println("Introduce la quinta nota:");
		notas = sc.nextDouble();
		System.out.println("Introduce la sexta nota:");
		notas = sc.nextDouble();

		for (id = 0; id < 7; id++) {
			if (notas <= 4.9) {
				suspensos++;
			} else if (notas > 4.0 && notas < 7.0) {
				aprobados++;
			} else if (notas > 7.0 && notas < 8.9) {
				notables++;
			} else if (notas > 8.9 && notas <= 10) {
				sobresalientes++;
			}

		}
		System.out.println("Ha habido " + suspensos + " suspensos " + aprobados + " suficientes " + notables
				+ " notables y " + sobresalientes + " sobresalientes");
		sc.close();
	}

	public static void tarea10() {
		int decimal = 0, resto;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el número decimal que quieres convertir en binario:");

		decimal = sc.nextInt();

		do {
			resto = decimal % 2;
			decimal = decimal / 2;
			System.out.print(resto);

		} while (decimal > 1);
		System.out.println(decimal);

	}

	public static void tarea11(int k) {
		int totalPrimos = 0;
		boolean esPrimo = true;

		/*
		 * El bucle externo recorrerá todos los números desde 2 hasta k, el número
		 * elegido
		 */
		for (int i = 2; i <= k; i++) {
			// Recorro todos los números entre 2 y el número que está siendo estudiado
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					esPrimo = false;
					break;
				}
			}
			if (esPrimo) {
				System.out.println("Numero :" + i);
				totalPrimos++;
			}
			esPrimo = true;
		}
		System.out.println("Total primos" + totalPrimos);
	}

	public static void tarea12() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca numero de filas: ");
		int numFilas = sc.nextInt();
		sc.close();

		System.out.println();
		for (int altura = 1; altura <= numFilas; altura++) {

			for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
				System.out.print(" ");
			}

			for (int asteriscos = 1; asteriscos <= (altura * 2) - 1; asteriscos++) {
				System.out.print("*");
			}
		}
	}
}
