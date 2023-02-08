package entites;

public class Retangulo {
	public double Width;
	public double Height;


	public double area() {
	// metodo que retorna a área de um retangulo.
	return Width * Height;
}
	
	public double perimetro() {
		// metodo que retorna o perimetro de um retangulo.
		return (Width + Height) * 2;
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(Width,2)+Math.pow(Height, 2)));
	}

}