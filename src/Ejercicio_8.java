import java.util.Scanner;

 public class Ejercicio_8
    {

        public static void main(String[] args)
        {

            Scanner entrada = new Scanner(System.in);

            //variables
            int a,b,c, x1, x2;

            System.out.println("Ingrese los valores de la ecuación:");
            System.out.print("Valor de a: ");
            a = entrada.nextInt();
            System.out.print("Valor de b: ");
            b = entrada.nextInt();
            System.out.print("Valor de c: ");
            c= entrada.nextInt();

            //calculos
            x1 = (int) ((-b) + (Math.sqrt((Math.pow(b,2)) - (4*a*c)))) / (2*a);
            x2 = (int) ((-b) - (Math.sqrt((Math.pow(b,2)) - (4*a*c)))) / (2*a);

            System.out.println("Raiz x1 = " + x1);
            System.out.println("Raiz x2 = " + x2);

        }
    }