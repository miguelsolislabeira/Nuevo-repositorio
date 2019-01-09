public class Tema5Ejercicio27{
	public static void main(String[] args){
		
		int numeroIntroducido;
		
		
			System.out.println("Introduzca un número mayor que 1: ");
			numeroIntroducido=Integer.parseInt(System.console().readLine());
			
			
			int suma=0;
			int acumulador=0;
		for(int i =1; i<numeroIntroducido; i++){
			
			if(i%3==0){
				
				System.out.println(i);
				acumulador ++;
				suma+=i;
				
			}
		}
		
		System.out.println("La suma de los números es: " + suma);
		System.out.println("Hay un total de " + acumulador + " numeros");
	}
}
