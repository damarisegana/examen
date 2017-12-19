/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.RegistroInstrumento;
import Vista.Interfaz;
import Vista.InterfazEliminar;
import Vista.InterfazListar;
import Vista.InterfazListar;


public class mainInstrumento {
    public static void main(String[] args) {
       new RegistroInstrumento(new Interfaz (), new InterfazListar(), new InterfazEliminar()).iniciarInterfaz();
       new RegistroInstrumento(new Interfaz (), new InterfazListar(), new InterfazEliminar()).iniciarListar();
       new RegistroInstrumento(new Interfaz (), new InterfazListar(), new InterfazEliminar()).iniciarEliminar();
    }

}
