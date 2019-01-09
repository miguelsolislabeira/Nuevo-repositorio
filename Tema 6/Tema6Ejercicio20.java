public class Tema6Ejercicio20{
	public static void main(String[] args){
		
		System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
		int capacidad = Integer.parseInt(System.console().readLine());

		int llenado = (int)(Math.random() * (capacidad + 1));
		for (int i = 0; i < capacidad; i++) {
			if (i < (capacidad - llenado)) {
				System.out.println("*        *");
			} else {
					System.out.println("*========*");
			}
		}
				System.out.println("**********"); 
				System.out.println("En la cuba caben " + capacidad + " litros");
				System.out.print("La hemos llenado con " + llenado + " litros");
	}
}
				
		


		
		
		
