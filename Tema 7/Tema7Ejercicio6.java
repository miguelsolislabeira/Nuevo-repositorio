public class Tema7Ejercicio6{
	public static void main(String[] args){
		
	int[] numero = new int[15];
int i;
System.out.println("Vaya introduciendo números enteros y pulsando INTRO:");
for (i = 0; i < 15; i++) {
numero[i] = Integer.parseInt(System.console().readLine());
}
System.out.println();
// Muestra el array original ///////////////
System.out.println("Array original:");
for (i = 0; i < 15; i++) {
System.out.printf("|%3d ", i);
}
System.out.println("|");
for (i = 0; i < 75; i++) {
System.out.print("o");
}
System.out.println("o");
for (i = 0; i < 15; i++) {
System.out.printf("|%3d ", numero[i]);
}
System.out.println("|");

int aux = numero[14];

for (i = 14; i>0; i--){

numero[i] = numero[i-1];
}
numero[0] = aux;


System.out.println("\nArray rotado a la derecha una posición:");
for (i = 0; i < 15; i++) {
System.out.printf("|%3d ", i);
}
System.out.println("|");
for (i = 0; i < 75; i++) {
System.out.print("�");
}
System.out.println("�");
for (i = 0; i < 15; i++) {
System.out.printf("|%3d ", numero[i]);
}
System.out.println("|");


	}
}
				
		


		
		
		
