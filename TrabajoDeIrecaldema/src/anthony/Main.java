package anthony;

//import figuras.FiguraGeometrica2;
//import figuras.Rectangulo2;
//import figuras.Triangulo2;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.Enumeration;
public class Main {
	public static void main (String args[])	{
		char opcion;
		double base, altura;
		Scanner sc = new Scanner(System.in);
 
		System.out.print("\nElija la figura que quiere analizar: Rectangulo (R)  Triangulo (T) Salir (S)  "); 
		System.out.print("\n");
		opcion = sc.next().charAt(0);
		
		Hashtable<Integer,FiguraGeometrica> historial =new Hashtable<Integer,FiguraGeometrica>();
		int contador=0;
		
		while (opcion!='S'&&opcion!='s') {
			if(opcion=='T'||opcion=='t') {
				System.out.print("\ningresa la base del triangulo a analizar: ");
				base = sc.nextDouble();
  
				System.out.print("\ningresa la altura del triangulo a analizar: ");
				altura = sc.nextDouble();
 
				Triangulo triangulo = new Triangulo(base,altura);

				triangulo.mostrar();
				
				contador++;
				historial.put(contador,triangulo);
			}
			else  if(opcion=='R'||opcion=='r') { 
				System.out.print("\ningresa la base del rectangulo a analizar: ");
				base = sc.nextDouble();

				System.out.print("\ningresa la altura del rectangulo a analizar: ");
				altura = sc.nextDouble();   

				Rectangulo rectangulo = new Rectangulo(base,altura);

				rectangulo.mostrar();
				
				contador++;
				historial.put(contador,rectangulo);
			}
			else {
				System.out.println("\nVa a ser que no has escrito bien...");
				System.out.println("\nPrueba otra vez...");
			}

 			
			System.out.print("\nElija la figura que quiere analizar: Rectangulo (R)  Triangulo (T) Salir (S)"); 
			System.out.print("\n");
			opcion = sc.next().charAt(0);
		}
		
		System.out.println("\nHistorial:");
		Enumeration<FiguraGeometrica> enumeracion = historial.elements();
		Enumeration<Integer> llaves = historial.keys();
		
		/*
		//Enumeration<Integer> llaves = historial.keys();
		System.out.println("keys:");
	    while (llaves.hasMoreElements()) {
		    System.out.println("    "+"hashtable llaves: " + llaves.nextElement());
	    }*/
	    
		
		while (enumeracion.hasMoreElements()) {
			FiguraGeometrica temp = enumeracion.nextElement();
			System.out.println(llaves.nextElement()+"	nombre: " + temp.getNombre() +"	base: " + temp.getBase()+"	altura: "+temp.getAltura()+"	perimetro: " + temp.area()+"	area: " + temp.perimetro());
	    }
		
		System.out.println("\nAdios");
		sc.close();
	}
}