/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import Modelo.chocolate;

import Vista.Inicio;
import Vista.vista_agregar;
import Vista.vista_eliminar;
import Vista.vista_listar;
import Vista.vista_buscar;

/**
 *
 * @author Duoc UC
 */
public class registroEscuchador implements ActionListener, MouseListener {

    //vista
    private Inicio vistaPrincipal;
    private vista_agregar agregar_choc = new vista_agregar();
    private vista_eliminar elim_choc = new vista_eliminar();
    private vista_listar listar_choc = new vista_listar();
    private vista_buscar buscar_choc = new vista_buscar();

    //modelo
    private chocolate modelo = new chocolate();

    //acciones que se ejecuta por los controles de cada VISTA
    public enum Accion {
        btnVistaAgregar, //-> Abre VISTA IngresarProducto
        btnVistaListar, //abre VISTA ListarProducto
        btnVistaBuscar,
        btnVistaEliminar,//-> Ejecuta consulta
        btnEliminar,
        btnBuscar,//-> Ejecuta consulta        
        btnGuardar,//->se ejecuta cuando se hace clic en boton guardar en vista IngresarProducto        
        btnModificar, //-> Ejecuta cuando se hace clic en boton modificar en vista ModificarProducto
        btnVolver,
        btnEliminarVolver,
        btnListarVolver,
        btnSalir
        //btningvol, //boton volver en ingreso producto
        //btnlistvol //boton volver en lista producto
    }

    /**
     * Constructor de clase
     */
    public registroEscuchador(JFrame padre) {
        this.vistaPrincipal = (Inicio) padre;
    }

