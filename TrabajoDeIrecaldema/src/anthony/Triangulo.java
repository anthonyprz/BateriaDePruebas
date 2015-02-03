package anthony;

public class Triangulo extends FiguraGeometrica {
public Triangulo(){};
	
	public Triangulo(double base, double altura) {
		setNombre("Triangulo");
		setBase(base);
		setAltura(altura);		
	}

	@Override public double area(){
		double area = getBase()*getAltura()/2;
		return area;
	}
	//Triángulo equilatero
	@Override public double perimetro() { //al hacer un override se puede cambiar el modificador en esta clase, en la super clase es protected
		double peri = getBase()*3;        //para poder utilizarlo en otro objeto
		return peri;
	}
	
	public void mostrar() {
	    super.mostrar();
		System.out.println("\nEl area del triangulo es: " + area());
		System.out.println("\nEl perimetro del triangulo es: " + perimetro());
	}
}
