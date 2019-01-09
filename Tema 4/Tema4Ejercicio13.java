public class Tema4Ejercicio13 {
	public static void main(String[] args){
		
		System.out.println("Introduzca 3 números enteros positivos separados por INTRO y se los ordenaré:");
		int a = Integer.parseInt(System.console().readLine());
		int b = Integer.parseInt(System.console().readLine());
		int c = Integer.parseInt(System.console().readLine());
		int aux;
		
		if(a> b){
		
		aux = a;
		a = b;
		b = aux;
		
		}if (b>c){
			
		aux = b;
		b = c;
		c = aux;
		
		}if (a>b){
		
		aux = a;
		a = b;
		b= aux;
			
		}
		
		System.out.println(a+ " " + b + " " + c);
		
	}
}
