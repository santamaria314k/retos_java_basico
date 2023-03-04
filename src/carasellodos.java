
import java.util.Scanner;



public class carasellodos {
int ten=10;
int acumulador=0;
    public static void main(String[] args) {
        Scanner imprimir = new Scanner (System.in);
        int valorn=1;
int variableale =0 ;
 System.out.print("valor a apostar en  DINERO  :");
 int acumulador=imprimir.nextInt();

 for (int x=1; x<=30; x++) {
    System.out.println("Debes dar( cara o sello)  :");
var apostador = imprimir.nextLine ();
System.out.println("HAS ESCOGIDO     "+ apostador);
    variableale =  (int) (Math.random()*2+1) ;

     acumulador=acumulador*2;
    int api=acumulador/2;
   
    if (valorn != variableale ) {
        System.out.println("lo siento has perdido  :("+(api));}
         else{System.out.println("has ganado  buena suerte :)"+ (acumulador)  );}

 }



    

        imprimir.close();

    }
}
