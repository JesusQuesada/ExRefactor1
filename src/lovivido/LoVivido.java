/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {
        //Hago un formateo de código con 'Source -> Format'
        String nombre; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'
        String edad; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'

        int mes; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'
        int dia; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'
        int hora; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'
        int año; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        año = Integer.parseInt(edad);

        mes = (año * 12);
        dia = (año * 365);
        hora = (dia * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + mes, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dia, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + hora, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}
