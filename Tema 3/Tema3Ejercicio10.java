public class Tema3Ejercicio11{
	public static void main(String[] args) {
		
		System.out.println("Introduzca el número de Kb: ");
		int kilos = Integer.parseInt(System.console().readLine());
		
		int megas = kilos/1024;
		
		System.out.println(kilos + " Kb son: " + megas + "Mb");
		
		
		
		
	}
}

