public class Tema4Ejercicio10 {
	public static void main (String[] args){
		
		System.out.println("Introduzca su día de nacimiento");
		int dia = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca su mes de nacimiento");
		int mes = Integer.parseInt(System.console().readLine());
		
		if (((dia >=1) && (dia<=21)) && ((mes>=3) && (mes<=4))){
			System.out.println("Aries");
		
		}else if (((dia >=1) && (dia<=30)) && ((mes>=4) && (mes<=5))){
			System.out.println("Tauro");
		}
	}
}
		
		
