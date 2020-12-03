package hcl.interfacehandson;

public class Square implements Polygon {
	public double calcPeri(double len, double bre) {
		return 4 * len;
	}

	public double Area(double len, double bre) {
		return (len * bre);
	}

}
