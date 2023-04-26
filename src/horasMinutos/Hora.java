package horasMinutos;

import java.util.Scanner;

public class Hora {

	public int hora;
	public int minuto;

	public Hora(int hora, int minuto) {
		super();
		this.hora = hora;
		this.minuto = minuto;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public void incrementarMinutos() {
		minuto++;

		if (minuto >= 60) {
			minuto = minuto - 60;
			hora++;
		}
		System.out.println("Son las " + hora + " y " + minuto);

	}

	public void setMinutos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor que quieres asignar a los minutos:");
		this.minuto = sc.nextInt();
		boolean cambioMinutos = false;
		if (minuto > 59) {
			System.out.println("No se ha podido introducir ese valor en el campo de los minutos " + cambioMinutos);
			cambioMinutos = false;

		} else {
			cambioMinutos = true;
			System.out.println("Valor añadido correctamente. " + cambioMinutos);

		}

	}

	public boolean setHoras() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor que quieres asignar a las horas:");
		this.hora = sc.nextInt();

		if (hora > 24 || hora < 0) {
			System.out.println("No se ha podido introducir ese valor en el campo de las horas ");

		} else {

			System.out.println("Valor añadido correctamente. ");

		}

		return false;

	}

	public void representacion() {
		System.out.println("Son las " + hora + ":" + minuto);
	}
}
