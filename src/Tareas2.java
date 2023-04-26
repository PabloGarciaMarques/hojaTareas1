import java.util.Scanner;

public class Tareas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea13();
		// (int)k*Math.random()

		// (b-a+1)Math.random()+a
	}

	public static void tarea1() {
		int num1, num2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número:");

		num1 = sc.nextInt();

		System.out.println("Introduce otro número:");

		num2 = sc.nextInt();

		if (num1 == num2) {
			System.out.println("Los dos números son iguales.");

		} else {
			System.out.println("Los números son distintos");

		}
		sc.close();
	}

	public static void tarea2() {
		int num1, num2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número:");

		num1 = sc.nextInt();

		System.out.println("Introduce otro número:");

		num2 = sc.nextInt();

		if (num1 > num2) {

			System.out.println("El primer número es mayor al segundo");

		} else {
			System.out.println("El segundo número es mayor al primero");

		}
		sc.close();

	}

	public static void tarea3() {
		int a, b, c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número:");

		a = sc.nextInt();

		System.out.println("Introduce un segundo número:");

		b = sc.nextInt();

		System.out.println("Introduce un tercer número:");

		c = sc.nextInt();

		if (a > b && b > c) {

			System.out.println("Estos números ordenados de mayor a menor serían: " + a + " " + b + " " + c);

		} else if (a > b && c > b) {

			System.out.println("Estos números ordenados de mayor a menor serían: " + a + " " + c + " " + b);

		} else if (a < b && a > c) {

			System.out.println("Estos números ordenados de mayor a menor serían: " + b + " " + a + " " + c);

		} else if (a < b && b > c) {

			System.out.println("Estos números ordenados de mayor a menor serían: " + b + " " + c + " " + a);

		} else if (c > b && b > a) {

			System.out.println("Estos números ordenados de mayor a menor serían: " + c + " " + b + " " + a);

		} else if (c > b && a > b) {

			System.out.println("Estos números ordenados de mayor a menor serían: " + c + " " + a + " " + b);
		}
		sc.close();

	}

	public static void tarea4() {
		int a, b, c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el valor del primer coeficiente:");

		a = sc.nextInt();

		System.out.println("Introduce el valor del segundo coeficiente:");

		b = sc.nextInt();

		System.out.println("Introduce el valor del tercer coeficiente:");

		c = sc.nextInt();

		double discriminante = Math.sqrt((b * b) - (4 * a * c));

		double solucion1 = ((-b) + discriminante / (2 * a));

		double solucion2 = ((-b) - discriminante / (2 * a));

		if (a != 0 && (b * b) - (4 * a * c) > 0) {

			System.out.println("Las soluciones de esta ecuación son: " + solucion1 + " y " + solucion2);

		} else if (a != 0 && (b * b) - (4 * a * c) == 0) {

			System.out.println("La única solución de esta ecuacion es: " + solucion1);

		} else if (a == 0) {

			System.out.println("La ecuación no tiene solución.");

		} else if (discriminante < 0) {

			System.out.println("La ecuación no tiene solución");
		}
		sc.close();

	}

	public static void tarea5() {
		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero entre 0 y 99999");

		numero = sc.nextInt();

		if (numero >= 0 && numero < 10) {

			System.out.println("El número tiene una sola cifra");

		} else if (numero >= 10 && numero < 100) {

			System.out.println("El número tiene dos cifras");

		} else if (numero >= 100 && numero < 1000) {

			System.out.println("EL número tiene tres cifras");

		} else if (numero >= 1000 && numero < 10000) {

			System.out.println("El número tiene cuatro cifras");

		} else if (numero >= 10000 && numero < 100000) {

			System.out.println("El número tiene cinco cifras");

		}
		sc.close();
	}

	public static void tarea6() {
		int nota;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu nota media:");

		nota = sc.nextInt();

		switch (nota) {
		case 0, 1, 2, 3, 4:
			System.out.println("Has suspendido");
			break;
		case 5:
			System.out.println("Tu nota es de suficiente");
			break;
		case 6:
			System.out.println("Tu nota es de bien");
			break;
		case 7, 8:
			System.out.println("Tu nota es de notable");
			break;
		case 9, 10:
			System.out.println("Tu nota es de sobresaliente");
		}
		sc.close();
	}

	public static void tarea7() {
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número entre 1 y 7:");

		num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("Hoy es Lunes");
			break;
		case 2:
			System.out.println("Hoy es Martes");
			break;
		case 3:
			System.out.println("Hoy es Miércoles");
			break;
		case 4:
			System.out.println("Hoy es Jueves");
			break;
		case 5:
			System.out.println("Hoy es Viernes");
			break;
		case 6:
			System.out.println("Hoy es Sábado");
			break;
		case 7:
			System.out.println("Hoy es Domingo");
			sc.close();
		}

	}

	public static void tarea8() {
		int dia, mes, anio;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce número de día:");
		dia = sc.nextInt();

		System.out.println("Introduce un número de mes:");
		mes = sc.nextInt();

		System.out.println("Introduce un año:");
		anio = sc.nextInt();

		if (dia > 31) {

			System.out.println("Fecha introducida no válida");

		} else if (mes > 12) {

			System.out.println("Fecha introducida no válida");

		} else if (dia > 30 && mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) {

			System.out.println("Fecha introducida no valida");

		} else if (dia == 30 && mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			dia = 1;
			mes = mes + 1;
			System.out.println("Mañana es:" + dia + " " + mes + " " + anio);

		} else if (dia == 31 && mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) {
			dia = 1;
			mes = mes + 1;
			System.out.println("Mañana es:" + dia + " " + mes + " " + anio);

		} else if (dia == 31 && mes == 12) {
			dia = 1;
			mes = 1;
			anio = anio + 1;
			System.out.println("Mañana es:" + dia + " " + mes + " " + anio);

		} else if (dia == 28 && mes == 2 && (anio % 400 != 0)) {
			dia = 1;
			mes = mes + 1;
			System.out.println("Mañana es:" + dia + " " + mes + " " + anio);

		} else if (dia == 29 && mes == 2 && (anio % 400 == 0)) {
			dia = 1;
			mes = mes + 1;
			System.out.println("Mañana es:" + dia + " " + mes + " " + anio);
		}

		sc.close();

	}

	public static void tarea9() {
		int seg, min, horas;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la hora actual:");

		horas = sc.nextInt();

		System.out.println("Introduce los minutos actuales:");

		min = sc.nextInt();

		System.out.println("Introduce los segundos actuales:");

		seg = sc.nextInt() + 5;

		if (seg >= 60) {

			seg = seg - 60;
			min++;

			if (min >= 60) {

				min = min - 60;
				horas++;

			}
			System.out.println("Dentro de cinco segundos seran las " + horas + " horas," + min + " minutos y " + seg
					+ " segundos");

		}
		sc.close();
	}

	public static void tarea10() {
		int DNI;
		int suma;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tus números del DNI:");

		DNI = sc.nextInt();

		suma = DNI % 23;

		switch (suma) {

		case 0:
			System.out.println("La letra de tu DNI es la T");
			break;

		case 1:
			System.out.println("La letra de tu DNI es la R");
			break;

		case 2:
			System.out.println("La letra de tu DNI es la W");
			break;

		case 3:
			System.out.println("La letra de tu DNI es la A");
			break;

		case 4:
			System.out.println("La letra de tu DNI es la G");
			break;

		case 5:
			System.out.println("La letra de tu DNI es la M");
			break;

		case 6:
			System.out.println("La letra de tu DNI es la Y");
			break;

		case 7:
			System.out.println("La letra de tu DNI es la F");
			break;

		case 8:
			System.out.println("La letra de tu DNI es la P");
			break;

		case 9:
			System.out.println("La letra de tu DNI es la D");
			break;

		case 10:
			System.out.println("La letra de tu DNI es la X");
			break;

		case 11:
			System.out.println("La letra de tu DNI es la B");
			break;

		case 12:
			System.out.println("La letra de tu DNI es la N");
			break;

		case 13:
			System.out.println("La letra de tu DNI es la J");
			break;

		case 14:
			System.out.println("La letra de tu DNI es la Z");
			break;

		case 15:
			System.out.println("La letra de tu DNI es la S");
			break;

		case 16:
			System.out.println("La letra de tu DNI es la Q");
			break;

		case 17:
			System.out.println("La letra de tu DNI es la V");
			break;

		case 18:
			System.out.println("La letra de tu DNI es la H");
			break;

		case 19:
			System.out.println("La letra de tu DNI es la L");
			break;

		case 20:
			System.out.println("La letra de tu DNI es la C");
			break;

		case 21:
			System.out.println("La letra de tu DNI es la K");
			break;

		case 22:
			System.out.println("La letra de tu DNI es la E");
			break;
		}
		sc.close();
	}

	public static void tarea11() {
		int num1, num2, resultado, respuesta;

		Scanner sc = new Scanner(System.in);

		num1 = (int) (99 * Math.random() + 1);

		num2 = (int) (99 * Math.random() + 1);

		resultado = num1 + num2;

		System.out.println("Suma estos dos números " + num1 + " + " + num2 + ":");

		respuesta = sc.nextInt();

		if (respuesta == resultado) {
			System.out.println("Enhorabuena has acertado.");

		} else if (respuesta != resultado) {
			System.out.println("Lástima, has fallado.");

		}
		sc.close();
	}

	public static void tarea12() {
		int num1, num2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número positivo o negativo:");

		num1 = sc.nextInt();

		num2 = (num1 > 0) ? num1 : num1 * -1;

		System.out.println("El valor absoluto de ese número es: " + num2);

		sc.close();
	}

	public static void tarea13() {
		int num1, num2, resultado, respuesta, operacion;

		Scanner sc = new Scanner(System.in);

		num1 = (int) (99 * Math.random() + 1);

		num2 = (int) (99 * Math.random() + 1);

		operacion = (int) (3 * Math.random() + 1);

		switch (operacion) {
		case 1:
			System.out.println("Suma estos dos números " + num1 + " + " + num2 + ":");

			resultado = num1 + num2;
			respuesta = sc.nextInt();

			if (respuesta == resultado) {
				System.out.println("Enhorabuena has acertado.");

			} else if (respuesta != resultado) {
				System.out.println("Lástima, has fallado.");

			}
			break;

		case 2:
			System.out.println("Resta estos dos números " + num1 + " - " + num2 + ":");

			resultado = num1 - num2;
			respuesta = sc.nextInt();

			if (respuesta == resultado) {
				System.out.println("Enhorabuena has acertado.");

			} else if (respuesta != resultado) {
				System.out.println("Lástima, has fallado.");

			}
			break;

		case 3:

			System.out.println("Multiplica estos dos números " + num1 + " * " + num2 + ":");

			resultado = num1 * num2;
			respuesta = sc.nextInt();

			if (respuesta == resultado) {
				System.out.println("Enhorabuena has acertado.");

			} else if (respuesta != resultado) {
				System.out.println("Lástima, has fallado.");

			}
			break;

		case 4:
			System.out.println("Divide estos dos números " + num1 + " - " + num2 + ":");

			resultado = num1 / num2;
			respuesta = sc.nextInt();

			if (respuesta == resultado) {
				System.out.println("Enhorabuena has acertado.");

			} else if (respuesta != resultado) {
				System.out.println("Lástima, has fallado.");
			}
			break;
		}
		sc.close();
	}
}
