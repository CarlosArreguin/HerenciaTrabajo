package Herencia;

public class Triangulo extends Figura{
	String color;
 
	public void mostrarColor() {
		System.out.println("El color deltriangulo es: " + color);
		

	}
	
	double area() {
		
		return base*altura/2;
	}
	
	public static void main(String[] args) {
		Triangulo triangulo1 = new Triangulo();
		
		
		triangulo1.base=4.5;
		triangulo1.altura=5.3;
		triangulo1.color="Azul";
		
		System.out.println("Caracteristicas del triangulo 1: ");
		triangulo1.mostrarDimension();
		triangulo1.mostrarColor();
		triangulo1.area();
		
		/// Triangulo 2
		
        Triangulo triangulo2 = new Triangulo();
		
		
		triangulo2.base=8.7;
		triangulo2.altura=9.5;
		triangulo2.color="Rojo";
		
		System.out.println("Caracteristicas del triangulo 2: ");
		triangulo2.mostrarDimension();
		triangulo2.mostrarColor();
		triangulo2.area();
		
	
		
	}

}
