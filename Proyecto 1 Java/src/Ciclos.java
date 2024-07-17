import java.util.Scanner;

public class Ciclos {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int nota;

    System.out.print("Ingrese su nota");
    nota = input.nextInt();

    if (nota >= 10) {
      System.out.println("La nota es mayor a 10");

    } else if (nota > 6) {
      System.out.println("La nota es mayor a 6");
    } else {
      System.out.println("Es otra nota");
    }

    int dia = 0;

    String nombreDia;
    switch (dia) {
      case 1:
          nombreDia = "Lunes";
          //En caso de que caiga en la sentencia se ejecuta el break que termina la aplicacion
          break;
      case 2:
          nombreDia = "Martes";
          break;
      case 3:
          nombreDia = "Miércoles";
          break;
      case 4:
          nombreDia = "Jueves";
          break;
      case 5:
          nombreDia = "Viernes";
          break;
      case 6:
          nombreDia = "Sábado";
          break;
      case 7:
          nombreDia = "Domingo";
          break;
   
  }
 
 

  }

  


}
