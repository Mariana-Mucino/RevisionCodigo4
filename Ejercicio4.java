//Se elimina el package

import java.util.Scanner;

public class Ejercicio4 { //Se modifica el nombre de la clase

 public static void main(String[] args) { //Se agrega el método main
	
	 Scanner s = new Scanner(System.in);//Se agrega System.in
	 
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //Se modifica el número de jugador
    //Se elimina el scanner
    String j2 = s.nextLine();
    
    if (j1 == j2) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }
          break; //Se agrega break

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }
          break; //Se agrega break
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }// se agrega {
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  
    s.close();//Se cierra el scanner
    
	 }//main
	 
	 
}// Se cierra la clase
