public class Tema2Ejercicio6{
	public static void main(String[] args) {
		
		System.out. println("Bienvenido al calculador mágico de IVA");
		
		double baseImponible = 1009;
		
		System.out.printf("La base imponible es: %.2f euros \n", baseImponible);
		System.out.printf("El Iva es: " + (baseImponible*0.21) + " euros\n");
		System.out.printf("El total de su factura es: %.2f euros", (baseImponible*1.21));
		

		
	}
}

