
import java.util.Scanner;


public class Supermercadonoedos {
    
    public static void main(String[] args) {
        Scanner imprimir = new Scanner (System.in);
       int valorm=50000;
       int valora=4;
      int subtotal=0;
      int acumulador=0;
      double valo=3.3;  
      var  aleatorio = (int) (Math.random()*4+1);

System.out.println("Por favor ingresa el valor de  la compra para aceder anuestros descuentos");
 int cumplo=imprimir.nextInt();


if (cumplo >= valorm) {
    System.out.println("FELICIDADES CUMPLISTE CON LA CONDICIO DE TENER UNA COMPRA MAYOR DE 50.000");

System.out.println("digita un numero del 1 al 4 para que el sistema te genere un descuento al azar");
int digito=imprimir.nextInt();

if (digito <= valora) {
    



    if (aleatorio==digito ){
        System.out.println("bolita roja obtienes 10% DESCUENTO");
    }else if(aleatorio== 1 & digito == 2){
        System.out.println(" bolita azul obtienes un 30% DESCUENTO");
    }else if(aleatorio== 1 & digito == 3){
        System.out.println("bolita amarilla obtienes un 50% DESCUENTO");
    }else if(aleatorio== 2 & digito== 1){
        System.out.println(" sacaste la bolita blanca GRATIS");
    }else if(aleatorio== 2 & digito== 4){
        System.out.println(" bolita roja obtienes 10% DESCUENTO");
    }else if(aleatorio== 2 & digito== 3){
        System.out.println(" sacaste la bolita blanca GRATIS");
    }else if(aleatorio== 3 & digito== 4){
        System.out.println(" bolita roja obtienes 10% DESCUENTO");
    }else if(aleatorio== 3 & digito== 1){
        System.out.println(" sacaste la bolita blanca GRATIS");
    }else if(aleatorio== 4 & digito== 4){
        System.out.println(" bolita roja obtienes 10% DESCUENTO");
    }else{System.out.println(" :C MALA SUERTE LO SIENTO NO GANASTE NADA");  }












} else {
   System.out.println("LO SIENTO :(  DEBES INICIAR DENUEVO EL PROCESO YA QUE HAS DIGITADO UN VALOR MAYOR A 4 "); 
}




} else {
    

    System.out.println("Lo siento tu compra debe ser mayor o igual a 50.000  para acceder a descuentos ");
}




for (int x=1; x<=5; x++) {



System.out.println("Digite el precio del  producto");
        
int precio=imprimir.nextInt();
  
  System.out.println("Digite la cantidad de  producto");
  
  int cantida=imprimir.nextInt();


  subtotal=precio*cantida;
  acumulador+= subtotal ;
 int  desc=  acumulador *(int) valo /100;
System.out.println("subtotal  :"+ subtotal);


System.out.println("tu descuento es de % :"+ desc +"%"  );


System.out.println("pagado con precio en efectivo $:"  );
int dinero = imprimir.nextInt();
int cambio = dinero- subtotal;

System.out.println("El valor de tu cambio es : "+ cambio);

imprimir.close();



}
}}