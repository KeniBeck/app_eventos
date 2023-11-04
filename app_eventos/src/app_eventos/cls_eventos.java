/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_eventos;

/**
 *
 * @author deyler
 */
public class cls_eventos {
    private String str_nombre;
    private String str_fecha;
    private String str_hora;
    private String str_ubicacion;

    public cls_eventos(String nombre, String fecha, String hora, String ubicacion) {
        this.str_nombre = nombre;
        this.str_fecha = fecha;
        this.str_hora = hora;
        this.str_ubicacion = ubicacion;
    }

    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public String getStr_fecha() {
        return str_fecha;
    }

    public void setStr_fecha(String str_fecha) {
        this.str_fecha = str_fecha;
    }

    public String getStr_hora() {
        return str_hora;
    }

    public void setStr_hora(String str_hora) {
        this.str_hora = str_hora;
    }

    public String getStr_ubicacion() {
        return str_ubicacion;
    }

    public void setStr_ubicacion(String str_ubicacion) {
        this.str_ubicacion = str_ubicacion;
    }
    
    
}
