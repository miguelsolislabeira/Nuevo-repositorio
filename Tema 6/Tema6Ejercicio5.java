public class Tema6Ejercicio5{
	public static void main(String[] args){

		int numero;
		int max = 100;
		int min = 199;
		int contador =0;
		int suma = 0;
	
		
		
		for(int i = 0; i<50; i++){	
			
			numero = (int)((Math.random()*100)+100);
			
			System.out.println(numero);
			suma +=numero;
			contador++;
			
				if(numero<min){
					min=numero;
				}
				
				if(numero>max){
					max=numero;
				}
		}
			
			System.out.println();
			System.out.println(suma/contador);
			System.out.println(max);
			System.out.println(min);
		}
	}
	
		
				                         
		
