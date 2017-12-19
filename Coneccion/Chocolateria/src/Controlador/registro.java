/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador; 
import Vista.Inicio;
import Vista.vista_agregar;
import Vista.vista_eliminar;
import Vista.vista_listar;
import Vista.vista_buscar;

//import Modelo.chocolate;

/**
 *
 * @author Duoc UC
 */
public class registro {
    public static void main(String[] args) {
            
       new registroEscuchador(new Inicio() ).iniciar();
       
    }
    
    
    
    
    

    /*public static int validar(String cod, String nom, String desc, String t_choc, String t_sab, String marc, int prc, int cant, String sugar) {
        //System.out.println(cod+" "+nom+" "+desc+" "+t_choc+" "+t_sab+" "+marc+" "+prc+" "+cant+" "+sugar);
        int bla = 0;
        boolean sug = true;
        if (sugar.equals("Si")) {
            sug = true;
        }
        if (sugar.equals("No")) {
            sug = false;
        }
        chocolate choc = new chocolate();
        if (choc.buscar(cod)) {
            bla = 0;
        } else {
            choc.guardar(cod, nom, desc, t_choc, t_sab, marc, prc, cant, sug);
            bla = 1;
        }
        return bla;
    }*/

    /*public static int eliminar(String cod) {
        int otro_bla = 0;
        chocolate cho = new chocolate();
        if (cho.buscar(cod)) {
            if (cho.eliminarCho(cod)) {
                otro_bla = 1;
            } else {
                otro_bla = 0;
            }
        } else {
            otro_bla = 0;
        }

        return otro_bla;
    }*/
}
