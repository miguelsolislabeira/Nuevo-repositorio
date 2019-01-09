public class Tema4Ejercicio5{
	public static void main(String[] args){
		
		System.out.println("Este programa resuelve ecuaciones del tipo ax + b = 0");
		System.out.println("Introduzca el valor de a: ");
		int a = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca el valor de la b: ");
		int b = Integer.parseInt(System.console().readLine());
		
		if (a==0){
			System.out.println("Esta ecuación no tiene solución");
			
		}else if (a!=0){
			
			System.out.println("x = " + b/a);
		}
	}
}
