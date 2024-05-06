package Anexo1;

public class MainRunnable implements Runnable{
    private Cliente cliente; // Cliente que se está atendiendo
    private Cajera cajera; // Cajera que atiende al cliente
    private long initialTime; // Tiempo inicial de referencia
    
    // Constructor que inicializa los atributos de la clase.
    public MainRunnable (Cliente cliente, Cajera cajera, long initialTime){
        this.cajera = cajera;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    // Método principal que inicia la simulación de la atención de clientes por parte de las cajeras.
    public static void main(String[] args) {
        // Creación de clientes y cajeras
        Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });
        Cajera cajera1 = new Cajera("Cajera 1");
        Cajera cajera2 = new Cajera("Cajera 2");
        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
        // Creación de procesos para cada cliente y cajera, y ejecución en hilos separados
        Runnable proceso1 = new MainRunnable(cliente1, cajera1, initialTime);
        Runnable proceso2 = new MainRunnable(cliente2, cajera2, initialTime);
        new Thread(proceso1).start();
        new Thread(proceso2).start();
    }
    
    // Método que se ejecuta cuando se inicia el hilo. En este método se llama al método procesarCompra de la cajera para procesar la compra del cliente.
    @Override
    public void run() {
        this.cajera.procesarCompra(this.cliente, this.initialTime);
    }
}