    /**
     * Inicia todos las acciones y listener de la vista
     */
    public void iniciar() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vistaPrincipal);
            SwingUtilities.updateComponentTreeUI(this.agregar_choc);
            SwingUtilities.updateComponentTreeUI(this.elim_choc);
            SwingUtilities.updateComponentTreeUI(this.listar_choc);
            SwingUtilities.updateComponentTreeUI(this.buscar_choc);
            //SwingUtilities.updateComponentTreeUI( this.modProd );
            this.vistaPrincipal.setLocationRelativeTo(null);
            this.vistaPrincipal.setTitle("Chocolateria");
            this.vistaPrincipal.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        }

        //Escuchamos los botones de todas partes
        this.vistaPrincipal.menu_vista_agregar.setActionCommand("btnVistaAgregar");
        this.vistaPrincipal.menu_vista_agregar.addActionListener(this);
        this.vistaPrincipal.vista_listar.setActionCommand("btnVistaListar");
        this.vistaPrincipal.vista_listar.addActionListener(this);
        this.vistaPrincipal.btn_vista_buscar.setActionCommand("btnVistaBuscar");
        this.vistaPrincipal.btn_vista_buscar.addActionListener(this);
        //boton
        this.vistaPrincipal.jMenuItem3.setActionCommand("btnVistaEliminar");
        this.vistaPrincipal.jMenuItem3.addActionListener(this);
        this.vistaPrincipal.jMenuItem1.setActionCommand("btnSalir");
        this.vistaPrincipal.jMenuItem1.addActionListener(this);
        //boton
        //this.vistaPrincipal.btnBuscar.setActionCommand("btnBuscar");
        //this.vistaPrincipal.btnBuscar.addActionListener(this);
        //boton
        //this.vistaPrincipal.btnElimina.setActionCommand("btnElimina");
        //this.vistaPrincipal.btnElimina.addActionListener(this);

        //boton guardar en ingresar producto
        this.agregar_choc.jButton1.setActionCommand("btnGuardar");
        this.agregar_choc.jButton1.addActionListener(this);
        this.elim_choc.jButton1.setActionCommand("btnEliminar");
        this.elim_choc.jButton1.addActionListener(this);
        this.elim_choc.jButton2.setActionCommand("btnEliminarVolver");
        this.elim_choc.jButton2.addActionListener(this);
        this.buscar_choc.btn_buscar.setActionCommand("btnBuscar");
        this.buscar_choc.btn_buscar.addActionListener(this);
        this.buscar_choc.jButton1.setActionCommand("btnModificar");
        this.buscar_choc.jButton1.addActionListener(this);
        this.buscar_choc.jButton2.setActionCommand("btnVolver");
        this.buscar_choc.jButton2.addActionListener(this);
        this.listar_choc.jButton1.setActionCommand("btnListarVolver");
        this.listar_choc.jButton1.addActionListener(this);
        //this.ingProd.btningvol.setActionCommand("btningvol");
        //this.ingProd.btningvol.addActionListener(this);

        //boton modificar en modificarProducto
        //this.modProd.btnmodvol.setActionCommand("btnmodvol");
        //this.modProd.btnmodvol.addActionListener(this);
        //boton volver en lista producto
        ///this.elim_choc.jButton1.setActionCommand("btnEliminar");
        ///this.elim_choc.jButton1.addActionListener(this);
        //this.listProd.tbProducto.addMouseListener(this);
        //this.listProd.btnmodificar.setActionCommand("btnmodificar");
        //this.listProd.btnmodificar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Accion.valueOf(e.getActionCommand())) {
            case btnVistaAgregar:
                this.agregar_choc.setLocationRelativeTo(null);
                this.agregar_choc.setTitle("Ingresar Chocolate a la Chocolateria");
                this.agregar_choc.setVisible(true);
                this.vistaPrincipal.setVisible(false);
                break;
            case btnVistaEliminar:
                this.elim_choc.setLocationRelativeTo(null);
                this.elim_choc.setTitle("Eliminar Chocolate de la Chocolateria");
                this.elim_choc.setVisible(true);
                this.vistaPrincipal.setVisible(false);
                break;
            case btnEliminar:
                if (this.modelo.buscar(this.elim_choc.tf_elim.getText())) {
                    if (this.modelo.eliminarCho(this.elim_choc.tf_elim.getText())) {
                        JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
                        //Limpiamos textField
                        this.elim_choc.tf_elim.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo eliminar producto");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El código ingresado no existe!");
                }
                break;
            case btnVistaListar:
                this.listar_choc.setLocationRelativeTo(null);
                this.listar_choc.setTitle("Lista de Productos Chocolateria");
                this.listar_choc.setVisible(true);
                this.listar_choc.jTable1.setModel(this.modelo.ListadoProducto());
                break;
            case btnVistaBuscar:
                this.buscar_choc.setLocationRelativeTo(null);
                this.buscar_choc.setTitle("Búsqueda de Productos Chocolateria");
                this.buscar_choc.setVisible(true);
                break;            
            case btnBuscar:
                String code = this.buscar_choc.tf_buscar.getText();
                if (this.modelo.buscar(code)) {
                    String nom = "";
                    String desc = "";
                    String t_choc = "";
                    String t_sab = "";
                    String marc = "";
                    int prc = 0;
                    int cant = 0;
                    boolean sug;

                    nom = this.modelo.buscarPorCodigo(code).get(0).getNombre();
                    desc = this.modelo.buscarPorCodigo(code).get(0).getDescripcion();
                    prc = this.modelo.buscarPorCodigo(code).get(0).getPrecio_venta();
                    cant = this.modelo.buscarPorCodigo(code).get(0).getCantidad();
                    t_choc = this.modelo.buscarPorCodigo(code).get(0).getTipo_choc();
                    t_sab = this.modelo.buscarPorCodigo(code).get(0).getTipo_sabor();
                    marc = this.modelo.buscarPorCodigo(code).get(0).getMarca();
                    sug = this.modelo.buscarPorCodigo(code).get(0).isAzucar();
                    String p = Integer.toString(prc);
                    String c = Integer.toString(cant);

                    this.buscar_choc.tf_nom.setText(nom);
                    this.buscar_choc.ta_desc.setText(desc);
                    this.buscar_choc.tf_prc.setText(p);
                    this.buscar_choc.tf_cant.setText(c);
                    this.buscar_choc.jComboBox1.setSelectedItem(t_choc);
                    this.buscar_choc.jComboBox2.setSelectedItem(t_sab);
                    this.buscar_choc.jComboBox3.setSelectedItem(marc);
                    if (sug == true) {
                        this.buscar_choc.jRadioButton1.setSelected(true);
                    } else {
                        this.buscar_choc.jRadioButton2.setSelected(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un registro!");
                }

                break;
            case btnVolver:
                this.vistaPrincipal.setLocationRelativeTo(null);
                this.vistaPrincipal.setVisible(true);
                this.buscar_choc.setVisible(false);
                break;
            case btnEliminarVolver:
                this.vistaPrincipal.setLocationRelativeTo(null);
                this.vistaPrincipal.setVisible(true);
                this.elim_choc.setVisible(false);
                break;
            case btnListarVolver:
                this.vistaPrincipal.setLocationRelativeTo(null);
                this.vistaPrincipal.setVisible(true);
                this.listar_choc.setVisible(false);
                break;
            case btnSalir:
                this.vistaPrincipal.dispose();
                break;
            case btnGuardar:
                this.agregar_choc.jRadioButton1.setActionCommand("Si");
                this.agregar_choc.jRadioButton2.setActionCommand("No");

                //Enviamos datos del formulario Ingresar producto a metodo nuevoProducto
                if (this.agregar_choc.tf_cod.getText().length() == 3) {
                    if (this.agregar_choc.tf_nom.getText().length() > 0) {
                        if (this.agregar_choc.ta_desc.getText().length() > 0) {
                            if (Integer.parseInt(this.agregar_choc.tf_precio.getText()) > 0) {
                                if (Integer.parseInt(this.agregar_choc.tf_cant.getText()) >= 0) {
                                    if (this.modelo.buscar(this.agregar_choc.tf_cod.getText())) {
                                        JOptionPane.showMessageDialog(null, "El código ingresado ya existe!");
                                    } else {
                                        if (this.modelo.guardar(this.agregar_choc.tf_cod.getText(),
                                                this.agregar_choc.tf_nom.getText(),
                                                this.agregar_choc.ta_desc.getText(),
                                                this.agregar_choc.cb_tip_choc.getSelectedItem().toString(),
                                                this.agregar_choc.cb_tip_sab.getSelectedItem().toString(),
                                                this.agregar_choc.cb_tip_marca.getSelectedItem().toString(),
                                                Integer.parseInt(this.agregar_choc.tf_precio.getText()),
                                                Integer.parseInt(this.agregar_choc.tf_cant.getText()),
                                                this.agregar_choc.buttonGroup1.getSelection().getActionCommand()
                                        )) {
                                            JOptionPane.showMessageDialog(null, "Producto agregado correctamente");
                                            //Limpiamos textField
                                            this.agregar_choc.tf_cod.setText("");
                                            this.agregar_choc.tf_nom.setText("");
                                            this.agregar_choc.ta_desc.setText("");
                                            this.agregar_choc.tf_precio.setText("");
                                            this.agregar_choc.tf_cant.setText("");
                                        } else {
                                            JOptionPane.showMessageDialog(null, "No se pudo agregar producto");
                                        }
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "El campo Cantidad debe ser al menos '0'!");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "El campo Precio debe ser mayor a '0'!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El campo Descripción no puede estar vacío!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El campo Nombre no puede estar vacío!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El código debe ser de 3 caracteres!");
                }
                break;
            case btnModificar:
                if (this.modelo.modificaChocolate(
                        this.buscar_choc.tf_buscar.getText(),
                        this.buscar_choc.tf_nom.getText(),
                        this.buscar_choc.ta_desc.getText(),
                        this.buscar_choc.jComboBox1.getSelectedItem().toString(),
                        this.buscar_choc.jComboBox2.getSelectedItem().toString(),
                        this.buscar_choc.jComboBox3.getSelectedItem().toString(),
                        Integer.parseInt(this.buscar_choc.tf_prc.getText()),
                        Integer.parseInt(this.buscar_choc.tf_cant.getText()),
                        this.buscar_choc.buttonGroupBuscar.getSelection().getActionCommand()
                        )
                   ) {
                    JOptionPane.showMessageDialog(null, "Producto actualizado");
                    //Limpiamos textField
                    
                    //this.listProd.txtcod.setText("");
                    //this.listProd.txtnombre.setText("");
                    //this.listProd.txtfamprod.setText("");
                    //this.listProd.txtdescripcion.setText("");
                    //this.listProd.txtprecio.setText("");
                    //this.listProd.txtcantidad.setText("");
                }
                break;
            /*case btningvol:
                this.vistaPrincipal.setLocationRelativeTo(null);
                this.vistaPrincipal.setVisible(true);
                this.ingProd.setVisible(false);
                break;*/
 /*case btnlistvol:
                this.vistaPrincipal.setLocationRelativeTo(null);
                this.vistaPrincipal.setVisible(true);
                this.listProd.setVisible(false);
                break;*/
//            case btnmodvol:
//                this.vistaPrincipal.setLocationRelativeTo(null);
//                this.vistaPrincipal.setVisible(true);
//                this.modProd.setVisible(false);
//                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == 1)//boton izquierdo
        {
            //Muestro datos de producto a modificar
            /*int fila = this.listProd.tbProducto.rowAtPoint(e.getPoint());
             if (fila > -1){
                this.listProd.txtnombre.setText(String.valueOf(this.listProd.tbProducto.getValueAt(fila, 2) ));
                this.listProd.txtfamprod.setText(String.valueOf(this.listProd.tbProducto.getValueAt(fila, 3) ));
                this.listProd.txtdescripcion.setText(String.valueOf(this.listProd.tbProducto.getValueAt(fila, 6) ));
                this.listProd.txtcantidad.setText(String.valueOf(this.listProd.tbProducto.getValueAt(fila, 8) ));
                this.listProd.txtprecio.setText(String.valueOf(this.listProd.tbProducto.getValueAt(fila, 7) ));
                this.listProd.txtcod.setText(String.valueOf(this.listProd.tbProducto.getValueAt(fila, 1) ));
             }*/
        }
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
