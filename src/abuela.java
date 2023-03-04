
import  java.util.Scanner;


public class abuela {
    public static void main(String[] args) throws Exception {
        Scanner Imprimir = new Scanner (System.in);


System.out.println("ingresa  la temperatura en grados");
double degrees;
degrees=Imprimir.nextInt();

System.out.println("tu valor GRADOS f °  CONVERTIDO  GRADOS C°  ES ="+ (degrees-32 )/1.8 +"  grados c°  HASTA PRONTO" );



Imprimir.close();
}}


