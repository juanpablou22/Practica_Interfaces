package practica_interfaces;

public class Terrestre extends Vehiculo implements Motor {

    private int cantidadLlantas;
    private String uso; 

    public Terrestre(int velocidadActual, int velocidadMaxima, int cantidadLlantas, String uso) {
        super(velocidadActual, velocidadMaxima);
        this.cantidadLlantas = cantidadLlantas;
        this.uso = uso;
    }

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }
}
