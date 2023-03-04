import java.util.Scanner;

public class Positine {
    public static void main (String[] args) throws Exception{
        int number ;
        Scanner lectura = new Scanner(System.in);
        System.out.println("ingresa  un numero positivo o negativo");
        number =lectura.nextInt();
        if (number >0) {
            System.out.println( "el numero  es positivo");
            
        } else {
           if (number<0) {
            System.out.println("el numnero es negativo");
           } else {
            System.out.println("el numeor es neutro");
           }
        }
      lectura.close();
        }

}