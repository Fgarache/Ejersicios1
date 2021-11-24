import java.io.PrintStream;
import java.util.Scanner;

//guillermo tienen X cantidad de dollar, luis tiene la mitad de guillermo,
//y juan tiene la mitad de lo que tiene guillermo y luis juntos.

public class calcular {
    public static void main(String[] args) {
        float d,guille,luis,juan;
        Scanner datos = new Scanner(System.in);
        System.out.println("Cuanto dinero tiene Guillermo?: ");
        guille = datos.nextFloat();

        luis =  guille/2;
        juan = (luis+guille)/2;
        d = guille+luis+juan;

        System.out.println("luis tiene"+luis);
        System.out.println("juan tiene"+juan);

        System.out.println("\ny en total tienen:"+d);



    }
}

