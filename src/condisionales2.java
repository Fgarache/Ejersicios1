import javax.swing.*;

public class condisionales2 {
    public static void main(String[] args) {
        int n1,n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2: "));

        if (n1>n2) {
            JOptionPane.showMessageDialog(null,"El numero " + n1 + " es mayor que "+n2+"");
        }
        else if (n1<n2) {
            JOptionPane.showMessageDialog(null,"El numero " + n2 + " es mayor que "+n1+"");
        }
        else    JOptionPane.showMessageDialog(null,"los numeros son iguales");

    }


}

