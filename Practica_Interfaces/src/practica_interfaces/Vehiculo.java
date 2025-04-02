package practica_interfaces;

public abstract class Vehiculo {

    protected int velocidadActual;
    protected int velocidadMaxima;

    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void imprimir() {
        System.out.println("Velocidad actual: " + velocidadActual);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }

    public void acelerar(int velocidad) {
        velocidadActual += velocidad;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    public void frenar(int velocidad) {
        velocidadActual -= velocidad;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }
}
