package Anexo1;

// Clase que representa un cliente en una tienda, con un nombre y un arreglo de productos en el carro de compra.
public class Cliente {
    private String nombre; // Nombre del cliente
    private int[] carroCompra; // Arreglo de productos en el carro de compra

    // Constructor por defecto
    public Cliente() {
    }

    // Constructor que inicializa el nombre y el carro de compra del cliente.
    public Cliente(String nombre, int[] carroCompra) {
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }

    // Métodos para obtener y establecer el nombre del cliente
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos para obtener y establecer el carro de compra del cliente
    public int[] getCarroCompra() {
        return carroCompra;
    }

    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }
}
