/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {
        //Creada la clase 'Refactor' con los atributos y tres métodos, uno para introducir los datos, otro para calcular el tiempo y otro para mostrar los resultados por pantalla
        Refactor pers1 = new Refactor();
        pers1.introducirDatos();
        pers1.calcularTiempo();
        pers1.mostrar();
        System.exit(0);

    }
}
