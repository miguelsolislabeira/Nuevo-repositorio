public class Tema4Ejercicio19{
	public static void main(String[] args){
		
		System.out.println("Introduzca un número positivo o negativo de hasta 5 cifras");
		int numero = Integer.parseInt(System.console().readLine());
		
		if ((numero>=-9) && (numero <10)){
			System.out.println("El número tiene una cifra");
			
		}else if ((numero>=-99) && (numero<100)){
			System.out.println("El número tiene dos cifras");
			
		}else if ((numero>=-999) && (numero<1000)){
			System.out.println("El número tiene tres cifras");
			
		}else if ((numero>=-9999) && (numero<10000)){
			System.out.println("El número tiene cuatro cifras");
			
		}else if ((numero>=-99999) && (numero<100000)){
			System.out.println("El número tiene cinco cifras");
		
		}else{
				System.out.println("El número tiene más de cinco cifras");
		}
	}
}
