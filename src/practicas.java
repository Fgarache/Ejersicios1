import sun.util.resources.it.CurrencyNames_it;

import java.util.Scanner;

public class practicas {
    public static void main(String[] args) {
        System.out.println("calcular porcentaje de 3 notas");

        int n1,n2,n3,s,r;

        Scanner notas = new Scanner(System.in);
        System.out.printf("Inserta la primer nota: ");
        n1 = notas.nextInt();

        System.out.printf("Insertar segunda nota: ");
        n2 = notas.nextInt();

        System.out.printf("Inserta tercer Nota: ");
        n3 = notas.nextInt();

        //OPERACION
        s = n1+n2+n3;
        r = s/3;

        System.out.printf("\nLa suma de las notas es %d",s);

        System.out.printf("\nEl promedio de las notas es %d",r);







    }
}

