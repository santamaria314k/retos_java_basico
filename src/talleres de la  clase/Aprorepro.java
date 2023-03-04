import java.util.Scanner;


public class Aprorepro {
    


    public static void main(String[] args) throws Exception {
        Scanner Imprimir = new Scanner (System.in);
        
    
     
      
        for (double x=1; x<=4; x++) {
            
      



System.out.println(" HOLA ,digita la nota   del primer taller");
        
double talleruno=Imprimir.nextDouble();

System.out.println("LA NOTA DIGITADA ES :"+ talleruno);


System.out.println("HOLA , digita la nota   del segundo taller");
        
double tallerdos=Imprimir.nextDouble();

System.out.println("LA NOTA DIGITADA ES :" + tallerdos );


System.out.println("HOLA , digita la nota   del tercer taller");
        
double tallertres=Imprimir.nextDouble();
System.out.println("LA NOTA DIGITADA ES :"+ tallertres);



System.out.println(" HOLA ,digita la nota   del cuarto taller");
        
double tallercuatro = Imprimir.nextDouble();

double suma = talleruno + tallerdos + tallertres + tallercuatro;
double  promedio = suma /4 ;
System.out.println("tu promedio es :" + promedio );

if ( promedio > 0.0 ||promedio < 2.9 ) {
   System.out.println("reprobaste la asignatura"); 
} else if( promedio > 3.0 ||promedio < 4.0  ){
    System.out.println("pasaste raspando la asignatura"); 

}else  if ( promedio > 4.0 ){
    System.out.println("aprobaste  satisfactoriamente la asignatura"); 

}

Imprimir.close();

}}}

    



