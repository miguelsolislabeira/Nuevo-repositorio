public class Tema3Ejercicio8{
	public static void main(String[] args) {
		
		System.out.println("Introduzca el número de horas trabajadas esta semana: ");
		int horasTrabajadas = Integer.parseInt(System.console().readLine());
		
		int salarioSemanal = horasTrabajadas*12;
		
		System.out.println("Su salario de esta semana es de: " + salarioSemanal + " euros");
		
		
		
	}
}

