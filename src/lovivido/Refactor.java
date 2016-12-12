package lovivido;

import javax.swing.JOptionPane;

public class Refactor {

    //Hago un formateo de código con 'Source -> Format'

    private String nombre; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'
    private String edad; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'

    private int mes; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'
    private int dia; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'
    private int hora; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'
    private int año; //cambio de nombre de variable marcando la variable y botón derecho 'Refactor -> Rename'

    public void introducirDatos() {
        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");
    }

    public void calcularTiempo() {
        año = Integer.parseInt(edad);
        mes = (año * 12);
        dia = (año * 365);
        hora = (dia * 24);
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Meses: " + mes, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dia, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + hora, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);
    }
}
