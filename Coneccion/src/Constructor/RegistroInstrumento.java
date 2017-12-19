/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

import modelo.Instrumento;
import vista.InterfazListar;
import vista.InterfazEliminar;
import vista.Interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.table.DefaultTableModel;

import modelo.modelo;

public class RegistroInstrumento implements ActionListener {

    
 ArrayList <Instrumento>Instrumento2 = new ArrayList <>();   

 Interfaz Interfaz = new Interfaz ();
 InterfazListar InterfazListar = new InterfazListar();
 InterfazEliminar InterfazEliminar = new InterfazEliminar();
 DefaultTableModel tableModel = (DefaultTableModel) this.InterfazListar.TablaInstrumento.getModel();   
 modelo modelos = new modelo ();
    
     public enum Accion  {
        btnagregar,
        btnlistar,
        btneliminar,
        btnsalir,
        tipoinstrumento,
        btnatras,
        ConfirmaEliminar,
        btnatras2
       }

   private final String[] columNames = {"Codigo","Nombre","Stock","Tipo","Características"};  
   
       
    public void iniciar()
    {   this.Interfaz.setVisible(true);
         
        this.Interfaz.btnagregar.setActionCommand( "btnagregar" );
        this.Interfaz.btnagregar.addActionListener(this);
 
        this.Interfaz.btnlistar.setActionCommand( "btnlistar" );
        this.Interfaz.btnlistar.addActionListener(this);
        
        this.InterfazListar.btneliminar.setActionCommand( "btneliminar" );
        this.InterfazListar.btneliminar.addActionListener(this);
        
        this.Interfaz.tipoguitarra.setActionCommand("tipoguitarra");
        this.Interfaz.tipoguitarra.addActionListener(this);
        
        this.Interfaz.tipopiano.setActionCommand("tipopiano");
        this.Interfaz.tipopiano.addActionListener(this);
        
        this.Interfaz.btnsalir.setActionCommand( "btnsalir" );
        this.Interfaz.btnsalir.addActionListener(this);
   
        this.Interfaz.tipoguitarra.setActionCommand("tipoinstrumento");
        this.Interfaz.tipoguitarra.addActionListener(this);
        
        this.Interfaz.menulistar.setActionCommand("btnlistar");
        this.Interfaz.menulistar.addActionListener(this);
        
        this.Interfaz.menueliminar.setActionCommand("btneliminar");
        this.Interfaz.menueliminar.addActionListener(this);
        
        this.Interfaz.tipopiano.setActionCommand("tipoinstrumento");
        this.Interfaz.tipopiano.addActionListener(this);
        
        this.InterfazListar.btnsalir.setActionCommand( "btnsalir" );
        this.InterfazListar.btnsalir.addActionListener(this);
        
        this.InterfazListar.menueliminar.setActionCommand("btneliminar");
        this.InterfazListar.menueliminar.addActionListener(this);
        
        this.InterfazListar.menuagregar.setActionCommand("btnatras");
        this.InterfazListar.menuagregar.addActionListener(this);
        
        this.InterfazListar.btnatras.setActionCommand( "btnatras" );
        this.InterfazListar.btnatras.addActionListener(this);
        
        this.InterfazEliminar.btnatras.setActionCommand( "btnatras2" );
        this.InterfazEliminar.btnatras.addActionListener(this);
        
        this.InterfazEliminar.confirmaeliminar.setActionCommand("ConfirmaEliminar");
        this.InterfazEliminar.confirmaeliminar.addActionListener(this);}
        
    @Override
    public void actionPerformed(ActionEvent e) {
    
        switch (Accion.valueOf( e.getActionCommand() ) ) {
            
            case tipoinstrumento:
            if (this.Interfaz.tipoguitarra.isSelected()) {
            this.Interfaz.caracteristicas.removeAllItems();
            this.Interfaz.caracteristicas.addItem("Característica Instrumento");
            this.Interfaz.caracteristicas.addItem("Eléctrica");
            this.Interfaz.caracteristicas.addItem("Acústica");
            this.Interfaz.caracteristicas.addItem("ElectroAcústica");
            
            } else if (this.Interfaz.tipopiano.isSelected()) {
            this.Interfaz.caracteristicas.removeAllItems();
            this.Interfaz.caracteristicas.addItem("Característica Instrumento");
            this.Interfaz.caracteristicas.addItem("Con Cola");
            this.Interfaz.caracteristicas.addItem("Sin Cola");   }
            break;
            
            case btnagregar: //ver que onda con ingresar sin stock; validar que el codigo sea unico;
            
            if(this.modelos.AgregarDatos(
            this.Interfaz.txtcodigo.getText(),
            this.Interfaz.txtnombre.getText(),
            this.Interfaz.txtstock.getText(),
            this.Interfaz.tipoguitarra.isSelected(),
            this.Interfaz.tipopiano.isSelected(),
            this.Interfaz.caracteristicas.getSelectedItem().toString()))
                
            {this.Interfaz.txtcodigo.setText("");
            this.Interfaz.txtnombre.setText("");
            this.Interfaz.txtstock.setText("");
            this.Interfaz.grupotipo.clearSelection();
            this.Interfaz.caracteristicas.removeAllItems();
            this.Interfaz.caracteristicas.addItem("Característica Instrumento");
            } break;
                
                
            case btnlistar:
            
            if (this.modelos.validarlistar()) {    
                this.InterfazListar.TablaInstrumento.setModel(this.modelos.listarObjetos());
            
            this.Interfaz.setVisible(false);   
            this.InterfazListar.setVisible(true);} else {
            
             JOptionPane.showMessageDialog(Interfaz, "No Hay Datos de Productos Para Mostrar. Primero Ingrese Datos.", "Error la Muestra de Información", JOptionPane.WARNING_MESSAGE); 
            }break;   
           
            case btneliminar:
           
            if (this.modelos.Eliminar()) {
            this.InterfazListar.setVisible(true);
            this.InterfazEliminar.setVisible(true);} 
            else {JOptionPane.showMessageDialog(null, "No Hay Datos de Productos Para Mostrar. Primero Ingrese Datos.", "Error la Muestra de Información", JOptionPane.WARNING_MESSAGE); } 
            break;    
                
            case btnatras2:
            this.InterfazEliminar.setVisible(false);    
            break;
            
            case btnsalir:
            System.exit(0);
            break;
            
            case ConfirmaEliminar:
            if (this.modelos.confirmaeliminar(this.InterfazEliminar.codigoelimar.getText())){
            this.InterfazEliminar.setVisible(false);
            this.InterfazListar.setVisible(false);
            this.Interfaz.setVisible(true);
            JOptionPane.showMessageDialog(this.InterfazEliminar, "El Instrumento ha Sido Eliminado", "Ingreso de Información", JOptionPane.INFORMATION_MESSAGE); 
            } else {
            
            JOptionPane.showMessageDialog(this.InterfazEliminar, "El Codigo Ingresado no Existe", "Error en el Ingreso de Información", JOptionPane.WARNING_MESSAGE); 
            }break;
            
            case btnatras:
            this.InterfazListar.setVisible(false);
            this.Interfaz.setVisible(true);
            break;
            }
            }}


    
    
    
    
    

