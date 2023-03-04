import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Imprimir = new Scanner (System.in);
        System.out.println("ingrese  un numero");
        int numberOne;
        numberOne=Imprimir.nextInt();
        System.out.println("el numero ingresado es  " + numberOne);
        System.out.println("ingrese  otro numero");
        int numberTwo;
        numberTwo=Imprimir.nextInt();
        System.out.println("el numero ingresado es  " + numberTwo);
        System.out.println("ingrese  un nombre");
        String Name;
        Name=Imprimir.next();
        System.out.println("el nombre es " + Name) ;
        
        
        System.out.print("Hola  "+Name + ", los números que ingresaste fueron  " + numberOne + "  y" + numberTwo + "  y su suma  da como resultado    "+ (numberOne + numberTwo));
        Imprimir.close();
    }
}