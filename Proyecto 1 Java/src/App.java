import java.util.Arrays;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //Crear una instancia Scanner


       //Esta línea lee una línea completa de entrada del usuario y 
        //la guarda en la variable nombre de tipo String. 
        //El método nextLine() del objeto Scanner captura todo lo que el usuario escriba hasta que presione Enter.
        Scanner input = new Scanner (System.in);//System in todo lo que se ingresa de entrada
        System.out.println("Ingrese su nombre");
        String nombre = input.nextLine();
        

        //Esta línea lee un valor entero de la entrada del usuario y lo guarda
         //en la variable edad de tipo int. El método nextInt() del objeto Scanner 
         //captura el siguiente valor entero que el usuario introduzca.
        System.out.println("Ingrese su Edad");
        int edad = input.nextInt();


//Esta línea lee una palabra (hasta el siguiente espacio en blanco) de la entrada 
//del usuario y la guarda en la variable correo de tipo String. El método next() del objeto Scanner 
//captura la siguiente secuencia de caracteres hasta el espacio en blanco.
        System.out.println("Ingrese su correo electrónico");
        String correo= input.next();

        System.out.println("Los datos ingresados son: "+nombre+ " " + edad+ " " + correo);


    }
}

//ELEMENTOS DE JAVA
// int numeroEntero= 10:
// double numeroDecimal= 5.5:
// float numeroFlotante= 3.14;

// //CARACTER O UNA LETRA
// char letra = "A":
// //VERDADERO O FALSO
// boolean esVerdadero= true
// //NUM 3 DIGITO
// byte numeroByte= 127;
// //NUMERO MAS DE 3
// short numeroCorto= 3200
// //NUMERO MUY LARGO
// long numeroLargo= 100000000L;

// //Strings
// String texto= "Hola"
// //Array
// int [] numeros= [1,2,3,4,5]
//Clase Scanner: leer elementos como teclado, mouse, huella, etc, cualquier medio digital
