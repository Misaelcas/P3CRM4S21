/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package informacion;


/**
 *
 * @author ACER
 */
public class informaciondireccion {
    String calles;
    String colonia;
    String municipio;
    String cp;
    String entidad; 
    
    
     public informaciondireccion(String calles, String colonia, String municipio, String cp, String entidad) {
       this.calles = calles;
       this.colonia = colonia;
       this.municipio = municipio;
       this.cp = cp;
       this.entidad = entidad;
  }
      public informaciondireccion() {
    }

    public String getCalles() {
        return calles;
    }

    public void setCalles(String calles) {
        this.calles = calles;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }
      
}