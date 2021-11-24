import java.util.Scanner;

public class practicasuma {
    public static void main(String[] args) {
        int n1,n2,r;

        Scanner suma = new Scanner(System.in);


        System.out.printf("primer numero = ");
        n1 = suma.nextInt();

        System.out.printf("Segundo numero = ");
        n2 = suma.nextInt();

        r = n1+n2;

        System.out.printf("  %d + %d = %d",n1,n2,r);

    }
}
