public class Tema5Ejercicio7bis{
	public static void main(String[] args){

	int intentos = 4;
	int numeroIntroducido;
	boolean acertado = false;
	
	do{
		System.out.println("Introduzca un número de 4 cifras");
		numeroIntroducido = Integer.parseInt(System.console().readLine());
		intentos --;
		
		if(numeroIntroducido==1234){
			acertado = true;
			System.out.println("Enhorabuena!");
		}else{
			System.out.println("El número no es correcto");
		}
	}while((intentos>0) && (acertado==false));

	}
}



