public class Tema4Ejercicio11 {
	public static void main (String[] args){
		
		System.out.println("Dime qué hora es (De 0 a 23)");
		int hora = Integer.parseInt(System.console().readLine());
		System.out.println("Dime cuántos minutos pasan de la hora");
		int minutos = Integer.parseInt(System.console().readLine());
		int horaSegundos= (hora*3600);
		int horaminutos= (minutos*60);
		
		if((hora==0) && (minutos==0)){
			System.out.println("Es medianoche y faltan 86400 segundos para la próxima medianoche");
			
		}else{
		
		System.out.println("Faltan " + (86400-(horaSegundos+horaminutos)) + " segundos para la medianoche");
		
		}
	}
}
