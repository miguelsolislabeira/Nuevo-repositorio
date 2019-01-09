public class Tema4Ejercicio6 {
	public static void main (String[] args) {
		
		System.out.println("Por favor introduzca la altura desde la que cae el objeto");
		double h = Double.parseDouble(System.console().readLine());
		
		System.out.printf("El tiempo que tarda en caer es: %.2f segundos", Math.sqrt((2*h)/9.81));
		
	}
}
