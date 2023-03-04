import java.util.Scanner;




public class Craps {
    


   public static void main(String[] args) throws Exception {
        Scanner imprimir = new Scanner (System.in);
        
        


        int aleatorio=0;
        
       int lanza=0;


        aleatorio= (int) (Math.random()*6+1);


      

        System.out.println("ingresa un (1) para iniciar a jugar craps");
        lanza=imprimir.nextInt();
        System.out.println("EL VALOR INGRESADO ES :D"+ lanza);

        if ( aleatorio==6){
            System.out.println("par de unos en los dados");
        }else if(aleatorio==1 ){
            System.out.println(" total de tres en los dados");
        }else if  (aleatorio==2){
            System.out.println(" total de once en los dados");
        }else if  (aleatorio==3){
            System.out.println(" total de once en los dados");
        }else if  (aleatorio==4){
            System.out.println(" obtiene dos o doce en los dados");
        }else if  (aleatorio==5){
            System.out.println(" Un total de siete en los dados.");
        }









        imprimir.close();
    }
}






















