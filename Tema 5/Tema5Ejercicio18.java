public class Tema5Ejercicio18{
	public static void main(String[]args){
		
		int numero1;
		int numero2;
		
		do{
			System.out.println("Introduzca dos números enteros separados por INTRO");
			numero1 = Integer.parseInt(System.console().readLine());
			numero2 = Integer.parseInt(System.console().readLine());
			
			if(numero1==numero2){
				System.out.println("Los números son iguales");
			}
		}while (numero1==numero2);
		
		if (numero1<numero2){
			
			for(int i =numero1;i<=numero2;i+=7){
				System.out.println(i);
			}
		}else if(numero2<numero1){
			
			for(int j = numero2;j<=numero1;j+=7){
				System.out.println(j);
			}
		}
			
	}
}
		
		
