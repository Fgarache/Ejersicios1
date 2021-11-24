import java.util.Scanner;

public class tablademultiplicar {
    public static void main(String[] args) {
        int n1,m;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("inserta el numero a multiplicar");
        n1= Teclado.nextInt();



        for (int i = 1; i <= 10; i++) {
            System.out.println(n1+ " X " + i + " = "+ String.valueOf(n1*i));

        }

    }
}
