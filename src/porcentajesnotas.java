import java.util.Scanner;

public class porcentajesnotas {

    public static void main(String[] args) {
 //       System.out.println("La calificación final de un estudiante de Informática \nse calcula con base a las calificaciones de cuatro \naspectos de su rendimiento académico: participación, \nprimer examen parcial, segundo examen parcial y examen final.     \nSabiendo que las calificaciones anteriores entran a la \ncalificación final con ponderaciones del 10%, 25%, 25% y 40%, \nHacer un programa que calcule e imprima la calificación \nfinal obtenida por un estudiante.");

   double part,primerEP,segunEP,exaF,notafinal;

        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresar notas de participacion: ");
        part = datos.nextDouble();

        System.out.println("Ingresar notas de primer Parcial: ");
        primerEP = datos.nextDouble();

        System.out.println("Ingresar notas de segundo parcial: ");
        segunEP = datos.nextDouble();

        System.out.println("Ingrese la notas del examen final: ");
        exaF = datos.nextDouble();

        //OPERACION
 //       part = part*0.10f;
 //       primerEP = primerEP*0.25f;
  //      segunEP = segunEP*0.25f;
 //       exaF = exaF*0.4;


        notafinal = (part*0.1)+(primerEP*0.25)+(segunEP*0.25)+(exaF*0.4);

        System.out.println("\nnota final es      = "+notafinal);
        System.out.println("\n\nnotas del primer parcial  ="+primerEP);
        System.out.println("notas del segundo parcial ="+segunEP);
        System.out.println("notas del examen final    = "+exaF);
        System.out.println("notas por participacion   ="+part);





    }
}
