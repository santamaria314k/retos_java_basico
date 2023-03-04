import java.util.Scanner;
/*ejercisio de calculadora */
public class Calculadora {

    public static void main(String[] args) throws Exception {
        Scanner Lectura = new Scanner (System.in);

        System.out.println("ingresa un  numero");
        double num1,num2,ope,total;
        num1=Lectura.nextInt();
       
        
    System.out.println("ingrese otro numero");
    num2=Lectura.nextInt();



    
        

    System.out.println("  Menu _// 1.suma    2.resta   3.multiplicasion  4.division   5.potenciacion    6.radicasion"   );

    ope = Lectura.nextInt();
    
    
       switch (ope) {
        case 1:
            total=num1+num2;
            System.out.println("la suma entre"+num1+" y "+num2+" es "+total);
            total=Lectura.nextInt();





            break;
       
        
            

            case 2:
            total=num1-num2;
            System.out.println("la resta entre"+num1+" y "+num2+" es "+total);
            total=Lectura.nextInt();
            break;
       
        
            

            case 3:
            total=num1*num2;
            System.out.println("la multiplicasion entre"+num1+" y "+num2+" es "+total);
            total=Lectura.nextInt();
            break;
       
        
            

            case 4:
            total=num1/num2;
            System.out.println("la division entre"+num1+" y  "+num2+" es  "+total);
            total=Lectura.nextInt();
            break;
       
            case 5:
            total=num1^num2;
            System.out.println("la potencia entre"+num1+"  y"+num2+"es"+total);
            total=Lectura.nextInt();
            break;

            case 6:
            total=num1%num2;
            System.out.println("la radicasion entre "+num1+" y "+num2+" es "+total);
            total=Lectura.nextInt();
            break;

        default:System.out.println("la opcion seleccionada no es valida");
            break;


       }
}}