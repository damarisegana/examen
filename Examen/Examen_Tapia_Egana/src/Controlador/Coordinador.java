package Controlador;

import Modelo.Registro;
import Vista.Buscar_Eliminar;
import Vista.Ingresar;
import Vista.Inicio;
import Vista.Modificar;
import Vista.Listar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import Vista.Consulta;

/**
 *
 * @author Duoc UC
 */
public class Coordinador implements ActionListener, MouseListener {

    private Inicio vistaInicio;
    private Buscar_Eliminar vistaBuscarEliminar;
    private Ingresar vistaIngresar;
    private Modificar vistaModificar;
    private Listar vistaMostrar;
    private Consulta vistaConsulta;

    Registro modelo = new Registro();

    Coordinador(Inicio inicio) {
    }

    public enum AccionMVC {
        _menuSalir,
        _menuBuscarEliminar,
        _menuIngresar,
        _menuModificar,
        _menuMostrar,
        _menuConsulta,
        _buscarEliminarBuscar,
        _buscarEliminarEliminar,
        _ingresarIngresar,
        _ingresarLimpiar,
        _modificarSeleccionar,
        _modificarModificar,
       
        _consulta2,
        _consulta5,
        _consulta6
    }

    public Coordinador(Inicio vistaInicio, Buscar_Eliminar vistaBuscarEliminar, Ingresar vistaIngresar, Modificar vistaModificar, Listar vistaMostrar, Consulta vistaConsulta) {
        this.vistaInicio = vistaInicio;
        this.vistaBuscarEliminar = vistaBuscarEliminar;
        this.vistaIngresar = vistaIngresar;
        this.vistaModificar = vistaModificar;
        this.vistaMostrar = vistaMostrar;
        this.vistaConsulta = vistaConsulta;
    }

