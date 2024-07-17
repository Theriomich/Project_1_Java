import java.util.ArrayList;

public class Arrayslist {
  public static void main(String[] args) {

    ArrayList<Integer> lista = new ArrayList<Integer>();
//Como es el primer elem agregado se agrega eb pos 0(o 1)
    lista.add(1);
    //Como es el primer elem agregado se agrega eb pos 1(o 2 que es lo mismo) y así..
    lista.add(3);
//En el index 0 se agrega ahora este numero, desplazando los otros num
    lista.add(0,4);
    //Borra todo en la lista
    lista.clear();
//Elimina el elemento de la posicion 1
    lista.remove(1);
  }

}
