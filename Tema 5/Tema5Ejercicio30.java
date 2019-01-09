public class Tema5Ejercicio30{
	public static void main(String[] args){
		
		int dia1;
		int hora1;
		int dia2;
		int hora2;
		
		do{
			
			System.out.println("Introduzca el primer día (1-7) y la primera hora (0-23):");
			dia1 = Integer.parseInt(System.console().readLine());
			hora1 = Integer.parseInt(System.console().readLine());
		
			System.out.println("Introduzca el segundo día (1-7) y la segunda hora (0-23):");
			dia2 = Integer.parseInt(System.console().readLine());
			hora2 = Integer.parseInt(System.console().readLine());
			if((dia1>dia2) || ((hora1<0) || (hora1>23)) || ((hora2<0) || (hora2>23))){
				
			System.out.println("Ha introducido algún parámetro incorrecto");
			System.out.println("Recuerde que el primer día no puede ser mayor que el segundo y que las horas van de 0 a 23");
			}
		
		}while ((dia1>dia2) || ((hora1<0) || (hora1>23)) || ((hora2<0) || (hora2>23)));
		
		int primeraCifra = (dia1*24)+(hora1-24);
		int segundaCifra = (dia2*24)+(hora2-24);
		
		System.out.println("Faltan " + (segundaCifra-primeraCifra) + " horas");
		
	}
}
		
		
	
	

			
