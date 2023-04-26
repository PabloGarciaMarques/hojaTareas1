import java.util.Scanner;

public class tareas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea8();

	}

	public static void HolaMundo() {

		System.out.println("Hola Mundo");

	}

	public static void tarea1() {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");

		a = sc.nextInt();

		System.out.println("El numero que has introducido es el " + a);

		sc.close();

	}

	public static void tarea2() {
		int edad;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu edad:");

		edad = sc.nextInt();

		int edadFutura = edad + 3;

		System.out.println("Dentro de tres años tendras " + edadFutura + " años");

		sc.close();
	}

	public static void tarea3() {
		int añoActual, añoNacimiento;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu año de nacimiento:");

		añoNacimiento = sc.nextInt();

		System.out.println("Introduce el año actual:");

		añoActual = sc.nextInt();

		int edad = añoActual - añoNacimiento;

		System.out.println("Tu edad es de " + edad + " años.");

		sc.close();

	}

	public static void tarea4() {

		double nota1, nota2, nota3;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la primera nota con decimales:");

		nota1 = sc.nextDouble();

		System.out.println("Introduce la segunda nota con decimales:");

		nota2 = sc.nextDouble();

		System.out.println("Introduce la tercera nota con decimales:");

		nota3 = sc.nextDouble();

		double NotaMedia = (nota1 + nota2 + nota3) / 3;

		System.out.println("Tu nota media es de: " + NotaMedia);

		sc.close();
	}

	public static void tarea5() {

		double radio;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el radio de la circunferencia que quieres calcular en cm:");

		radio = sc.nextDouble();

		double area = radio * radio * Math.PI;

		double longitud = 2 * Math.PI * radio;

		System.out.println("El área de ese círculo es: " + area + " cm y su longitud es: " + longitud + " cm");

		sc.close();
	}

	public static void tarea6() {

		int edad;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu edad:");

		edad = sc.nextInt();

		if (edad >= 18) {
			System.out.println("Eres mayor de edad");

		} else {
			System.out.println("Eres menor de edad");
		}

		sc.close();

	}

	public static void tarea7() {
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número");

		num = sc.nextInt();

		if (num % 2 == 0) {

			System.out.println("El número es par");

		} else {

			System.out.println("El número es impar");
		}

		sc.close();

	}

	public static void tarea8() {

		/*
		 * boolean tareas,lluvia,biblioteca; boolean
		 * salir=(tareas&&!lluvia)[?true:false] boolean
		 * salir=(biblioteca||tareas)[?true:false]
		 */
		boolean tareas, lluvia, biblioteca;
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Vas a la biblioteca?");

		biblioteca = sc.nextBoolean();

		System.out.println("¿Esta lloviendo?");
		lluvia = sc.nextBoolean();

		System.out.println("¿Has terminado las tareas?");
		tareas = sc.nextBoolean();

		boolean salir = (tareas && !lluvia) || (biblioteca && tareas) ? true : false;

		if (salir == true) {
			System.out.println("Puedes salir");
		} else if (salir == false) {
			System.out.println("No puedes salir");
		}
		sc.close();

		/*
		 * if(biblioteca==true) { System.out.println("Puedes salir.");
		 * 
		 * }else if(biblioteca!=false) {
		 * System.out.println("¿Has terminado las tareas?"); tareas=sc.nextBoolean();
		 * 
		 * if(tareas==true) { System.out.println("¿Esta lloviendo?");
		 * lluvia=sc.nextBoolean();
		 * 
		 * if(lluvia==true) { System.out.println("No puedes salir.");
		 * 
		 * }else if(lluvia!=true) { System.out.println("Puedes salir"); }
		 * 
		 * }else if(tareas!=true) { System.out.println("No puedes salir"); } }
		 * sc.close();
		 */

	}

	public static void tarea9() {

		double kilosPeras1, kilosManzanas1, kilosPeras2, kilosManzanas2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce los kilos de manzanas que has vendido el primer semestre:");

		kilosManzanas1 = sc.nextDouble();

		System.out.println("Introduce los kilos de peras que has vendido el primer semestre:");

		kilosPeras1 = sc.nextDouble();

		System.out.println("Introduce los kilos de manzanas que has vendido el segundo semestre:");

		kilosManzanas2 = sc.nextDouble();

		System.out.println("Introduce los kilos de peras que has vendido el segundo semestre:");

		kilosPeras2 = sc.nextDouble();

		double GananciaManzanas1 = kilosManzanas1 * 2.35;

		double GananciaPeras1 = kilosPeras1 * 1.95;

		double GananciaManzanas2 = kilosManzanas2 * 2.35;

		double GananciaPeras2 = kilosPeras2 * 1.95;

		double GananciasTotales = GananciaManzanas1 + GananciaPeras1 + GananciaManzanas2 + GananciaPeras2;

		double GananciaManzanas = GananciaManzanas1 + GananciaManzanas2;

		double GananciaPeras = GananciaPeras1 + GananciaPeras2;

		System.out.println("Con las manzanas has ganado " + GananciaManzanas + "€ y con las peras " + GananciaPeras
				+ "€ en total son " + GananciasTotales + "€");

		sc.close();

	}

	public static void tarea10() {
		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");

		numero = sc.nextInt();

		Math.abs(numero);

		System.out.println("El valor absoluto de ese número es: " + (Math.abs(numero)));

		sc.close();
	}

	public static void tarea11() {
		int a, b, c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el valor de a:");

		a = sc.nextInt();

		System.out.println("Introduce el valor de b:");

		b = sc.nextInt();

		System.out.println("Introduce el valor de c:");

		c = sc.nextInt();

		double solucion1 = (((-b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));

		double solucion2 = ((-b) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);

		System.out.println("Las soluciones son " + solucion1 + " y " + solucion2);

		sc.close();
	}

	public static void tarea12() {
		int segundosIniciales;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una cantidad de segundos: ");

		segundosIniciales = sc.nextInt();

		int horas = segundosIniciales / 3600;
		int minutos = (segundosIniciales - (horas * 3600)) / 60;
		int segundosFinales = segundosIniciales - (horas * 3600 + minutos * 60);

		System.out.println("Esos segundo corresponden a " + horas + " horas, " + minutos + " minutos, y "
				+ segundosFinales + " segundos.");

		sc.close();

	}

	public static void tarea13() {
		double base, altura;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la base de tu triángulo:");

		base = sc.nextDouble();

		System.out.println("Intoroduce la altura de tu triángulo:");

		altura = sc.nextDouble();

		double area = (base * altura) / 2;

		System.out.println("El área de tu triángulo es: " + area);

		sc.close();

	}

	public static void tarea14() {
		int entradasInf, entradasAdul;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el número de entradas infantiles que deseas comprar:");

		entradasInf = sc.nextInt();

		System.out.println("Introduce el número de entradas de adulto que deseas comprar:");

		entradasAdul = sc.nextInt();

		double costeTotal = (entradasInf * 15.50) + (entradasAdul * 20.00);

		if (costeTotal > 100) {
			costeTotal = costeTotal - (costeTotal * 0.05);
		}
		System.out.println("El precio total de tus entradas es de: " + costeTotal);

		sc.close();
	}

}
