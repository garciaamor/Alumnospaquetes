package pedir_datos;

import javax.swing.JOptionPane;

public class Metodos {
    public static String datoSting(String dato){
        return(JOptionPane.showInputDialog(dato));
    }
public static float datosFloat (String dato){
    return(Float.parseFloat(JOptionPane.showInputDialog(dato)));
}
}

