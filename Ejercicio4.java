//Se elimina el package

import java.util.Scanner;

public class Ejercicio4 { //Se modifica el nombre de la clase

 public static void main(String[] args) { //Se agrega el método main
	
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    Scanner s1 = new Scanner(System.in); //Se mueve el scanner y se modifica el s
	String j1 = s1.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //Se modifica el número de jugador
    Scanner s2 = new Scanner(System.in);
    String j2 = s2.nextLine(); //Se modifica el s
    
    if (j1 == j2) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }// se agrega {
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  
    
    
	 }//main
	 
	 
}// Se cierra la clase
