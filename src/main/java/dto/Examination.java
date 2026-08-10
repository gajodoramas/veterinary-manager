package dto;

import java.util.Date;


public class Examination {

    private int numero;
    private String mascota;
    private Date fecha;
    private int precio;

    public Examination(int numero, String mascota, Date fecha, int precio) {
        this.numero = numero;
        this.mascota = mascota;
        this.fecha = fecha;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String[] toArrayStrings() {
        return new String[]{String.valueOf(numero), mascota, fecha.toString(), String.valueOf(precio)};
    }
}
