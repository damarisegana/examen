/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Duoc UC
 */
public  class Instrumento {
    
    String codigo;
    String nombre;
    String stock;
    String tipo;
    String caracteristicas;
  
  public Instrumento(String codigo, String nombre, String stock, String tipo, String caracteristicas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.tipo = tipo;
        this.caracteristicas= caracteristicas;
    }  
    
    public void agregar () {
    
    
    
    };
    public void limpiar () {};
    public void eliminar (){};

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

    public String getStock() {
        return stock;
    }

    public void setStock(String Stock) {
        this.stock = Stock;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    
    
}
