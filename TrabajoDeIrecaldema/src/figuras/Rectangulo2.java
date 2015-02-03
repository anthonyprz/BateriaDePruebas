package figuras;

public class Rectangulo2 extends FiguraGeometrica2 {

	public Rectangulo2(){};
	
	public Rectangulo2(double base, double altura) {
		setNombre("rectangulo");
		setBase(base);
		setAltura(altura);
	}
		
	@Override public double area() {
		double area = getBase()*getAltura();
		return area;
	}

	@Override public double perimetro() {
		double peri = 2*getBase()+2*getAltura();
		return peri;
	}
	
	final public void mostrar() {
	    super.mostrar();
		System.out.println("\nEl area del rectangulo es: " + area());
		System.out.println("\nEl perimetro del rectangulo es: " + perimetro());
	}
}