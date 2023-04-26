package poligono;

public class triangulo extends poligono {

	@Override
	double area() {
		double areatriangulo = (base * altura) / 2;
		return areatriangulo;
	}

}
