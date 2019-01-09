public class Tema4Ejercicio25{
	public static void main(String[] args){
		
		System.out.println("Escoja en centímetros el alto de la bandera de la República");
		int alto = Integer.parseInt(System.console().readLine());
		
		System.out.println("Introduzca en centímetros el ancho de la bandera de la República");
		int ancho = Integer.parseInt(System.console().readLine());
		
		System.out.println("Desea que el Himno de Riego suene de fondo? s/n?");
		String himno1 = System.console().readLine();
		double himno = 0;
		
		double gastosEnvio = 3.25;
	
		double tamaño = (alto*ancho)/100;
		
		System.out.println("Precio de la bandera: " + tamaño + " euros");
		
		switch (himno1){
			
			case "s": 
			himno = 2.50;
			System.out.println("2,50 €");
			break;
			
			case "no":
			himno = 0;
			System.out.println("Sin himno: 0 €");
			
		}
		System.out.println("Gastos de envío: " + gastosEnvio + " euros");
		
		System.out.println("Total: " + (tamaño + himno + gastosEnvio) + " euros");
		
	}
}
		
