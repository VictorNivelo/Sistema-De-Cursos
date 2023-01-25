/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.listas.ListaEnlazada;
import modelo.enums.Estado;

/**
 *
 * @author SONY VAIO
 */
public class Asignatura {
    
    private Integer idAsignatura;
    
    private String nombreAsignatura;
    private Character paralelo;
    
    private Integer unidad;
    
    private Alumno alumno;
    private Docente docente;
    
    private Cursa cursa;
    private Integer NumeroHoras;
    private Integer HorasAsistidas;
    
    private boolean estadoAsignatura;

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public Character getParalelo() {
        return paralelo;
    }

    public void setParalelo(Character paralelo) {
        this.paralelo = paralelo;
    }

    public Integer getUnidad() {
        return unidad;
    }

    public void setUnidad(Integer unidad) {
        this.unidad = unidad;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Cursa getCursa() {
        return cursa;
    }

    public void setCursa(Cursa cursa) {
        this.cursa = cursa;
    }

    public Integer getNumeroHoras() {
        return NumeroHoras;
    }

    public void setNumeroHoras(Integer NumeroHoras) {
        this.NumeroHoras = NumeroHoras;
    }

    public Integer getHorasAsistidas() {
        return HorasAsistidas;
    }

    public void setHorasAsistidas(Integer HorasAsistidas) {
        this.HorasAsistidas = HorasAsistidas;
    }

    public boolean isEstadoAsignatura() {
        return estadoAsignatura;
    }

    public void setEstadoAsignatura(boolean estadoAsignatura) {
        this.estadoAsignatura = estadoAsignatura;
    }
    
    
}
