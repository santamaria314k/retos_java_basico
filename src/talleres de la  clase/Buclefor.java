import java.util.Scanner;

public class Buclefor {
    public static void main(String[] args) throws Exception {
        Scanner Imprimir = new Scanner (System.in);
        int subtotal=0 , acumulador =0 ,condicion=1 ;


     
        for (int x=1; x<=5; x++) {
        System.out.println("Digite el precio del  producto");
        
      int precio=Imprimir.nextInt();
        
        System.out.println("Digite la cantidad de  producto");
        
        int cantida=Imprimir.nextInt();
    
        subtotal=precio*cantida;
          acumulador += subtotal ;
          
        System.out.println("subtotal  :"+ subtotal);
        System.out.println("total  :   "+ acumulador);


 
System.out.println("pagado con :"  );
int dinero = Imprimir.nextInt();
int cambio = dinero- acumulador;

System.out.println("El valor de tu cambio es : "+ cambio);

System.out.println("digita (1) si cuentas con telefonia exito : ");
int tele = Imprimir.nextInt();


if (tele == condicion) {
    System.out.println("puedes acceder a minutos ya que cuentas con nuestros servicios de telefonia");
} else {
  System.out.println("no cuentas con nuestro servicio , GRACIAS POR TU COMPRA VUELVE PRONTO");  
}


        }

       

        Imprimir.close();

    }}




