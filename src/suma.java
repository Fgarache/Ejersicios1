import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;
public class suma {


    public static void main(String[] args)
    {
    double num1, num2, resultado;

        Scanner Teclado = new Scanner (System.in);

        System.out.println("insertar numero 1");
        num1 =Teclado.nextDouble();

        System.out.println("inserta el numero 2");
        num2 = Teclado.nextDouble();

        resultado=num1*num2;
        System.out.println("la multiplicacion es: "+resultado);

    }
}
