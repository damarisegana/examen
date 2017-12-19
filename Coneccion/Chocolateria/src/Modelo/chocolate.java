/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Sql.conexion;
/**
 *
 * @author Duoc UC
 */
public class chocolate {
    private String codigo;
    private String nombre;
    private String descripcion;
    private int precio_venta;
    private int cantidad;
    private String tipo_choc;
    private String tipo_sabor;
    private String marca;
    private boolean azucar;

    public chocolate() {
    }

    public chocolate(String codigo, String nombre, String descripcion, int precio_venta, int cantidad, String tipo_choc, String tipo_sabor, String marca, boolean azucar) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio_venta = precio_venta;
        this.cantidad = cantidad;
        this.tipo_choc = tipo_choc;
        this.tipo_sabor = tipo_sabor;
        this.marca = marca;
        this.azucar = azucar;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo_choc() {
        return tipo_choc;
    }

    public void setTipo_choc(String tipo_choc) {
        this.tipo_choc = tipo_choc;
    }

    public String getTipo_sabor() {
        return tipo_sabor;
    }

    public void setTipo_sabor(String tipo_sabor) {
        this.tipo_sabor = tipo_sabor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isAzucar() {
        return azucar;
    }

    public void setAzucar(boolean azucar) {
        this.azucar = azucar;
    }
    
    public static boolean guardar(String cod,String nom, String desc, String t_choc, String t_sab, String marc,int prc, int cant, String sugar){
        try{
            boolean sug = true;
            if(sugar.equals("Si")){
                sug = true;
            }
            if(sugar.equals("No")){
                sug = false;
            }
            
            Connection cnx = conexion.getConexion();
            String query = "INSERT INTO chocolate(codigo,nombre,descripcion,precio_venta,cantidad,tipo_choc,tipo_sabor,marca,azucar) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement insertar = cnx.prepareStatement(query);
            insertar.setString(1, cod);
            insertar.setString(2, nom);
            insertar.setString(3, desc);
            insertar.setInt(4, prc);
            insertar.setInt(5, cant);
            insertar.setString(6, t_choc);
            insertar.setString(7, t_sab);
            insertar.setString(8, marc);
            insertar.setBoolean(9, sug);
            insertar.execute();
            insertar.close();
            cnx.close();
            return true;
        }catch(SQLException s){
            System.out.println("Error SQL al agregar chocolate"+s.getMessage());
            return false;
        }catch(Exception e){
            System.out.println("Error al agregar chocolate"+e.getMessage());
            return false;
        }
    }
    
    public ArrayList<chocolate> buscarPorCodigo(String cod){
        ArrayList<chocolate> listaChocolate = new ArrayList<chocolate>();
        try{
            Connection cnx4 = conexion.getConexion();
            String query = "SELECT * FROM chocolate WHERE codigo = ?";
            PreparedStatement buscarPorCodigo = cnx4.prepareStatement(query);
            buscarPorCodigo.setString(1, cod);
            ResultSet rs = buscarPorCodigo.executeQuery();
            while(rs.next()){
                chocolate cho = new chocolate();
                cho.setNombre(rs.getString("nombre"));
                cho.setDescripcion(rs.getString("descripcion"));
                cho.setPrecio_venta(rs.getInt("precio_venta"));
                cho.setCantidad(rs.getInt("cantidad"));
                cho.setTipo_choc(rs.getString("tipo_choc"));
                cho.setTipo_sabor(rs.getString("tipo_sabor"));
                cho.setMarca(rs.getString("marca"));
                cho.setAzucar(rs.getBoolean("azucar"));
                listaChocolate.add(cho);
            }
        }catch(SQLException s){
            System.out.println("Error SQL al listar chocolate"+s.getMessage());
        }catch(Exception e){
            System.out.println("Error al listar chocolate"+e.getMessage());
        }
        return listaChocolate;
    } 
    
    public static boolean buscar(String cod){
       try{
            Connection cnx3 = conexion.getConexion();
            String query = "SELECT * FROM chocolate WHERE codigo = ?";
            PreparedStatement buscar = cnx3.prepareStatement(query);
            buscar.setString(1, cod);
            ResultSet res = buscar.executeQuery();
            int count = 0;
            while(res.next()){
                count++;
            }
            buscar.close();
            cnx3.close();
            
            if(count == 0){
               return false; 
            }else{
               return true; 
            }
        }catch(SQLException s){
            System.out.println("Error SQL al eliminar chocolate"+s.getMessage());
            return false;
        }catch(Exception e){
            System.out.println("Error al eliminar chocolate"+e.getMessage());
            return false;
        } 
    }
    
    public static boolean eliminarCho(String cod){
        try{
            Connection cnx2 = conexion.getConexion();
            String query = "DELETE FROM chocolate WHERE codigo = ?";
            PreparedStatement elim = cnx2.prepareStatement(query);
            elim.setString(1, cod);
            elim.execute();
            elim.close();
            cnx2.close();
            return true;
        }catch(SQLException s){
            System.out.println("Error SQL al eliminar chocolate"+s.getMessage());
            return false;
        }catch(Exception e){
            System.out.println("Error al eliminar chocolate"+e.getMessage());
            return false;
        }
    }
    
    public DefaultTableModel ListadoProducto(){
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0;
      String[] columNames = {"Id","Codigo","Nombre","Descripcíon","Precio Venta","Cantidad","Tipo Choc","Tipo Sabor","Marca", "Azucar"};
      try{
         Connection cnx = conexion.getConexion();
         PreparedStatement pstm = cnx.prepareStatement( "SELECT count(*) as total FROM chocolate");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }
      Object[][] data = new String[registros][10];
      try{
         Connection cnx2 = conexion.getConexion();
         PreparedStatement pstm = cnx2.prepareStatement("SELECT * FROM chocolate");
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
                data[i][0] = res.getString( "id" );
                data[i][1] = res.getString( "codigo" );
                data[i][2] = res.getString( "nombre" );
                data[i][3] = res.getString( "descripcion" );
                data[i][4] = res.getString( "precio_venta" );
                data[i][5] = res.getString( "cantidad" );
                data[i][6] = res.getString( "tipo_choc" );
                data[i][7] = res.getString( "tipo_sabor" );
                data[i][8] = res.getString( "marca" );
                data[i][9] = res.getString( "azucar" );
            i++;
         }
         res.close();
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return tablemodel;
    }
    
    public boolean modificaChocolate(String cod,String nom, String desc, String t_cho, String t_sab, String marc, int prc, int cant, String sug){
        int s = 1;
        
        String q= "UPDATE chocolateria.chocolate SET nombre='"+nom+"', descripcion='"+desc+"' , precio_venta='"+prc+"' , cantidad='"+cant+"', tipo_choc='"+t_cho+"', tipo_sabor='"+t_sab+"', marca='"+marc+"', azucar='"+s+"' "
                + " WHERE codigo='"+cod+"' ";
        try {
            Connection cnx5 = conexion.getConexion();
            PreparedStatement pstm2 = cnx5.prepareStatement(q);
            pstm2.execute();
            pstm2.close();
            return true;
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return false;
    }
    
}
