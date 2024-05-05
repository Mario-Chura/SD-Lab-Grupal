package Anexo1;

// Clase que representa a una cajera en una tienda, que atiende a un cliente y procesa su compra.
public class CajeraThread extends Thread {
    private String nombre; // Nombre de la cajera
    private Cliente cliente; // Cliente que está siendo atendido
    private long initialTime; // Tiempo inicial de referencia

    // Constructor por defecto
    public CajeraThread() {
    }

    // Constructor que inicializa el nombre de la cajera, el cliente que atiende y el tiempo inicial de referencia.
    public CajeraThread(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    // Métodos para obtener y establecer el nombre de la cajera
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos para obtener y establecer el tiempo inicial de referencia
    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

    // Métodos para obtener y establecer el cliente que está siendo atendido
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Método que se ejecuta cuando se inicia el hilo de la cajera
    @Override
    public void run() {
        // Se imprime un mensaje indicando que la cajera comienza a procesar la compra del cliente
        System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                + this.cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        
        // Se procesa cada producto en el carro de compra del cliente
        for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]); // Se simula el procesamiento de un producto
            System.out.println("Procesado el producto " + (i + 1)
                    + " del cliente " + this.cliente.getNombre() + "->Tiempo: "
                    + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        }
        
        // Se imprime un mensaje indicando que la cajera ha terminado de procesar la compra del cliente
        System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR "
                + this.cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        
    }

    // Método privado que simula la espera de cierta cantidad de segundos
    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