    public void iniciar() {
        try {
            vistaInicio.setVisible(true);
        } catch (Exception ex) {
        }
        //menu salir
        this.vistaInicio.menusalir.setActionCommand("_menuSalir");
        this.vistaInicio.menusalir.addActionListener(this);

        this.vistaBuscarEliminar.menusalir.setActionCommand("_menuSalir");
        this.vistaBuscarEliminar.menusalir.addActionListener(this);

        this.vistaIngresar.menusalir.setActionCommand("_menuSalir");
        this.vistaIngresar.menusalir.addActionListener(this);

        this.vistaModificar.menusalir.setActionCommand("_menuSalir");
        this.vistaModificar.menusalir.addActionListener(this);

        this.vistaMostrar.menusalir.setActionCommand("_menuSalir");
        this.vistaMostrar.menusalir.addActionListener(this);

        this.vistaConsulta.menusalir.setActionCommand("_menuSalir");
        this.vistaConsulta.menusalir.addActionListener(this);

        //menu buscareliminar
        this.vistaInicio.menubuscaraliminar.setActionCommand("_menuBuscarEliminar");
        this.vistaInicio.menubuscaraliminar.addActionListener(this);

        this.vistaIngresar.menubuscaraliminar.setActionCommand("_menuBuscarEliminar");
        this.vistaIngresar.menubuscaraliminar.addActionListener(this);

        this.vistaModificar.menubuscaraliminar.setActionCommand("_menuBuscarEliminar");
        this.vistaModificar.menubuscaraliminar.addActionListener(this);

        this.vistaMostrar.menubuscaraliminar.setActionCommand("_menuBuscarEliminar");
        this.vistaMostrar.menubuscaraliminar.addActionListener(this);

        this.vistaConsulta.menubuscaraliminar.setActionCommand("_menuBuscarEliminar");
        this.vistaConsulta.menubuscaraliminar.addActionListener(this);

        // menu ingresar
        this.vistaInicio.menuingresar.setActionCommand("_menuIngresar");
        this.vistaInicio.menuingresar.addActionListener(this);

        this.vistaBuscarEliminar.menuingresar.setActionCommand("_menuIngresar");
        this.vistaBuscarEliminar.menuingresar.addActionListener(this);

        this.vistaModificar.menuingresar.setActionCommand("_menuIngresar");
        this.vistaModificar.menuingresar.addActionListener(this);

        this.vistaMostrar.menuingresar.setActionCommand("_menuIngresar");
        this.vistaMostrar.menuingresar.addActionListener(this);

        this.vistaConsulta.menuingresar.setActionCommand("_menuIngresar");
        this.vistaConsulta.menuingresar.addActionListener(this);

        // menu mostrar
        this.vistaInicio.menumostrar.setActionCommand("_menuMostrar");
        this.vistaInicio.menumostrar.addActionListener(this);

        this.vistaBuscarEliminar.menumostrar.setActionCommand("_menuMostrar");
        this.vistaBuscarEliminar.menumostrar.addActionListener(this);

        this.vistaIngresar.menumostrar.setActionCommand("_menuMostrar");
        this.vistaIngresar.menumostrar.addActionListener(this);

        this.vistaModificar.menumostrar.setActionCommand("_menuMostrar");
        this.vistaModificar.menumostrar.addActionListener(this);

        this.vistaConsulta.menumostrar.setActionCommand("_menuMostrar");
        this.vistaConsulta.menumostrar.addActionListener(this);
        
        this.vistaMostrar.menumostrar.setActionCommand("_menuMostrar");
        this.vistaMostrar.menumostrar.addActionListener(this);
        

        //menumodificar
        this.vistaInicio.menumodificar.setActionCommand("_menuModificar");
        this.vistaInicio.menumodificar.addActionListener(this);

        this.vistaBuscarEliminar.menumodificar.setActionCommand("_menuModificar");
        this.vistaBuscarEliminar.menumodificar.addActionListener(this);

        this.vistaIngresar.menumodificar.setActionCommand("_menuModificar");
        this.vistaIngresar.menumodificar.addActionListener(this);

        this.vistaMostrar.menumodificar.setActionCommand("_menuModificar");
        this.vistaMostrar.menumodificar.addActionListener(this);

        this.vistaConsulta.menumodificar.setActionCommand("_menuModificar");
        this.vistaConsulta.menumodificar.addActionListener(this);

        //menuconsulta _menuConsulta
        this.vistaInicio.menuconsulta.setActionCommand("_menuConsulta");
        this.vistaInicio.menuconsulta.addActionListener(this);

        this.vistaBuscarEliminar.menuconsulta.setActionCommand("_menuConsulta");
        this.vistaBuscarEliminar.menuconsulta.addActionListener(this);

        this.vistaIngresar.menuconsulta.setActionCommand("_menuConsulta");
        this.vistaIngresar.menuconsulta.addActionListener(this);

        this.vistaMostrar.menuconsulta.setActionCommand("_menuConsulta");
        this.vistaMostrar.menuconsulta.addActionListener(this);

        this.vistaModificar.menuconsulta.setActionCommand("_menuConsulta");
        this.vistaModificar.menuconsulta.addActionListener(this);
        //

        this.vistaBuscarEliminar.btnbuscar.setActionCommand("_buscarEliminarBuscar");
        this.vistaBuscarEliminar.btnbuscar.addActionListener(this);

        this.vistaBuscarEliminar.btneliminar.setActionCommand("_buscarEliminarEliminar");
        this.vistaBuscarEliminar.btneliminar.addActionListener(this);

        this.vistaIngresar.btningresar.setActionCommand("_ingresarIngresar");
        this.vistaIngresar.btningresar.addActionListener(this);
        
        this.vistaIngresar.btnlimpiar.setActionCommand("_ingresarLimpiar");
        this.vistaIngresar.btnlimpiar.addActionListener(this);

        this.vistaModificar.btnseleccionarCod.setActionCommand("_modificarSeleccionar");
        this.vistaModificar.btnseleccionarCod.addActionListener(this);

        this.vistaModificar.btnmodificar.setActionCommand("_modificarModificar");
        this.vistaModificar.btnmodificar.addActionListener(this);

//        // Consultas 
//       
//
        this.vistaConsulta.btnconsulta2.setActionCommand("_consulta2");
        this.vistaConsulta.btnconsulta2.addActionListener(this);
//
//        this.vistaConsulta.btnconsulta5.setActionCommand("_consulta5");
//        this.vistaConsulta.btnconsulta5.addActionListener(this);
//
//        this.vistaConsulta.btnconsulta6.setActionCommand("_consulta6");
//        this.vistaConsulta.btnconsulta6.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        switch (AccionMVC.valueOf(e.getActionCommand())) {
            case _menuSalir:
                System.exit(0);
                break;
                
            case _menuBuscarEliminar:
                this.vistaInicio.setVisible(false);
                this.vistaIngresar.setVisible(false);
                this.vistaConsulta.setVisible(false);
                this.vistaMostrar.setVisible(false);
                this.vistaModificar.setVisible(false);
                this.vistaBuscarEliminar.setVisible(true);
                break;
                
            case _menuIngresar:
                this.vistaInicio.setVisible(false);
                this.vistaBuscarEliminar.setVisible(false);
                this.vistaConsulta.setVisible(false);
                this.vistaMostrar.setVisible(false);
                this.vistaModificar.setVisible(false);
                this.vistaIngresar.setVisible(true);
                break;
                
            case _menuModificar:
                this.vistaInicio.setVisible(false);
                this.vistaBuscarEliminar.setVisible(false);
                this.vistaConsulta.setVisible(false);
                this.vistaIngresar.setVisible(false);
                this.vistaMostrar.setVisible(false);
                this.vistaModificar.setVisible(true);
                break;
                
            case _menuMostrar:
                this.vistaInicio.setVisible(false);
                this.vistaConsulta.setVisible(false);
                this.vistaBuscarEliminar.setVisible(false);
                this.vistaIngresar.setVisible(false);
                this.vistaModificar.setVisible(false);
                this.vistaMostrar.setVisible(true);
                this.vistaMostrar.tablaproducto.setModel(this.modelo.MostrarEmp());
                break;
                
            case _menuConsulta:
                this.vistaConsulta.setVisible(true);
                this.vistaInicio.setVisible(false);
                this.vistaBuscarEliminar.setVisible(false);
                this.vistaIngresar.setVisible(false);
                this.vistaMostrar.setVisible(false);
                this.vistaModificar.setVisible(false);
                break;
                
            case _buscarEliminarBuscar:
                if (this.modelo.Validar2(this.vistaBuscarEliminar.txtcodigo_buscar.getText())) {
                    this.vistaBuscarEliminar.tablaproductos.setModel(this.modelo.BuscarEmp((this.vistaBuscarEliminar.txtcodigo_buscar.getText())));
                }
                break;
                
            case _buscarEliminarEliminar:
                if (this.modelo.EliminarEmp(this.vistaBuscarEliminar.txtcodigo_buscar.getText())) {
                    JOptionPane.showMessageDialog(vistaBuscarEliminar, "Exito: Registro Eliminado.");
                    this.vistaBuscarEliminar.tablaproductos.setModel(this.modelo.MostrarEmp());
                    this.vistaBuscarEliminar.txtcodigo_buscar.setText("");
                } else {
                    JOptionPane.showMessageDialog(vistaBuscarEliminar, "Error: Registro no fue Eliminado.");
                }
                break;
                
            case _ingresarIngresar:
                if (this.modelo.IngresarEmp(
                        (this.vistaIngresar.txtcodigo.getText()),
                        this.vistaIngresar.txtnombre.getText(),
                        this.vistaIngresar.txtapellido.getText(),
                        this.vistaIngresar.txtrun.getText(),
                        this.vistaIngresar.txtsueldobruto.getText(),
                        this.vistaIngresar.txtcelular.getText(),
                        this.vistaIngresar.txtmail.getText(),
                        this.vistaIngresar.comboestadocivil.getSelectedIndex(),
                        this.vistaIngresar.combodepartamento.getSelectedItem().toString()
                )) {
                    JOptionPane.showMessageDialog(vistaIngresar, "Exito: Registro Ingresado.");
                    this.vistaIngresar.txtcodigo.setText("");
                    this.vistaIngresar.txtnombre.setText("");
                    this.vistaIngresar.txtapellido.setText("");
                    this.vistaIngresar.txtrun.setText("");
                    this.vistaIngresar.txtsueldobruto.setText("");
                    this.vistaIngresar.txtcelular.setText("");
                    this.vistaIngresar.txtmail.setText("");
                    this.vistaIngresar.comboestadocivil.setSelectedIndex(0);
                    this.vistaIngresar.combodepartamento.setSelectedIndex(0);
                }
                break;
                
            case _ingresarLimpiar:
                this.vistaIngresar.txtcodigo.setText("");
                this.vistaIngresar.txtnombre.setText("");
                this.vistaIngresar.txtapellido.setText("");
                this.vistaIngresar.txtrun.setText("");
                this.vistaIngresar.txtsueldobruto.setText("");
                this.vistaIngresar.txtcelular.setText("");
                this.vistaIngresar.txtmail.setText("");
                this.vistaIngresar.comboestadocivil.setSelectedIndex(0);
                this.vistaIngresar.combodepartamento.setSelectedIndex(0);
                this.vistaIngresar.txtcodigo.requestFocusInWindow();
                break;

            case _modificarSeleccionar:
                this.vistaModificar.tablita.setVisible(false);
                if (this.modelo.Validar2(this.vistaModificar.txtcodigo.getText())) {
                    this.modelo.BuscarEmp(this.vistaModificar.txtcodigo.getText());
                    this.vistaModificar.tablita.setModel(this.modelo.BuscarEmp((this.vistaModificar.txtcodigo.getText())));
           
                    this.vistaModificar.txtrun.setText(String.valueOf(this.vistaModificar.tablita.getValueAt(0, 1)));
                    this.vistaModificar.txtnombre.setText(String.valueOf(this.vistaModificar.tablita.getValueAt(0, 2)));
                    this.vistaModificar.txtapellido.setText(String.valueOf(this.vistaModificar.tablita.getValueAt(0, 3)));
                    this.vistaModificar.txtcelular.setText(String.valueOf(this.vistaModificar.tablita.getValueAt(0, 4)));
                    this.vistaModificar.txtmail.setText(String.valueOf(this.vistaModificar.tablita.getValueAt(0, 5)));
                    this.vistaModificar.txtsueldobruto.setText(String.valueOf(this.vistaModificar.tablita.getValueAt(0, 6)));
                    if (String.valueOf(this.vistaModificar.tablita.getValueAt(0, 7)).equals("C")) {
                        this.vistaModificar.comboestadocivil.setSelectedIndex(1);
                    } else if (String.valueOf(this.vistaModificar.tablita.getValueAt(0, 7)).equals("S")) {
                        this.vistaModificar.comboestadocivil.setSelectedIndex(2);
                    } else {
                        this.vistaModificar.comboestadocivil.setSelectedIndex(3);
                    }
                    this.vistaModificar.combodepartamento.setSelectedItem(String.valueOf(this.vistaModificar.tablita.getValueAt(0, 8)));
                }
                break;
//Código", "Rut","Nombre", "Apellido", "Celular", "Email", "Sueldo Bruto", "Estado Civil", "Departamento"

            case _modificarModificar:
                if (this.modelo.ModificarEmp(
                        this.vistaModificar.txtcodigo.getText(),
                        this.vistaModificar.txtrun.getText(),
                        this.vistaModificar.txtnombre.getText(),
                        this.vistaModificar.txtapellido.getText(),
                        this.vistaModificar.txtcelular.getText(),
                        this.vistaModificar.txtmail.getText(),
                        this.vistaModificar.txtsueldobruto.getText(),
                        this.vistaModificar.comboestadocivil.getSelectedIndex(),
                        this.vistaModificar.combodepartamento.getSelectedItem().toString()
                )) {
                    JOptionPane.showMessageDialog(vistaModificar, "Exito: Registro modificado.");
                    this.vistaIngresar.txtcodigo.setText("");
                    this.vistaIngresar.txtnombre.setText("");
                    this.vistaIngresar.txtapellido.setText("");
                    this.vistaIngresar.txtrun.setText("");
                    this.vistaIngresar.txtsueldobruto.setText("");
                    this.vistaIngresar.txtcelular.setText("");
                    this.vistaIngresar.txtmail.setText("");
                    this.vistaIngresar.comboestadocivil.setSelectedIndex(0);
                    this.vistaIngresar.combodepartamento.setSelectedIndex(0);
                }
                break;

 
            case _consulta2:
                this.vistaInicio.setVisible(false);
                this.vistaConsulta.setVisible(false);
                this.vistaBuscarEliminar.setVisible(false);
                this.vistaIngresar.setVisible(false);
                this.vistaModificar.setVisible(false);
                this.vistaMostrar.setVisible(true);
                this.vistaMostrar.tablaproducto.setModel(this.modelo.consulta2());
                break;
//                
//            case _consulta5:
//                if (this.modelo.consulta5()) {
//                    JOptionPane.showMessageDialog(vistaModificar, "Exito: Consulta 2 Ejecutada, Pelicula(s) Eliminadas");
//                } else {
//                    JOptionPane.showMessageDialog(vistaModificar, "Error: Consulta 2 No Ejecutada, Pelicula(s) No Eliminadas.");
//                }
//                break;
//
//            case _consulta6:
//                if (this.modelo.consulta6()) {
//                    JOptionPane.showMessageDialog(vistaModificar, "Exito: Consulta 6 Ejecutada, Nombre de Peliculas Actualizado.");
//                } else {
//                    JOptionPane.showMessageDialog(vistaModificar, "Error: Consulta 6 Ejecutada, Nombre de Peliculas No Actualizado");
//                }
//                break;

        }
    }

    Coordinador(Inicio inicio, Ingresar ingresar, Buscar_Eliminar buscar_Eliminar, Modificar modificar, Listar mostrar) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
