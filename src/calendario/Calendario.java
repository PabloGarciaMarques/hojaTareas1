package calendario;

import java.time.LocalDate;
import java.time.Year;

public class Calendario {
	private int dia;
	private int mes;
	private int año;

	public Calendario(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;

	}

	public Calendario(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
		int año = LocalDate.now().getYear();
	}

	public Calendario() {
		this.dia = LocalDate.now().getDayOfMonth();
		this.mes = LocalDate.now().getMonthValue();
		this.año = LocalDate.now().getYear();
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public void incrementarDia() {
		if (dia >= 30 && mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			this.dia = 1;
			mes++;
		}
	}

	public void incrementarMes() {
		mes++;
		if (mes > 12) {
			mes = 1;
			año++;
		}
	}

	public void incrementarAño() {
		año++;
	}

	public void mostrarFecha() {
		System.out.println("Hoy es dia " + this.dia + " del " + this.mes + " del " + this.año);
	}

	public void cambioNumerosMeses() {

		switch (this.mes)

		{
		case 1:
			System.out.println("Enero");
			break;

		case 2:
			System.out.println("Febrero");
			break;

		case 3:
			System.out.println("Marzo");
			break;

		case 4:
			System.out.println("Abril");
			break;

		case 5:
			System.out.println("Mayo");
			break;

		case 6:
			System.out.println("Junio");
			break;

		case 7:
			System.out.println("Julio");
			break;

		case 8:
			System.out.println("Agosto");
			break;

		case 9:
			System.out.println("Septiembre");
			break;

		case 10:
			System.out.println("Octubre");
			break;

		case 11:
			System.out.println("Noviembre");
			break;

		case 12:
			System.out.println("Diciembre");
			break;

		}

	}

	public void iguales(Calendario c2) {
		boolean iguales = this.dia == c2.dia && this.mes == c2.mes && this.año == c2.año;

	}

}
