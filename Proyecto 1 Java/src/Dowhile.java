public class Dowhile {
  public static void main(String args[]){
    //Inicializar var en 0
      int x = 0;      
      do {
        //Sumar x+1 a la var de x
          x = x + 1;
          //Imprimer el numero
          System.out.println("Vuelta del do while número: " + x);
          //Mientras x sea menor a 5
      } while(x < 5);
  }
}