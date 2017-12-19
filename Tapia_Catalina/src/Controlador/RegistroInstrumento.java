/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import Vista.Interfaz;
import Vista.InterfazListar;
import Vista.InterfazEliminar;
import modelo.Modelo;

public class RegistroInstrumento implements ActionListener {

public Interfaz Interfaz ;
public InterfazListar InterfazListar; //= new InterfazListar() ;
public InterfazEliminar InterfazEliminar; //=new InterfazEliminar();
//DefaultTableModel tableModel = (DefaultTableModel) this.InterfazListar.TablaInstrumento.getModel();   
public Modelo RegistroInstrumentoModelo = new Modelo();

public enum Accion  {
        btnagregar,
        btnlistar,
        btneliminar,
        btnsalir,
        tipoinstrumento,
        btnatras,
        ConfirmaEliminar,
        btnatras2,}

//Constructor
public RegistroInstrumento (Interfaz Interfaz, InterfazListar InterfazListar, InterfazEliminar InterfazEliminar) {

    this.Interfaz = Interfaz;
    this.InterfazListar = InterfazListar;
    this.InterfazEliminar = InterfazEliminar;} 

public void iniciarInterfaz()
    {          
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(Interfaz);
            SwingUtilities.updateComponentTreeUI(InterfazListar);
            SwingUtilities.updateComponentTreeUI(InterfazEliminar);
            
            //SwingUtilities.updateComponentTreeUI( this.modProd );
            this.Interfaz.setLocationRelativeTo(null);
           // this.Interfaz.setTitle("El Dato");
            this.Interfaz.setVisible(true);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {}
       
        this.Interfaz.btnagregar.setActionCommand( "btnagregar" );
        this.Interfaz.btnagregar.addActionListener(this);

        this.Interfaz.btnlistar.setActionCommand( "btnlistar" );
        this.Interfaz.btnlistar.addActionListener(this);
        
        this.Interfaz.tipoguitarra.setActionCommand("tipoguitarra");
        this.Interfaz.tipoguitarra.addActionListener(this);
        
        this.Interfaz.tipopiano.setActionCommand("tipopiano");
        this.Interfaz.tipopiano.addActionListener(this);
        
        this.Interfaz.btnsalir.setActionCommand( "btnsalir" );
        this.Interfaz.btnsalir.addActionListener(this);
   
        this.Interfaz.tipoguitarra.setActionCommand("tipoinstrumento");
        this.Interfaz.tipoguitarra.addActionListener(this);
        
        this.Interfaz.tipopiano.setActionCommand("tipoinstrumento");
        this.Interfaz.tipopiano.addActionListener(this);
        
        this.Interfaz.menueliminar.setActionCommand("btneliminar");
        this.Interfaz.menueliminar.addActionListener(this);
       
        this.Interfaz.menulistar.setActionCommand("btnlistar");
        this.Interfaz.menulistar.addActionListener(this);
        
        this.InterfazListar.btneliminar.setActionCommand( "btneliminar" );
        this.InterfazListar.btneliminar.addActionListener(this);
        
        this.InterfazListar.btnsalir.setActionCommand("btnsalir");
        this.InterfazListar.btnsalir.addActionListener(this);
        
        this.InterfazListar.btnatras.setActionCommand( "btnatras" );
        this.InterfazListar.btnatras.addActionListener(this);
        
        this.InterfazListar.menuagregar.setActionCommand("btnatras");
        this.InterfazListar.menuagregar.addActionListener(this);
        
        this.InterfazListar.menueliminar.setActionCommand("btneliminar");
        this.InterfazListar.menueliminar.addActionListener(this);
        
        this.InterfazEliminar.btnatras.setActionCommand( "btnatras2" );
        this.InterfazEliminar.btnatras.addActionListener(this);
        
        this.InterfazEliminar.confirmaeliminar.setActionCommand("ConfirmaEliminar");
        this.InterfazEliminar.confirmaeliminar.addActionListener(this);  
    }   

public void iniciarListar()
    {          
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(Interfaz);
            SwingUtilities.updateComponentTreeUI(InterfazListar);
            SwingUtilities.updateComponentTreeUI(InterfazEliminar);
            
            //SwingUtilities.updateComponentTreeUI( this.modProd );
            //this.Interfaz.setLocationRelativeTo(null);
           // this.Interfaz.setTitle("El Dato");
           
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {}
       
       
        this.InterfazListar.btneliminar.setActionCommand( "btneliminar" );
        this.InterfazListar.btneliminar.addActionListener(this);
        
        this.InterfazListar.btnsalir.setActionCommand("btnsalir");
        this.InterfazListar.btnsalir.addActionListener(this);
        
        this.InterfazListar.btnatras.setActionCommand( "btnatras" );
        this.InterfazListar.btnatras.addActionListener(this);
        
        this.InterfazListar.menuagregar.setActionCommand("btnatras");
        this.InterfazListar.menuagregar.addActionListener(this);
        
        this.InterfazListar.menueliminar.setActionCommand("btneliminar");
        this.InterfazListar.menueliminar.addActionListener(this);
         }   

public void iniciarEliminar()
    {          
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(Interfaz);
            SwingUtilities.updateComponentTreeUI(InterfazListar);
            SwingUtilities.updateComponentTreeUI(InterfazEliminar);
            
            //SwingUtilities.updateComponentTreeUI( this.modProd );
            //this.Interfaz.setLocationRelativeTo(null);
           // this.Interfaz.setTitle("El Dato");
        
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {}
       
        this.InterfazEliminar.btnatras.setActionCommand( "btnatras2" );
        this.InterfazEliminar.btnatras.addActionListener(this);
        
        this.InterfazEliminar.confirmaeliminar.setActionCommand("ConfirmaEliminar");
        this.InterfazEliminar.confirmaeliminar.addActionListener(this);  
    }   

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
            
            case btnagregar: 
            if(this.RegistroInstrumentoModelo.AgregarDatos(
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
            }
            break; 
                
            case btnlistar:
            this.RegistroInstrumentoModelo.listarObjetos();
            break;   
           
            case btneliminar:
            System.out.println("Eliminar del controlador");
            this.RegistroInstrumentoModelo.Eliminar();
            break;
        
            case ConfirmaEliminar:
            this.RegistroInstrumentoModelo.confirmaeliminar(this.InterfazEliminar.codigoelimar.getText()); 
            break;    
            
            case btnatras2:
            this.InterfazEliminar.setVisible(false);    
            break;
            
            case btnsalir:
                System.out.println("estoy en boton salir");
            System.exit(0);
            break;
            
            case btnatras:
            System.out.println("estoy en boton atras");
            this.InterfazListar.setVisible(false);
            this.Interfaz.setVisible(true);
            break;
            }
            }
   }
        
        
    

