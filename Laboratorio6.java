package Modelo;

public class app {
    public static void main(String[] args) {

        Carro carro = new Carro("ABC123", "Toyota", 180, 4);
        Moto moto = new Moto("XYZ789", "Yamaha", 120, "Deportiva");
        Camion camion = new Camion("LMN456", "Volvo", 100, 10.5);

        System.out.println(carro);
        System.out.println(moto);
        System.out.println(camion);
    }
}
