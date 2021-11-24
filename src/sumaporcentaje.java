import java.util.Scanner;

public class sumaporcentaje {
    public static void main(String[] args) {

        float  n3,s,p,n1,n2;
        Scanner ing = new Scanner(System.in);
        //nota numero 1
        System.out.println("nota numero 1: ");
        n1 = ing.nextFloat();

        //nota numero 2
        System.out.println("nota numero 2: ");
        n2 = ing.nextFloat();

        //nota numero 2
        System.out.println("nota numero 3: ");
        n3 = ing.nextFloat();

        //operacion

        s = n1+n2+n3;
        p = s/3;


        System.out.println("nota promedio del trimestre es: "+p);
        System.out.println("\nla suma de las notas es" +s);


    }
}
