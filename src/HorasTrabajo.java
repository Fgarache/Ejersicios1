import javax.swing.*;

public class HorasTrabajo {
    /*Ejercicio 5: Un obrero necesita calcular su salario semanal,
     el cual se obtiene de la siguiente manera: Si trabaja 40
     horas o menos se le paga $16 por hora. Si trabaja mas de
     40 horas se le paga $16 por cada una de las primeras 40
     horas y $20 por cada hora extra. */

    public static void main(String[] args) {

        float horas, salT;
        float horasx=horas-20;

        horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las horas trabajadas"));

        if (horas<=40); {
            salT= horas*16;
            JOptionPane.showMessageDialog(null,"su salario es "+salT+" ");
        }



    }


}
