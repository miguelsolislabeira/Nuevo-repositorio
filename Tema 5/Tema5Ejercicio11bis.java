public class Tema5Ejercicio11bis{
	public static void main(String[] args){

		System.out.println("Introduzca un número: ");
		int numeroIntroducido = Integer.parseInt(System.console().readLine());
	
		for(int i=numeroIntroducido;i<numeroIntroducido+5;i++){
			System.out.printf("%4d %6d % 8d \n", i,i*i,i*i*i);
		}


	}
}



