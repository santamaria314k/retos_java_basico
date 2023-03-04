
import java.util.Scanner;



public class carasello {

    public static void main(String[] args) {
        Scanner imprimir = new Scanner (System.in);
        int valorn=1;
int variableale =0 ;


 for (int x=1; x<=5; x++) {
    System.out.println("Debes escribir( cara o sello)");
imprimir.nextLine ();
    variableale =  (int) (Math.random()*2+1) ;

    System.out.println("valor a apostar DINERO");
    int apost=imprimir.nextInt();
    if (valorn != variableale ) {
        System.out.println("lo siento has perdido  :("+ apost/2);
    } else{System.out.println("has ganado  buena suerte :)"+apost*2);}

 }



       





    



        imprimir.close();

    }
}
