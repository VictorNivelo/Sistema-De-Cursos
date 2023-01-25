/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import controlador.utiles.Utilidades;
import modelo.Cuenta;
import modelo.enums.TipoIdentificacion;

/**
 *
 * @author DEEPIN
 */
public class CuentaDao extends AdaptadorDao<Cuenta> {

    private Cuenta cuenta;
    private String clave = "UNL2023";

    public CuentaDao() {
        super(Cuenta.class);
    }

    public Cuenta getCuenta() {
        if (cuenta == null) {
            cuenta = new Cuenta();
        }
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public boolean guardar() throws Exception {
        this.cuenta.setId(generarId());
        this.cuenta.setContrasenia(Utilidades.encriptarClave(this.cuenta.getContrasenia(), clave));
        guardar(this.cuenta);
        return true;
    }

    public boolean modificar(Integer pos) throws Exception {
        modificar(this.cuenta, pos);
        return true;
    }

    private Integer generarId() {
        return listar().getSize() + 1;
    }

    public void crearCuenta() {
        if (listar().getSize() == 0){
            try {
                PersonaDao pd = new PersonaDao();
                pd.getPersona().setApellidos("Administrador");
                pd.getPersona().setNombres("Administrador");
                pd.getPersona().setCorreo("admin@unl.edu.ec.com");
                pd.getPersona().setIdentificacion("1104311811");
                pd.getPersona().setTipoIdentificacion(TipoIdentificacion.CEDULA);
                pd.guardar();
                this.getCuenta().setUsuario(pd.getPersona().getCorreo());
                this.getCuenta().setEstado(Boolean.TRUE);
                this.getCuenta().setContrasenia("admin1234");
                this.guardar();
                pd.setPersona(null);
                this.setCuenta(null);
                pd.getPersona().setApellidos("Cueva");
                pd.getPersona().setNombres("Carlos");
                pd.getPersona().setCorreo("carlos@unl.edu.ec.com");
                pd.getPersona().setIdentificacion("1129580997");
                pd.getPersona().setDireccion("Jipiro");
                pd.getPersona().setTipoIdentificacion(TipoIdentificacion.CEDULA);
                pd.guardar();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
