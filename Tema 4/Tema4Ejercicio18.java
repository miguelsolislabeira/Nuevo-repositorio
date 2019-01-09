public class Tema4Ejercicio18{
	public static void main(String[] args){
		
		System.out.println("Introduzca un número de hasta 5 cifras y le diré la primera del mismo");
		int numero = Integer.parseInt(System.console().readLine());
		
		if(numero <10){
			System.out.println("La primera cifra es: " + numero);
		
		}else if ((numero >=10) && (numero <100)){
			System.out.println("La primera cifra es: " + numero/10);
			
		}else if ((numero>=100) && (numero<1000)){
			System.out.println("La primera cifra es: " + numero/100);
			
		}else if ((numero>=1000) && (numero<10000)){
			System.out.println("La primera cifra es: " + numero/1000);
			
		}else if ((numero>=10000) && (numero<=99999)){
			System.out.println("La primera cifra es: " + numero/10000);
			
		}else if(numero>99999){
			System.out.println("EL número tiene más de 5 cifras");
		}
	}
}
