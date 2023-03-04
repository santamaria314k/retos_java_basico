import java.util.Scanner;




public class Nombreapellido {


    public static void main(String[] args) {
        Scanner Imprimir = new Scanner (System.in);



        System.out.println("Ingrese  su nombre ");
      
     String name =Imprimir.next(); 
        String uppercaseWord = name.toUpperCase();
System.out.println(" mayuscula :   "+ uppercaseWord);
        System.out.println("Ingrese  su apellido");
       
        String apellido =Imprimir.next();

       var nombrecompleto = name + apellido;

        System.out.println("La longitud del nombre es: " + name.length());
        System.out.println("La longitud del apellido es: " + apellido.length());
     System.out.println("Tu nombre completo es :   "+ nombrecompleto );
     
     String extractedLetters = name.substring(0,2); 
     String result = extractedLetters + apellido;
     System.out.println(result);
     

       Imprimir.close();
    }



}
