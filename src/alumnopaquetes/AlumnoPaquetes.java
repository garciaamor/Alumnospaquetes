package alumnopaquetes;

import datos_academicos.Alumno;
import datospersoais.DatosPersoais;
import javax.swing.JOptionPane;
import pedir_datos.Metodos;

public class AlumnoPaquetes {

    public static void main(String[] args) {
        
         String nom,tele,correo,resposta;
        float teorica,practica,boletins,notamedia ;
      do{
        nom = Metodos.datoSting("nome :");
        tele = Metodos.datoSting("telefono :");
        correo = Metodos.datoSting("correo electronico :");
        teorica = Metodos.datosFloat("teoria :");
        practica =Metodos.datosFloat("practica :");
        boletins = Metodos.datosFloat("boletins :");
        
        DatosPersoais per = new DatosPersoais(nom,correo,tele);
        
        Alumno alum = new Alumno (teorica,practica,boletins,per);
        JOptionPane.showMessageDialog(null, alum);
        resposta= JOptionPane.showInputDialog(" outro alumno :");
        
    }while(resposta.equalsIgnoreCase("si")); 
     
       
    }
    
}
