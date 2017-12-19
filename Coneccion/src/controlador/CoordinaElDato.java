package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Modelo;
import vista.IngresaElDato;

// mensaje para revisar en SVN - ASL

public class CoordinaElDato implements ActionListener{

    //Declaro objeto vista
    private IngresaElDato vistaIngresaElDato;
    
    //Declaro objeto modelo
    private Modelo modelo = new Modelo();
    
    //declaro boton que esta en la vista ingresa el dato
    public enum Accion{
        btnagregar
    }

    //Constructor de coordinaElDato
    public CoordinaElDato(IngresaElDato vistaIngresaElDato) {
        this.vistaIngresaElDato = vistaIngresaElDato;
    }
    
    public void iniciar(){
        try {
            UIManager.setLookAndFeel
        ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vistaIngresaElDato);
            this.vistaIngresaElDato.setLocationRelativeTo(null);
            this.vistaIngresaElDato.setTitle("El Dato");
            this.vistaIngresaElDato.setVisible(true);
        }catch (UnsupportedLookAndFeelException ex) {}
          catch (ClassNotFoundException ex) {}
          catch (InstantiationException ex) {}
          catch (IllegalAccessException ex) {}

        //Escuchamos el boton de ingresa el dato
        this.vistaIngresaElDato.btnagregar.setActionCommand( "btnagregar" );
        this.vistaIngresaElDato.btnagregar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Accion.valueOf(e.getActionCommand() )){
            case btnagregar:
                //llamamos al metodo que esta en el modelo para agregar el dato
                //y le enviamos lo que captura del textField
                if(this.modelo.agregaDato(this.vistaIngresaElDato.txteldato.getText())){
                    JOptionPane.showMessageDialog(null,"El dato se agrego wiii!!!");
                    //Limpiamos textField
                    this.vistaIngresaElDato.txteldato.setText("");                    
                }else{
                    JOptionPane.showMessageDialog(null,"No se pudo agregar, penita...");
                }   
                break;
        }
    }
    
}
