import java.util.Scanner;

public class pruevaCiclos {
    public static void main(String[] args) {
        System.out.println("de dos numeros aleatorios muestra \nen patalla cual es mayor y menor o si son iguales\n");

        int num1, num2;

        Scanner num = new Scanner(System.in);
        System.out.printf("INSERTAR NUMERO 1: ");
        num1 = num.nextInt();

        System.out.printf("INSERTAR NUMERO 2: ");
        num2 = num.nextInt();

        if (num1>num2) {
            System.out.printf("El numero mayor es %d y el %d es menor ",num1,num2);

        }


        if (num1<num2){
            System.out.printf("El numero %d es mayor que el numero %d ",num2,num1);
        }

        if (num1==num2){
                System.out.printf("Los numero %d y %d son iguales", num1,num2);
        }





    }
}
