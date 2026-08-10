package dto;

import java.util.Date;


public class Pet {

    private int numero;
    private String nombre;
    private String especie;
    private Date nacimiento;
    private String duenno;
    private Date fechaAlta;
    private String sexo;
    private String observacion;

    public Pet(String nombre, String especie, Date nacimiento, String duenno, String sexo, String observacion) {
        this.nombre = nombre;
        this.especie = especie;
        this.nacimiento = nacimiento;
        this.duenno = duenno;
        this.fechaAlta = new Date();
        this.sexo = sexo;
        this.observacion = observacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDuenno() {
        return duenno;
    }

    public void setDuenno(String duenno) {
        this.duenno = duenno;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String provincia) {
        this.sexo = sexo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String[] toArrayStrings() {
        return new String[]{String.valueOf(numero), nombre, especie, nacimiento.toString(), duenno, fechaAlta.toString(), sexo, observacion};
    }
}
