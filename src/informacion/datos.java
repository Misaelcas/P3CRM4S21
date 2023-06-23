/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package informacion;
import Informacion.Informacionnombre;


/**
 *
 * @author ACER
 * 
 */
public class datos {
    Informacionnombre nombres;
    String Fechadenacimiento;
    String correo;
    String rfc;
    informaciondireccion direccion;
    

    public datos(Informacionnombre nombres, String Fechadenacimiento, String correo, String rfc, informaciondireccion direccion) {
        this.nombres = nombres;
        this.Fechadenacimiento = Fechadenacimiento;
        this.correo = correo;
        this.rfc = rfc;
        this.direccion = direccion;
      
     
    }
    
    public datos() {
    }

   public Informacionnombre getNombres() {
        return nombres;
        
    }

    public void setNombres(Informacionnombre nombres) {
        this.nombres = nombres;
    }

    

    public String getFechadenacimiento() {
        return Fechadenacimiento;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.Fechadenacimiento = fechadenacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public informaciondireccion getDireccion() {
        return direccion;
    }

    public void setDireccion(informaciondireccion direccion) {
        this.direccion = direccion;
    }

  
 
    
}
