
package practica_interfaces;

public class Acuatico extends Vehiculo implements Vela {

    private String tipo; 
    private int capacidadPasajeros;

    public Acuatico(int velocidadActual, int velocidadMaxima, String tipo, int capacidadPasajeros) {
        super(velocidadActual, velocidadMaxima);
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
    }
    
    @Override
    public int recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            System.out.println("Viento muy fuerte, no se recomienda navegar.");
            velocidadActual = 0;
            return 0;
        } else if (velocidadViento < 10) {
            System.out.println("Viento muy débil, no se recomienda navegar.");
            return 0;
        } else {
            System.out.println("Condiciones adecuadas para navegar.");
            return velocidadActual;
        }
    }
}

