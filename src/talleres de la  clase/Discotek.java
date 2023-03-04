import java.util.Scanner;

public class Discotek {
    public static void main (String[] args) throws Exception{
        int age ;
        Scanner lectura = new Scanner(System.in);
        System.out.println("ingresa tu edad");
        age =lectura.nextInt();
        if (age <18) {
            System.out.println( "no puede ingresar");
            
        } else {
            System.out.println("puedes ingresar");
        }
      lectura.close();
        }

}