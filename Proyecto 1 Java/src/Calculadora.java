import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
//declaracion variables
    int num1, num2;
    char operando;
    double result;

System.out.println("Ingrese el primer numero");
num1= entrada.nextInt();
System.out.println("Ingrese el segundo numero");
num2= entrada.nextInt();

System.out.println("Ingrese el operando +(suma), -(resta), x(multiplicacion), :(division)");
operando = entrada.next().charAt(0);

switch (operando) {
  case '+':
  System.out.println(num1 + num2);    
    break;

    case '-':
    System.out.println(num1 - num2);      
      break;

      case 'x':
      System.out.println(num1 * num2);        
        break;

        case ':':
        System.out.println(num1 / num2);          
          break;

          default:
          System.out.println("Opcion no valida");   
          break;
  
}

  }
}
