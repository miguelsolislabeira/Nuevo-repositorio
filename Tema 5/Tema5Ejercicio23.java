public class Tema5Ejercicio23{
	public static void main(String[] args){
		
		int numeros;
		int suma=0;
		int contador=0;
		
		do{
			System.out.println("Vaya introduciendo números separados por INTRO");
			numeros= Integer.parseInt(System.console().readLine());
			suma+=numeros;
			contador++;
			
		}while (suma<10);
		
		int media = (suma/contador);
		System.out.println(suma);
		System.out.println(media);
		System.out.println(contador);
		
	}
}
			
