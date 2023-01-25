/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.listas.ListaEnlazada;

/**
 *
 * @author SONY VAIO
 */
public class Docente extends Persona {
    
    private Integer idDocente;
    private Persona persona;
    
    private String NivelEducacion;
    private Integer aniosExpDocente;
    private Integer aniosExpLaboral;

    public Integer getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getNivelEducacion() {
        return NivelEducacion;
    }

    public void setNivelEducacion(String NivelEducacion) {
        this.NivelEducacion = NivelEducacion;
    }

    public Integer getAniosExpDocente() {
        return aniosExpDocente;
    }

    public void setAniosExpDocente(Integer aniosExpDocente) {
        this.aniosExpDocente = aniosExpDocente;
    }

    public Integer getAniosExpLaboral() {
        return aniosExpLaboral;
    }

    public void setAniosExpLaboral(Integer aniosExpLaboral) {
        this.aniosExpLaboral = aniosExpLaboral;
    }
    
}
