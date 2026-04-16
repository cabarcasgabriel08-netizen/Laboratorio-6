package Modelo;

public class Camion extends Vehiculo {

    protected double capacidadMaximaCargaToneladas;

    public Camion(String placa, String marca, double velocidad, double carga) {
        super(placa, marca, velocidad);
        this.capacidadMaximaCargaToneladas = carga;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Carga: " + capacidadMaximaCargaToneladas + " toneladas";
    }
}
