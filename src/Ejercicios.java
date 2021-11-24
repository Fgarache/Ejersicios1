public class Ejercicios {
    public static void main(String[] args) {

        System.out.println("\nDe dos numeros aleatorios, \nmuestra en pantalla la suma, resta, multiplicacion \ny divicion.\n");

        int n1 = 20;
        int n2 = 2;
        int s, r, m, d;

        s = n1+n2;
        r = n1-n2;
        m = n1*n2;
        d = n1/n2;

        System.out.printf("La suma de %d y %d es: %d", n1,n2,s);
        System.out.printf("\n\nLa restra entre %d y %d es igual a: %d", n1,n2,r);
        System.out.printf("\n\nSi multiplicamos %d por %d el resultado seria %d", n1,n2,m);
        System.out.printf("\n\nLa divicion entre %d y el numero %d da como resultado %d", n1,n2,d);


    }
}
