import java.util.Scanner;


public class Validar {
  
  public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
        int numero = 0;
        boolean esValido = false;
        // con un ciclo validare que se ingrese un numero valido
        while (!esValido) {
            System.out.println("iNGRESE UN NÚMERO");
            if (entrada.hasNextInt()) {
                numero = entrada.nextInt();
                esValido = true;
            } else {
                System.out.println("ENTRADA NO VÁLIDA , INGRESE ÚN NÚMERO");
                entrada.next();
            }
        }

        System.out.println("Numero ingrsado " + numero);
        boolean esValido1 = false;
                String valor = "";
                // con un ciclo validare que se ingrese un numero valido
                   // Ciclo que se repetirá hasta que el usuario ingrese una entrada válida
                   while (!esValido1) {
                    System.out.print("Ingrese solo letras: ");
                  valor = entrada.nextLine();
                  if (!valor.isEmpty() && valor.matches("^[a-zA-Z]+$")) 
                     {
                        esValido1 = true; // Entrada válida, salir del ciclo
                    } else {
                        System.out.println("Entrada no válida. Por favor, ingrese solo letras.");
                    }
        
                }
                System.out.println("Entrada ingresada: " + valor);
             
                // Cerrar el scanner
                entrada.close();

                //char = caracter
                //StartsWith= para saber si comienza con cierto caracter
                //Math.round = redondea un num
                //Math.cell = redondea hacia arriba el num
                //Math.floor= redondea hacia abajo
                //Marh.max(10,30)= arroja el num mayor
                //Math.min(10,30)= arroja el menor
                //Math.random()= num aleatorio
                //Math.pow(2,2)= eleva, como ej 2 elevado a 2
                //Math.sqrt(25)= raiz cuadrara, como por ej de 25
  }


}
