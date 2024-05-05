package Anexo1;

// Clase principal que contiene el método main para ejecutar la simulación de la atención de clientes por parte de cajeras.
public class MainThread {
    public static void main(String[] args) {
        // Creación de clientes con sus respectivos carros de compra
        Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });
        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
        // Creación de cajeras y asignación de clientes
        CajeraThread cajera1 = new CajeraThread("Cajera 1", cliente1, initialTime);
        CajeraThread cajera2 = new CajeraThread("Cajera 2", cliente2, initialTime);
        // Inicio de los hilos de las cajeras
        cajera1.start();
        cajera2.start();
    }
}
