public class ejercicio2 {
    public static void main(String[] args) {

        System.out.println("de dos numeros aleatorios muestra \nen patalla cual es mayor y menor o si son iguales\n");

        int n1 = 213;
        int n2 = 21;

        System.out.printf("el primer numero es: %d y \nel segundo numero es: %d \n\n", n1,n2);

        if (n1 > n2){
            System.out.println("el numero mayor es  = "+n1);
            System.out.println("El numero menor es  = "+n2);

        }
        if (n2>n1) {
            System.out.println("el mumero mayor es = "+n2);
            System.out.println("El numero menor es = "+n1);
        }
        if ( n1==n2 ){
            System.out.printf("el numero %d es igual al numero %d", n1,n2);
        }
    }
}
