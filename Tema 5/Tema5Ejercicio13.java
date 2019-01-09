public class Tema5Ejercicio13{
	public static void main(String[] args){

	int contador = 0;
	int positivo =0;
	int negativo =0;

	do{
		System.out.println("Introduzca un número y pulse INTRO");
		int numero = Integer.parseInt(System.console().readLine());
		contador++;
		
		if(numero>0){
			positivo++;
			
		}else if (numero<0){
			negativo++;
			
		}
		
	}while (contador<10);
	
	System.out.println("Ha introducido " + positivo + " número/s positivo/s y " + negativo + " número/s negativo/s");


	}
}



