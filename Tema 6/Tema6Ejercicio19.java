public class Tema6Ejercicio19{
	public static void main(String[] args){
		
	int i = 0;	
	int sumaPares = 0;
	int sumaImpares = 0;
	int maxPar = -100;
	int minImpar = 200;
	int numero;
	int numPar = 0;
	int numImpar = 0;
	int todos = 0;
	
		for(i = 0; i<50; i++){
			
			 numero = (int)((Math.random()*301)-100);
			 
			 if(numero%2==0){
				 numPar= numero;
				 sumaPares+=numPar;
				 todos+=numero;
				 
				} if (numPar>maxPar){
				 maxPar = numPar;
				}
				 
			  if (numero%2 != 0){
				 numImpar = numero;
				 sumaImpares+=numero;
				 todos+=numero;
				 
				 if(numImpar<minImpar){
					 minImpar=numImpar;
				 }
			 }
			 
				System.out.println(numero);
			}
				System.out.println();
				System.out.println("Ha introducido: " + i + " números");
				System.out.println("La suma de los pares es: " + sumaPares);
				System.out.println("La suma de los impares es: " + sumaImpares);
				System.out.println("El máximo de los pares es: " + maxPar);
				System.out.println("El mínimo de los impares es: " + minImpar);
				System.out.println("La Media es: " + (todos/i));
		
	}
}
