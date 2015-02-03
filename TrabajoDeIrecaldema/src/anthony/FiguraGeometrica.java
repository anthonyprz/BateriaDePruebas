package anthony;

public abstract class FiguraGeometrica {
	
	private String nombre;
	private Double base, altura;

//setters
	public void setBase(double base) {
		this.base = base;
	 }	
	public void setAltura(double altura) {
		this.altura = altura;
	
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	 }
//getters
	public double getBase() {
		return base;
	}
	/*public*/ double getAltura() {
		return altura;
	}
	
	/*public*/ String getNombre() {
		return nombre;
	}
	
	
//metodos
	/*protected*/ abstract double area();//ya que es default no puede ser utilizado en una usbclase que este fuera del paquete
	protected abstract double perimetro();//con un protected si se puede utilizar en una subclase fuera del paquete
	
	public void mostrar() {
		System.out.println("\nDatos de la figura geometrica: ");
	}
	
}