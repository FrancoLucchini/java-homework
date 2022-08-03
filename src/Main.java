public class Main {
    public static void main(String[] args) {
        var resultado = suma(3, 3, 10);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        miCoche.sumarPuertas();
        miCoche.sumarPuertas();

        System.out.println("Puertas del coche = " + miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 0;
    public void sumarPuertas() {
        this.puertas++;
    }
}