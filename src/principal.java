
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Peliculas p1 = new Peliculas("Toy Story", "John Lasseter", "81 minutos", "Comedia");
		Peliculas p2 = new Peliculas("Saw", "James Wan", "111 minutos", "Terror");
		Peliculas p3 = new Peliculas("En busca del arca perdida", "George Lucas", "115 minutos", "Aventura");

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

}
