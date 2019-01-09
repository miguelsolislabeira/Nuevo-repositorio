public class Tema5Ejercicio21{
	public static void main(String[]args){
		
		int numeros;
		int sumaImpares=0;
		int contadorImpares=0;
		int impares=0;
		int maxPar=1;
		int minPar=1;
		
		do{
			System.out.println("Introduzca números enteros separados por INTRO. Negativo para terminar");
			numeros = Integer.parseInt(System.console().readLine());
			
			if(numeros<0){
				System.out.println("Adiós");
			}
					
			
			if ((numeros%2!=0)&&(numeros>0)){
				sumaImpares+=numeros;
				contadorImpares++;
				
			} else if ((numeros%2==0) && (numeros>0)){
				maxPar=numeros;
			}
			
			if(numeros>maxPar){
				minPar=maxPar;
			}
				
		
		}while(numeros>0);
		System.out.println("La media de los impares es " + sumaImpares/contadorImpares);
		System.out.println("El número par más alto es: " + maxPar);
					
	}
}
