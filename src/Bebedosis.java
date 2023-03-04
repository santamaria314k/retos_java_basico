import java.util.Scanner;


public class Bebedosis {

    public static void main(String[] args) throws Exception {
        Scanner Lectura = new Scanner (System.in);
double pes,mes;
System.out.println("peso del bebe al cual se la va a aplicar la vacuna");
pes=Lectura.nextInt();

System.out.println("meses de edad que tiene el bebe");

mes=Lectura.nextInt();


System.out.println("la dosis de la vacuna que  se le debe aplicar al bebe es  =" + (pes+10)/(mes*10)*8 );
Lectura.close();
}
}