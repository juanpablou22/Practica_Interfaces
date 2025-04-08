package practica_interfaces;

public class Practica_Interfaces {

    public static void main(String[] args) {
        Terrestre camioneta = new Terrestre(50, 120, 4, "Civil");
        Acuatico motoAcuatica = new Acuatico(50, 110, "Superficie", 2);

        System.out.println("Camioneta:");
        camioneta.imprimir();
        System.out.println("Revoluciones del motor: " + camioneta.calcularRevolucionesMotor(10, 5));

        camioneta.acelerar(30);
        camioneta.frenar(50);
        System.out.println("Camioneta después de acelerar y frenar:");
        camioneta.imprimir();
        System.out.println();

        System.out.println("Moto Acuática:");
        motoAcuatica.imprimir();
        System.out.println("Velocidad recomendada con viento 90 km/h: " + motoAcuatica.recomendarVelocidad(90));

        motoAcuatica.acelerar(40);
        motoAcuatica.frenar(100);
        System.out.println("Moto acuática después de acelerar y frenar:");
        motoAcuatica.imprimir();
    }
}
