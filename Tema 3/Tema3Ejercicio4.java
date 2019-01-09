public class Tema3Ejercicio4{
	public static void main(String[] args) {
		
		System.out.println("Introduzca la base del triángulo: ");
		int base = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca ahora la altura del triángulo: ");
		int altura = Integer.parseInt(System.console().readLine());
		
		int area = (base*altura)/2;
		
		System.out.println("El área del triángulo es: " + area);
		
		
	}
}

