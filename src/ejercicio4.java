import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        int n1, n2, s,r,m,d;

        Scanner Teclado = new Scanner (System.in);
        System.out.println("insertar el primer numero: ");
        n1 =Teclado.nextInt();

        System.out.println("Inserta el segundo numero: ");
        n2 =Teclado.nextInt();

        s = n1+n2;
        r = n1-n2;
        m = n1*n2;
        d = n1/n2;


        System.out.printf("\nla suma de %d y el numero %d es: %d",n1,n2,s);

        System.out.printf("\n\nSi restamos  %d al numero %d nos sobra:  %d\n",n2,n1,r);

        System.out.printf("\nSi multiplicamos el numero %d por %d nos dara como resultado: %d ",n1,n2,m);

        System.out.printf("\n\nSi dividimos el numero %d entre el numero %d nos dara: %d",n1,n2,d);





    }
}
