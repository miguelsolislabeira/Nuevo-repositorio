public class Tema5Ejercicio8{
	public static void main(String[] args){

		System.out.println("Introduzca un número y le diré su tabla de multiplicar");
		int numero = Integer.parseInt(System.console().readLine());
		System.out.println();
		
		for(int i = 0; i <=10; i++){
			System.out.println(numero + " x " + i + " = " + numero*i);
		}

	}
}



