import java.util.Scanner;

public class piedrapapel {
    


    public static void main(String[] args) throws Exception {
        Scanner Imprimir = new Scanner (System.in);
        var aleatorio=0;
        var opcion=0;

        aleatorio= (int) (Math.random()*3+1);


      

        System.out.println("Ingresa (1) para escoger papel, (2) para escoger piedra  y (3) para escoger tijera");
        opcion=Imprimir.nextInt();

        if (aleatorio==opcion){
            System.out.println("has empatado");
        }else if(aleatorio==1 & opcion==2){
            System.out.println(" has perdido");
        }else if(aleatorio==1 & opcion==3){
            System.out.println(" has ganado");
        }else if(aleatorio==2 & opcion==1){
            System.out.println(" has ganado");
        }else if(aleatorio==2 & opcion==3){
            System.out.println(" has perdido");
        }else if(aleatorio==3 & opcion==1){
            System.out.println(" has perdido");
        }else if(aleatorio==3 & opcion==2){
            System.out.println(" has ganado");
        }
        System.out.println("El resultado que ha escogido el sistema es   "+aleatorio);
        Imprimir.close();
        















}
}