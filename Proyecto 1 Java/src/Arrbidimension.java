public class Arrbidimension {
  public static void main(String[] args) {
    int [][] bidemensional = new int [2] [2];
    //Primera file primera col
    bidemensional[0][0]=1;
    //Primera fila segunda col
    bidemensional[0][1]=2;
    //Segunda fila primera col
    bidemensional[1][0]=3;
    //Segunda fila segunda col
    bidemensional[1][1]=4;

//Aqui estoy imprimiendo el valor de la segunda col primer col, que es el num 3
    System.out.println(bidemensional[1][0]);
  }
}
