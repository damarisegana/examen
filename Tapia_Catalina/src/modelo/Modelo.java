/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.util.*;
import Vista.Interfaz;
import javax.swing.table.DefaultTableModel;
import Vista.InterfazListar;
import Vista.InterfazEliminar;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class Modelo {
    
 public ArrayList <Instrumento>Instrumento2 = new ArrayList <>();       
 Interfaz Interfaz = new Interfaz ();
 InterfazListar InterfazListar = new InterfazListar();
 DefaultTableModel tableModel = (DefaultTableModel) this.InterfazListar.TablaInstrumento.getModel();  
 InterfazEliminar InterfazEliminar = new InterfazEliminar();
 
 
 
    public Modelo() {}

    private String[] columNames = {"Codigo","Nombre","Stock","Tipo","Características"};
    
    public boolean AgregarDatos (String codigo, String nombre, String stock, boolean tipoguitarra, boolean tipopiano, String característica) 
    {
     if (codigo.equals("")) {
                
     JOptionPane.showMessageDialog(Interfaz, "No Ingresó el Código del Producto Correctamente.", "Error en el Ingreso de Información", JOptionPane.WARNING_MESSAGE);

            } else if (!codigo.equals("")) {
            
            String codigo1 =codigo;
            int validacioncodigo = 0;
            for (int i = 0; i<Instrumento2.size(); i++) {
                if (Instrumento2.get(i).codigo.equals(codigo1)) {
            validacioncodigo = validacioncodigo +1;}    
            }
            
            if (validacioncodigo > 0) {
            JOptionPane.showMessageDialog(Interfaz, "El Codigo que Ingresó Ya existe. Ingrese Nuevo Codigo", "Error en el Ingreso de Información", JOptionPane.WARNING_MESSAGE);
            } else {
            
            if (nombre.equals("")) {
            JOptionPane.showMessageDialog(Interfaz, "No Ingresó el Nombre del Producto Correctamente.", "Error en el Ingreso de Información", JOptionPane.WARNING_MESSAGE);
            }  else {
            
            if (stock.equals("")) {
            JOptionPane.showMessageDialog(Interfaz, "No Ingresó Stock del Producto.", "Error en el Ingreso de Información", JOptionPane.WARNING_MESSAGE);
            } else {
                
             int validacionstock =0;   
            try { 
               
            float validastock = Float.parseFloat(stock); 
            validacionstock =1; } 
            catch (NumberFormatException  f )   {
            JOptionPane.showMessageDialog(Interfaz, "Ingrese Stock Igual o Mayor a 0.", "Error en el Ingreso de Información", JOptionPane.CANCEL_OPTION);
            }
            
            if (validacionstock ==1) {
            
            if (!(tipoguitarra || tipopiano)) {
            JOptionPane.showMessageDialog(Interfaz, "Ingrese Tipo de Instrumento.", "Error en el Ingreso de Información", JOptionPane.CANCEL_OPTION);
            }  else {
            if (característica.equals("Característica Instrumento")) {
              JOptionPane.showMessageDialog(Interfaz, "No Ingreso Características del Producto.", "Error en el Ingreso de Información", JOptionPane.WARNING_MESSAGE);
            } else {
            
                        
            String tipo = "";
            
            if (tipoguitarra) {
            tipo = "Guitarra";
            } else if (tipopiano) {
            tipo = "Piano";
            }
            
            Instrumento Instrumento = new Instrumento(codigo,nombre,stock,tipo,característica);
            
            Instrumento2.add(Instrumento);
            
         
            JOptionPane.showMessageDialog(Interfaz, "Instrumento Ingresado Exitosamente", "Ingreso de Información", JOptionPane.INFORMATION_MESSAGE);
           
            
            }}}}}}}return true;}
            
      
     public void listarObjetos () {
     if (Instrumento2.size()<=0) {    
                
            JOptionPane.showMessageDialog(Interfaz, "No Hay Datos de Productos Para Mostrar. Primero Ingrese Datos.", "Error la Muestra de Información", JOptionPane.WARNING_MESSAGE);      
            }     else {Interfaz.setVisible(false);  
            
            tableModel.setRowCount(0);
            for (int i=0; i< Instrumento2.size(); i++ ){
            
            Object [] rowdata = new Object [5];
            rowdata[0] = Instrumento2.get(i).codigo;
            rowdata[1] = Instrumento2.get(i).nombre;
            rowdata[2] = Instrumento2.get(i).stock;
            rowdata[3] = Instrumento2.get(i).tipo;
            rowdata[4] = Instrumento2.get(i).caracteristicas;
             tableModel.addRow(rowdata);}
            this.InterfazListar.TablaInstrumento.setModel(tableModel);
            this.InterfazListar.setVisible(true);   
           
            }}
     
     
     public void Eliminar () {
    System.out.println("Eliminar del modelo");
      if (Instrumento2.isEmpty()) {    
     JOptionPane.showMessageDialog(Interfaz, "No Hay Datos de Productos Para Mostrar. Primero Ingrese Datos.", "Error la Muestra de Información", JOptionPane.WARNING_MESSAGE); }   
     else {
        this.InterfazListar.setVisible(true);  
         this.InterfazEliminar.setVisible(true);
        this.Interfaz.setVisible(false);   
         }
     }
    
     
     
    public void confirmaeliminar (String codigoeliminar) {
    int Contador = 0;     
    for (int i = 0; i<Instrumento2.size(); i++){
    
        if (Instrumento2.get(i).getCodigo().equals(codigoeliminar)) {
            Instrumento2.remove(i);
            Contador= Contador + 1;}} 
            
        if (Contador!=0) {
            this.InterfazEliminar.setVisible(false);
            this.InterfazListar.setVisible(false);
            this.Interfaz.setVisible(true);
            JOptionPane.showMessageDialog(this.InterfazEliminar, "El Instrumento ha Sido Eliminado", "Error en el Ingreso de Información", JOptionPane.INFORMATION_MESSAGE);      
            } else if (Contador==0) {
            JOptionPane.showMessageDialog(this.InterfazEliminar, "El Codigo Ingresado no Existe", "Error en el Ingreso de Información", JOptionPane.WARNING_MESSAGE);      
            }}}



     
     
    
    
    
    
  
    
    
    
    
