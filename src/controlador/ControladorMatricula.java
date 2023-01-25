/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.listas.ListaEnlazada;
import modelo.Cursa;
import modelo.Matricula;


/**
 *
 * @author David Campoverde
 */
public class ControladorMatricula {
    
//    private Matricula matricula;
    
    private ListaEnlazada<Matricula> matricula;
    
    public ControladorMatricula(){
        matricula = new ListaEnlazada<>();
    }
    
    public ListaEnlazada<Matricula> getCursa() {
        return matricula;
    }

    public void setCursa(ListaEnlazada<Matricula> matricula) {
        this.matricula = matricula;
    }
    
    public void calcularPromedioGeneral(){
        Float aux = 0f;
        for(int i = 0; i < matricula.getSize(); i++){
            try {
                Matricula matriculaAux = matricula.obtener(i);
            } 
            catch (Exception e) {
//                System.out.println(e.getMessage());
            }
        }
//        matricula.setPromedioGeneral(aux/matricula.getCursa().getSize());
    }
}
