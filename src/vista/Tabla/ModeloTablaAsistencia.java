/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.Tabla;

import controlador.listas.ListaEnlazada;
import javax.swing.table.AbstractTableModel;
import modelo.Cursa;

/**
 *
 * @author DEEPIN
 */
public class ModeloTablaAsistencia extends AbstractTableModel {

    private ListaEnlazada<Cursa> lista = new ListaEnlazada<>();

    public ListaEnlazada<Cursa> getLista() {
        return lista;
    }

    public void setLista(ListaEnlazada<Cursa> lista) {
        this.lista = lista;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public int getRowCount() {
        return lista.getSize();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nro";
            case 1:
                return "Usuario";
            case 2:
                return "Nombre";
            case 3:
                return "Ciclo";
            case 4:
                return "estado";
            case 5:
                return "Asignatura";
            case 6:
                return "HorasAsistidas";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cursa ast = null;
        try {
            ast = lista.obtener(rowIndex);
        } catch (Exception e) {
        }
        switch (columnIndex) {
            case 0:
                return (rowIndex + 1);
            case 1:
                return (ast != null) ? ast.getHorasAsistidas().toString() : "NO DEFINIDO";
            case 2:
                return (ast != null) ? (ast.getMatricula()+ " " + ast.getAsignatura()) : "NO DEFINIDO";
            case 3:
                return (ast != null) ? ast.getNotaFinal(): "NO DEFINIDO";
            case 4:
                return (ast != null) ? ast.getPorcentajeHorasAsistidas(): "NO DEFINIDO";
            case 5:
                return (ast != null) ? ast.getAsignatura(): "NO DEFINIDO";
            case 6:
                return (ast != null) ? ast.getHorasAsistidas(): "NO DEFINIDO";
           
            default:
            
                return null;
        }
    }

}
