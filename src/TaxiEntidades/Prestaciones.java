/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaxiEntidades;

/**
 *
 * @author EQUIPO
 */
public class Prestaciones {
    
    private String nombreEmpresa;
    private int cuitEmpresa;
    private String correoelectronico;
    private int telefono;

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getCuitEmpresa() {
        return cuitEmpresa;
    }

    public void setCuitEmpresa(int cuitEmpresa) {
        this.cuitEmpresa = cuitEmpresa;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Prestaciones() {
    }

    public Prestaciones(String nombreEmpresa, int cuitEmpresa, String correoelectronico, int telefono) {
        this.nombreEmpresa = nombreEmpresa;
        this.cuitEmpresa = cuitEmpresa;
        this.correoelectronico = correoelectronico;
        this.telefono = telefono;
    }
    
    
    
    
    
    
    
    
}
