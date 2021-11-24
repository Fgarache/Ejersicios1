import javax.swing.*;

public class condicionales {
    public static void main(String[] args) {
        int Num;

        Num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        if (Num%10 == 0) {
            JOptionPane.showMessageDialog(null,"El numero " + Num + " es multiplo de 10");
        }
        else
        {JOptionPane.showMessageDialog(null,"el numero no es multiplo de 10");

        }
    }


}
