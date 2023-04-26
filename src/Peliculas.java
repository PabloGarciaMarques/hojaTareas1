
public class Peliculas {

	public String titulo;
	public String director;
	public String duracionMinutos;
	public String genero;

	public Peliculas(String titulo, String director, String duracionMinutos, String genero) {
		this.titulo = titulo;
		this.director = director;
		this.duracionMinutos = duracionMinutos;
		this.genero = genero;

	}

	public Peliculas() {
	}

	public void devolverTitulo() {
		System.out.println("El titulo de la pelicula es: " + titulo);
	}

	public void devolverDirector() {
		System.out.println("El nombre del director es: " + director);
	}

	public void devolverduracionMinutos() {
		System.out.println("La duración de la es pelicula es: " + duracionMinutos + " minutos");
	}

	public void devolverGenero() {
		System.out.println("El genero de esta película es: " + genero);
	}

	public void InformacionPelicula() {
		System.out.println("La pelicula " + titulo + " esta dirigida por " + director + " cuenta con una "
				+ "duracion de " + duracionMinutos + " minutos, y pertenece al genero " + genero);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(String duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String toString() {
		String valor = "Titulo: " + this.titulo + "\nDirector: " + this.director + "\nDuracion: " + this.duracionMinutos
				+ "\nGenero: " + this.genero + "\n-----------------------------------";
		return valor;
	}

}