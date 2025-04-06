package practica_interfaces;

public class Practica_Interfaces {


    public static void main(String[] args) {
        Terrestre camioneta = new Terrestre(50, 120, 4, "civil");
        Acuatico motoAcuatica = new Acuatico(50, 110, "superficie", 2);

        System.out.println("Camioneta");
        camioneta.imprimir();
        camioneta.acelerar(30);
        camioneta.frenar(10);
        camioneta.imprimir();
        System.out.println("Revoluciones del motor: " + camioneta.calcularRevolucionesMotor(100, 5));

        System.out.println("Moto Acuática");
        motoAcuatica.imprimir();
        motoAcuatica.recomendarVelocidad(90);
        motoAcuatica.acelerar(20);
        motoAcuatica.frenar(15);
        motoAcuatica.imprimir();
    }
}
