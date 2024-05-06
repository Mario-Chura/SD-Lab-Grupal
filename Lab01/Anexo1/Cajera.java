package Anexo1;
public class Cajera {
    private String nombre;// Nombre de la cajera

    // Constructor por defecto
    public Cajera() {

    }

    // Constructor que inicializa el nombre de la cajera.
    public Cajera(String nombre) {

        this.nombre = nombre;
    }

    // Método para obtener el nombre de la cajera.
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre de la cajera.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método que simula el proceso de compra de un cliente por parte de la cajera.
    public void procesarCompra(Cliente cliente, long timeStamp) {
        // Se imprime un mensaje indicando el inicio del proceso de compra del cliente.
        System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre() +
        " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
        // Se procesa cada producto en el carro de compra del cliente.
        for (int i = 0; i < cliente.getCarroCompra().length; i++) {
            // Se simula el procesamiento del producto.
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            // Se imprime un mensaje indicando el procesamiento del producto.
            System.out.println("Procesado el producto " + (i + 1) + " ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
        }
        // Se imprime un mensaje indicando la finalización del proceso de compra del cliente.
        System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " +
        cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
    
    }
    // Método privado que simula la espera de cierta cantidad de segundos.
    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
