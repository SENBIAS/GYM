/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author sebastian
 */
public class Usuario extends Persona{
    
    private Date fechaIngreso = new Date();
    private String celular;
    private String correoElectronico;
    private String observaciones;
    private String nivelActividadFisicaSemanal;
    private float perimetroBrazoContraido;
    private float perimetroBrazoRelajado;
    private float perimetroMuslo;
    private float perimetroAbdomen;

    public Usuario(String celular, String correoElectronico, 
            String observaciones, String nivelActividadFisicaSemanal, 
            float perimetroBrazoContraido, float perimetroBrazoRelajado, 
            float perimetroMuslo, float perimetroAbdomen, String nombre, 
            String primerApellido, String segundoApellido, String documentoIdentificacion, 
            String genero, int edad, float talla, float peso) {
        
        super(nombre, primerApellido, segundoApellido, documentoIdentificacion, genero, edad, talla, peso);
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.observaciones = observaciones;
        this.nivelActividadFisicaSemanal = nivelActividadFisicaSemanal;
        this.perimetroBrazoContraido = perimetroBrazoContraido;
        this.perimetroBrazoRelajado = perimetroBrazoRelajado;
        this.perimetroMuslo = perimetroMuslo;
        this.perimetroAbdomen = perimetroAbdomen;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNivelActividadFisicaSemanal() {
        return nivelActividadFisicaSemanal;
    }

    public void setNivelActividadFisicaSemanal(String nivelActividadFisicaSemanal) {
        this.nivelActividadFisicaSemanal = nivelActividadFisicaSemanal;
    }

    public float getPerimetroBrazoContraido() {
        return perimetroBrazoContraido;
    }

    public void setPerimetroBrazoContraido(float perimetroBrazoContraido) {
        this.perimetroBrazoContraido = perimetroBrazoContraido;
    }

    public float getPerimetroBrazoRelajado() {
        return perimetroBrazoRelajado;
    }

    public void setPerimetroBrazoRelajado(float perimetroBrazoRelajado) {
        this.perimetroBrazoRelajado = perimetroBrazoRelajado;
    }

    public float getPerimetroMuslo() {
        return perimetroMuslo;
    }

    public void setPerimetroMuslo(float perimetroMuslo) {
        this.perimetroMuslo = perimetroMuslo;
    }

    public float getPerimetroAbdomen() {
        return perimetroAbdomen;
    }

    public void setPerimetroAbdomen(float perimetroAbdomen) {
        this.perimetroAbdomen = perimetroAbdomen;
    }
    
    
    
}
