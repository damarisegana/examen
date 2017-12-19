/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import vista.InterfazListar;
import vista.InterfazEliminar;
import vista.Interfaz;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Duoc UC
 */
public class modelo {
    
    public ArrayList <Instrumento>Instrumento2 = new ArrayList <>();       
 Interfaz Interfaz = new Interfaz ();
 InterfazListar InterfazListar = new InterfazListar();
 DefaultTableModel tableModel = (DefaultTableModel) this.InterfazListar.TablaInstrumento.getModel();  
 InterfazEliminar InterfazEliminar = new InterfazEliminar();
 
    public modelo() {}

    private String[] columNames = {"Codigo","Nombre","Stock","Tipo","Características"};


  public boolean AgregarDatos (String codigo, String nombre, String stock, boolean tipoguitarra, boolean tipopiano, String característica) 
    {
     if (codigo.equals("")) {
                
     JOptionPane.showMessageDialog(Interfaz, "No Ingresó Código del Producto.", "Error en el Ingreso de Información", JOptionPane.WARNING_MESSAGE);
     return false;
            } else if (!codigo.equals("")) {
            
            String codigo1 =codigo;
            int validacioncodigo = 0;
            for (int i = 0; i<Instrumento2.size(); i++) {
                if (Instrumento2.get(i).codigo.equals(codigo1)) {
            validacioncodigo = validacioncodigo +1;}    
            }
            
            if (validacioncodigo > 0) {
            JOptionPane.showMessageDialog(Interfaz, "El Codigo que Ingresó ya Existe. Ingrese Nuevo Codigo", "Error en el Ingreso de Información", JOptionPane.WARNING_MESSAGE);
            return false;
            } else {
            
            if (nombre.equals("")) {
            JOptionPane.showMessageDialog(Interfaz, "No Ingresó el Nombre del Producto Correctamente.", "Error en el Ingreso de Información", JOptionPane.WARNING_MESSAGE);
            return false;}  else {
            
            if (stock.equals("")) {
            JOptionPane.showMessageDialog(Interfaz, "No Ingresó Stock del Producto.", "Error en el Ingreso de Información", JOptionPane.WARNING_MESSAGE);
            return false;} else {
                
             int validacionstock =0;   
            try { 
               
            float validastock = Float.parseFloat(stock); 
            validacionstock =1; } 
            catch (NumberFormatException  f )   {
            JOptionPane.showMessageDialog(Interfaz, "Ingrese Stock Igual o Mayor a 0.", "Error en el Ingreso de Información", JOptionPane.CANCEL_OPTION);
            }
            
            if (validacionstock ==1) {
            
            if (!(tipoguitarra || tipopiano)) {
            JOptionPane.showMessageDialog(Interfaz, "No Ingresó Tipo de Instrumento.", "Error en el Ingreso de Información", JOptionPane.CANCEL_OPTION);
            return false;}  else {
            if (característica.equals("Característica Instrumento")) {
              JOptionPane.showMessageDialog(Interfaz, "No Ingreso Características del Producto.", "Error en el Ingreso de Información", JOptionPane.WARNING_MESSAGE);
            return false;
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
           return true;
            
            }}}}}}}return false;}

  public boolean validarlistar() {
        return Instrumento2.size() > 0;
  
  }
  
  
   public DefaultTableModel listarObjetos () {
     if (Instrumento2.size()<=0) {    
                
                
            }     else {Interfaz.setVisible(false);  
            
            tableModel.setRowCount(0);
            for (int i=0; i< Instrumento2.size(); i++ ){
            
            Object [] rowdata = new Object [5];
            rowdata[0] = Instrumento2.get(i).codigo;
            rowdata[1] = Instrumento2.get(i).nombre;
            rowdata[2] = Instrumento2.get(i).stock;
            rowdata[3] = Instrumento2.get(i).tipo;
            rowdata[4] = Instrumento2.get(i).caracteristicas;
             tableModel.addRow(rowdata);}}
     return tableModel;}
   
   
    public boolean Eliminar () {
    System.out.println("Eliminar del modelo");
        return !Instrumento2.isEmpty();}
      
        
    
   public boolean confirmaeliminar (String codigoeliminar) {
    int Contador = 0;     
    for (int i = 0; i<Instrumento2.size(); i++){
    
        if (Instrumento2.get(i).getCodigo().equals(codigoeliminar)) {
            Instrumento2.remove(i);
            Contador= Contador + 1;}} 
            
        if (Contador!=0) {
                 
            return true;} else if (Contador==0) {
                 
            } return false;}
  

}