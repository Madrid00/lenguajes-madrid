/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nominas1;

/**
 *
 * @author Cesar
 */
class Trabajador {
    
    private long Seguro;
    private String nombre;
    private String Paterno;

    public long getSeguro() {
        return Seguro;
    }

    public void setSeguro(long Seguro) {
        this.Seguro = Seguro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return Paterno;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }
}
