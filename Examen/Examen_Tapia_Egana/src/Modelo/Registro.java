package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

//Ver nombre de las bases.
//modificar sql
//ver las validaciones.
public class Registro extends Conexion.Conexion {

    private String[] columNames = {"Código", "Rut", "Nombre", "Apellido", "Celular", "Email", "Sueldo Bruto", "Estado Civil", "Departamento"};
    public TableModel ModificarSeleccionar;

    public Registro() {
        super();
    }

    public boolean IngresarEmp(String codigo, String nombre, String apellido, String rut, String sueldo, String celular, String mail, int estadoCivil, String departamento) {
        String eCivil;

        if (estadoCivil == 1) {
            eCivil = "C";
        } else if (estadoCivil == 2) {
            eCivil = "S";
        } else {
            eCivil = "V";
        }

        if (validarTodo(codigo, rut, nombre, apellido, celular, mail, sueldo, estadoCivil, departamento)) {
            int codigoint = Integer.parseInt(codigo);
            int celularint = Integer.parseInt(celular);
            int sueldoint = Integer.parseInt(sueldo);
            String q = " INSERT INTO empleados ( codigo , rut, nombre, apellido, celular, email, sueldo_bruto, est_civil, nom_depto) "
                    + "VALUES (" + codigoint + ",'" + rut + "','" + nombre + "','" + apellido + "'," + celular + ",'" + mail + "'," + sueldo + ",'" + estadoCivil + "','" + departamento + "');";
            //se ejecuta la consulta
            try {
                if (this.getConexion() == null) {
                    System.out.println("La conexión es nula");
                } else {
                    System.out.println("La conexión no es nula");
                    PreparedStatement pstm = this.getConexion().prepareStatement(q);
                    pstm.execute();
                    pstm.close();
                    return true;
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
            return false;
        }
        return false;
    }

    public boolean EliminarEmp(String codigo) {
        if (validarCodigo(codigo)) {
            if (existeCodigo(codigo)) {
                boolean res = false;
                int codigoint = Integer.parseInt(codigo);
                String q = " DELETE FROM empleados WHERE codigo=" + codigoint + ";";
                try {
                    PreparedStatement pstm = this.getConexion().prepareStatement(q);
                    pstm.execute();
                    pstm.close();
                    res = true;
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                }
                return res;
            }
        }
        return false;
    }

    public TableModel BuscarEmp(String codigo) {
        DefaultTableModel tablemodel = new DefaultTableModel();
        int producto = 0;

        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM empleados");
            ResultSet res = pstm.executeQuery();
            res.next();
            producto = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        Object[][] data = new String[producto][9];
        try {
            System.out.println("Estoy dentro de la parte que arma la tabla");
            PreparedStatement pstm = this.getConexion().prepareStatement("select * from empleados where codigo=" + codigo + ";");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("codigo");
                data[i][1] = res.getString("rut");
                data[i][2] = res.getString("nombre");
                data[i][3] = res.getString("apellido");
                data[i][4] = res.getString("celular");
                data[i][5] = res.getString("email");
                data[i][6] = res.getString("sueldo_bruto");
                data[i][7] = res.getString("est_civil");
                data[i][8] = res.getString("nom_depto");
                i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Estoy fuera");
        return tablemodel;
    }

    public TableModel MostrarEmp() {
        DefaultTableModel tablemodel = new DefaultTableModel();
        int producto = 0;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM empleados");
            ResultSet res = pstm.executeQuery();
            res.next();
            producto = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        Object[][] data = new String[producto][9];
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("select * from empleados;");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("codigo");
                data[i][1] = res.getString("rut");
                data[i][2] = res.getString("nombre");
                data[i][3] = res.getString("apellido");
                data[i][4] = res.getString("celular");
                data[i][5] = res.getString("email");
                data[i][6] = res.getString("sueldo_bruto");
                data[i][7] = res.getString("est_civil");
                data[i][8] = res.getString("nom_depto");
                i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }

    public boolean ModificarEmp(String codigo, String nombre, String apellido, String rut, String sueldo, String celular, String mail, int estadoCivil, String departamento) {

        if (validarTodoMenosCodigo(rut, nombre, apellido, celular, mail, sueldo, estadoCivil, departamento)) {
            String q = " UPDATE empleados SET nombre = '" + nombre + "' , rut = '" + rut + "' , apellido = '" + apellido + "', celular=" + celular + ", email='" + mail + "', sueldo_bruto=" + sueldo + ", est_civil='" + estadoCivil + "', nom_depto='" + departamento + "' WHERE codigo =" + codigo + ";";
            try {
                PreparedStatement pstm = this.getConexion().prepareStatement(q);
                pstm.execute();
                pstm.close();
                return true;
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
            return false;
        } else {
            return false;
        }
    }

    public TableModel consulta2() {

        DefaultTableModel tablemodel = new DefaultTableModel();
        int producto = 0;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM empleados where nom_depto = 'Redes'; ");
            ResultSet res = pstm.executeQuery();
            res.next();
            producto = res.getInt("total");
            System.out.println(producto);
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        if (producto == 0) {
            JOptionPane.showMessageDialog(null, "Error: No hay empleados en el departamento Redes.");
        } else {

            Object[][] data = new String[producto][9];
            try {
                PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM empleados WHERE nom_depto = 'Redes';  ");
                ResultSet res = pstm.executeQuery();
                int i = 0;
                while (res.next()) {
                    data[i][0] = res.getString("codigo");
                    data[i][1] = res.getString("rut");
                    data[i][2] = res.getString("nombre");
                    data[i][3] = res.getString("apellido");
                    data[i][4] = res.getString("celular");
                    data[i][5] = res.getString("email");
                    data[i][6] = res.getString("sueldo_bruto");
                    data[i][7] = res.getString("est_civil");
                    data[i][8] = res.getString("nom_depto");
                    i++;
                }
                res.close();
                tablemodel.setDataVector(data, columNames);
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
        return tablemodel;

    }

    public boolean consulta3() {
        int producto = 0;

        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM empleados WHERE sueldo_bruto=120000;");
            ResultSet res = pstm.executeQuery();
            res.next();
            producto = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        if (producto > 0) {
            String q = " DELETE FROM empleados WHERE sueldo_bruto=120000;";
            try {
                PreparedStatement pstm = this.getConexion().prepareStatement(q);
                pstm.execute();
                pstm.close();
                return true;
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
            return false;
        }
        return false;
    }

    public boolean consulta4() {
        int producto = 0;

        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM empleados;");
            ResultSet res = pstm.executeQuery();
            res.next();
            producto = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        if (producto > 0) {
            String q = " UPDATE empleados SET sueldo_bruto = sueldo_bruto * 1.1;";
            try {
                PreparedStatement pstm = this.getConexion().prepareStatement(q);
                pstm.execute();
                pstm.close();
                return true;
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
            return false;
        }
        return false;
    }

    public boolean validarNombre(String nombre) {
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese Nombre");
            return false;
        } else if (nombre.length()>20){
         JOptionPane.showMessageDialog(null, "Error: Nombre no puede superar los 20 caractéres.");
            return false;
        } else{       
            return true;
        }
    }

    public boolean validarCodigo(String codigo) {
        int validacioncodigo = 0;
        if (codigo.equals("")) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese Código.");
            return false;
        } else if (!codigo.equals("")) {
            try {
                float validacodigo = Float.parseFloat(codigo);
                validacioncodigo = 1;
            } catch (NumberFormatException f) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese Codigo Númerico mayor a 0 o menor o igual 100");
            }
        }

        if (validacioncodigo == 1) {
            int codigonum = Integer.parseInt(codigo);

            if (codigonum <= 0 || codigonum > 100) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese Codigo Númerico mayor a 0 o menor o igual 100");
                return false;
            } else if (codigonum > 0 && codigonum <= 100) {
                return true;
            }
        }
        return false;

    }

    public boolean existeCodigo(String codigo) {
        String existeCodigo = "";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT codigo FROM empleados where codigo =" + codigo + ";");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                existeCodigo = res.getString("codigo");
                i++;
            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error: Falla de Conexión");

        }
        if (!existeCodigo.equals(
                "")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Error: Código ingresado no existe");
            return false;

        }
    }

    public boolean noexisteCodigo(String codigo) {
        String existeCodigo = "";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT codigo FROM empleados where codigo =" + codigo + ";");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                existeCodigo = res.getString("codigo");
                i++;
            }
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        if (!existeCodigo.equals(
                "")) {
            JOptionPane.showMessageDialog(null, "Código ingresado ya existe");
            return false;
        } else {
            return true;
        }
    }

    public boolean validarRut(String rut) {
        if (rut.equals("")) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese Run.");
            return false;}
             else if (rut.length()>10){
         JOptionPane.showMessageDialog(null, "Error: Rut no puede superar los 10 caractéres.");
            return false;
        } else {
            return true;
        }
    }

    public boolean validarApellido(String apellido) {
        if (apellido.equals("")) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese Apellido.");
            return false;}
             else if (apellido.length()>20){
         JOptionPane.showMessageDialog(null, "Error: Apellido no puede superar los 20 caractéres.");
            return false;
        }
         else {
            return true;
        }

    }

