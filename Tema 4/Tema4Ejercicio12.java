public class Tema4Ejercicio12{
	public static void main(String[] args) {
		
		System.out.println("Bienvenido al cuestionario sobre el curso");
		System.out.println("Primera Pregunta: Cuánto es 1 + 1? Responde con números");
		int respuesta1 = Integer.parseInt(System.console().readLine());
		int puntos=0;
		
		switch (respuesta1){
			case 2:
			System.out.println("Correcto!");
			puntos++;
			break;
			
			default:
			System.out.println("Respuesta Incorrecta");
		}
		
		System.out.println("Segunda Pregunta:¿Como se llama Miguel?");
		String respuesta2 = System.console().readLine();
		
		if (respuesta2.equals("Miguel")){
			System.out.println("Correcto!");
			puntos++;
		}else{
			System.out.println("Respuesta incorrecta");
		}
		
		System.out.println("Tercera Pregunta: ¿Debo coger el ascensor?");
		String respuesta3 = System.console().readLine();
		
		if (respuesta3.equals("No")){
			System.out.println("Correcto");
			puntos ++;
		}else{
			System.out.println("Respuesta incorrecta");
		}
		System.out.println("Has conseguido " + puntos + " punto/s");
		
	}
}
