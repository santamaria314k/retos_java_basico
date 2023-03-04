import java.util.Scanner;



public class Budget {
    public static void main(String[] args) throws Exception {

    Scanner Imprimir = new Scanner (System.in);
int budget,spain,seguir,contador,acumulador;
seguir = 1;
budget = 100000;
contador=0;
 acumulador=0;
while (seguir==1  && contador <= 3) {
   
    System.out.println("ingrese el valor del gasto");
    spain=Imprimir.nextInt();
    budget=budget-spain;
    System.out.println("el presupuesto restante fue de" +  budget);
    System.out.println("desea registrar otro gasto  1.si    2.no");
    seguir=Imprimir.nextInt();
    contador = contador + 1;
    acumulador = acumulador + spain;
    System.out.println("El valor de tus gastos es de "+ acumulador);
    if(contador ==3){
    System.out.println("no puedes continuar ya que has superado el limite de compras");
    }   
 }
System.out.println("presupuesto sobrante  :   "+budget);
System.out.println("    valor total de los gastos   "+ acumulador);       
       
 Imprimir.close();
    }




}




  




