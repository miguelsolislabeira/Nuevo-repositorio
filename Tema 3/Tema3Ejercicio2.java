public class Tema3Ejercicio2{
	public static void main(String[] args) {
		
		System.out.println("Bienvenido al conversor mágico de euros a pesetas.");
		System.out.println("Por favor, introduzca la cantidad en euros que desea convertir");
		double euros = Integer.parseInt(System.console().readLine());
		
		double pesetas = euros*166.386;
		
		System.out.printf("%.2f euros son: %.2f pesetas", euros, pesetas);
		
		

		
	}
}

