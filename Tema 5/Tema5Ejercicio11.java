public class Tema5Ejercicio11{
	public static void main(String[] args){

		int numeroTeclado;
		
		System.out.println("Introduzca un número:");
		numeroTeclado = Integer.parseInt(System.console().readLine());
		System.out.println();
		
		for(int i = 0; i <5; i++){
		
			System.out.println("Numero introducido  Cuadrado del número  Cubo del número");
			System.out.println("------------------  -------------------  ----------------");
			System.out.printf("%10d %20d %15d \n", numeroTeclado, (numeroTeclado*numeroTeclado), (numeroTeclado*numeroTeclado*numeroTeclado));
			numeroTeclado++;
		}


	}
}



