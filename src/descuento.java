import javax.swing.*;

public class descuento {
    public static void main(String[] args) {


        //descuento del 20% si la compra supera los 300.


        double DesT,N;

        N = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el Monto de su factura"));

        if (N>=300){
            DesT = (N * 0.2);
            JOptionPane.showMessageDialog(null,"Total:  "+ N +"\nDescuento: "+DesT+" \nTotal a pagar: "+(N-DesT)+"");
        }
        else JOptionPane.showMessageDialog(null, "Su total es "+N+"");




    }
}
