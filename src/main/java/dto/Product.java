package dto;


public class Product {

    private int numero;
    private String nombre;
    private String tipoProducto;
    private String tipoAnimal;
    private int precio;

    public Product(String nombre, String tipoProducto, String tipoAnimal, int precio) {
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.tipoAnimal = tipoAnimal;
        this.precio = precio;
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

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String[] toArrayStrings() {
        return new String[]{String.valueOf(numero), nombre, tipoProducto, tipoAnimal, String.valueOf(precio)};
    }
}
