package Herencia;

public class Rectanguloa extends Figura{
       String Color;

       public void mostrarColor() {
   		System.out.println("El color del Rectangulo es: " + Color);
       }
       
       double area() {
    	   
    	   return base*altura;
       }
	
	public static void main(String[] args) {
		
Rectanguloa rectangulo1 = new Rectanguloa();
		
		
		rectangulo1.base=8.4;
		rectangulo1.altura=3.8;
		rectangulo1.Color="Rojo";
		
		System.out.println("Caracteristicas del Rectangulo 1: ");
		rectangulo1.mostrarDimension();
		rectangulo1.mostrarColor();
		System.out.println("Area del Rectangulo 1: " + rectangulo1.area());
	}

}
