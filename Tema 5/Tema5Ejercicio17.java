public class Tema5Ejercicio18{
	public static void main(String[]args){
		
		do{
			System.out.println("Introduzca dos números enteros separados por INTRO");
			int numero1 = Integer.parseInt(System.console().readLine());
			int numero2 = Integer.parseInt(System.console().readLine());
			
			if(numero1==numero2){
				System.out.println("Los números son iguales");
			}
		}while (numero1==numero2);
			
	}
}
		
		