    public boolean validarSueldo(String sueldo) {
        int validacionsueldo = 0;
        if (sueldo.equals("")) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese Sueldo");
            return false;
        } else if (!sueldo.equals("")) {
            try {
                float validasueldo = Float.parseFloat(sueldo);
                validacionsueldo = 1;
            } catch (NumberFormatException f) {
                JOptionPane.showMessageDialog(null, "Ingrese Sueldo Numérico Igual o Mayor a $120.000");
                return false;
            }
        }
        if (validacionsueldo == 1) {
            int sueldonum = Integer.parseInt(sueldo);
            if (sueldonum >= 120000 && sueldonum < 10000000) {
                return true; 
            } else {
                JOptionPane.showMessageDialog(null, "Error: Ingrese Sueldo Igual o Mayor a $120.000 y menor a $10.000.000");
                return false;
            }
        }
        return false;
    }

    public boolean validarCelular(String celular) {
        int validacioncelu = 0;
        if (celular.equals("")) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese Celular.");
            return false;
        } else if (!celular.equals("")) {
            try {
                float validacelu = Float.parseFloat(celular);
                validacioncelu = 1;
            } catch (NumberFormatException f) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese Celular Válido");
            }
        }
        if (validacioncelu == 1) {
            if (celular.length() != 9) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese Número Celular de 9 dígitos");
                return false;
            } else {
                return true;
            }
        }

        return false;
    }

    public boolean validarMail(String mail) {
        if (mail.equals("")) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese Mail");
            return false;}
             else if (mail.length()>30){
         JOptionPane.showMessageDialog(null, "Error: Mail no puede superar los 30 caractéres.");
            return false;
        } else {
            return true;
        }
    }

    public boolean validarEcivil(int estadoCivil) {
        if (estadoCivil == 0) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese Estado Civil");
            return false;
        } else {
            return true;
        }
    }

    public boolean validarDepartamento(String departamento) {
        if (departamento.equals("Ingrese Departamento")) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese Departamento");
            return false;
        } else {
            return true;
        }
    }

    public boolean validarTodo(String codigo, String rut, String nombre, String apellido, String celular, String email, String sueldo, int ecivil, String depto) {
        if (validarCodigo(codigo)) {
            if (noexisteCodigo(codigo)) {
                if (validarNombre(nombre)) {
                    if (validarApellido(apellido)) {
                        if (validarMail(email)) {
                            if (validarRut(rut)) {
                                if (validarCelular(celular)) {
                                    if (validarSueldo(sueldo)) {
                                        if (validarEcivil(ecivil)) {
                                            return validarDepartamento(depto);
                                        } else {
                                            return false;
                                        }
                                    } else {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean validarTodoMenosCodigo(String rut, String nombre, String apellido, String celular, String email, String sueldo, int ecivil, String depto) {
        if (validarNombre(nombre)) {
            if (validarApellido(apellido)) {
                if (validarMail(email)) {
                    if (validarRut(rut)) {
                        if (validarCelular(celular)) {
                            if (validarSueldo(sueldo)) {
                                if (validarEcivil(ecivil)) {
                                    return validarDepartamento(depto);
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
