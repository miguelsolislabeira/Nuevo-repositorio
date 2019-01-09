public class Tema5Ejercicio7{
	public static void main(String[] args){

		int numeroSecreto = 1234;
		int numero;
		int intentos =4;
		
		do{
			System.out.println("Introduce el número secreto (4 cifras)");
			numero = Integer.parseInt(System.console().readLine());
			intentos--;
		}while ((intentos>0) && (numero!=numeroSecreto));
		
		

	
		
	}
}



