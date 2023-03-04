import java.util.Scanner;

public class Hommujer {
   
    public static void main(String[] args) throws Exception {
        Scanner imprimir = new Scanner (System.in);
int contadorh=0;
int contadorM=0;
int hombre = 1;
int mujer = 2;


        for (int x=1; x<=10; x++) {


     System.out.println(" escribe si eres( (1) hombre     o    (2)   mujer)");
     int recibirhm= imprimir.nextInt();
     


if (recibirhm == mujer) {
     System.out.println("CANTIDAD DE HOMBRES  :   "+ (++contadorM) );
} else {
     
if(recibirhm == hombre){

System.out.println("CANTIDAD DE HOMBRES  :   "+ (++contadorh )  );
     }

}








        }



        imprimir.close();
}}
