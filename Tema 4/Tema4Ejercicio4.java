public class Tema4Ejercicio4 {
	public static void main(String[] args) {
		
		System.out.println("Por favor, introduzca el número de horas trabajadas esta semana: ");
		int horasTrabajadas = Integer.parseInt(System.console().readLine());
		int horasExtras = (horasTrabajadas-40);
		int horasNormales = (horasTrabajadas-horasExtras);
		
		if (horasTrabajadas <=40){
			
			System.out.println("Su salario semanal es de: " + (horasTrabajadas*12) + " euros");
			
		}else{
			
			System.out.println("Su salario semanal es de: " + ((horasNormales)*12+(horasExtras)*16) + " euros");
		}
			
		
	}
}
