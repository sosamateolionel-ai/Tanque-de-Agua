public class TanqueAgua {

    private double capacidadMaximaLitros;
    private double nivelActualLitros;

    public TanqueAgua(double capacidadMaximaLitros, double nivelActualLitros) {

        if (capacidadMaximaLitros <= 0) {
            throw new IllegalArgumentException(
                    "La capacidad máxima debe ser mayor que cero"
            );
        }

        if (nivelActualLitros < 0) {
            throw new IllegalArgumentException(
                    "El nivel actual no puede ser negativo"
            );
        }

        if (nivelActualLitros > capacidadMaximaLitros) {
            throw new IllegalArgumentException(
                    "El nivel actual no puede superar la capacidad máxima"
            );
        }

        this.capacidadMaximaLitros = capacidadMaximaLitros;
        this.nivelActualLitros = nivelActualLitros;
    }

    public void llenar(double litros) {

        if (litros <= 0) {
            throw new IllegalArgumentException(
                    "La cantidad a llenar debe ser mayor que cero"
            );
        }

        nivelActualLitros += litros;

        if (nivelActualLitros > capacidadMaximaLitros) {
            nivelActualLitros = capacidadMaximaLitros;
        }
    }

    public void consumir(double litros) {

        if (litros <= 0) {
            throw new IllegalArgumentException(
                    "La cantidad a consumir debe ser mayor que cero"
            );
        }

        if (litros > nivelActualLitros) {
            throw new IllegalArgumentException(
                    "No hay suficiente agua en el tanque"
            );
        }

        nivelActualLitros -= litros;
    }

    public double calcularPorcentajeLlenado() {
        return (nivelActualLitros / capacidadMaximaLitros) * 100;
    }

    public void mostrarEstado() {
        System.out.println("Capacidad máxima: " + capacidadMaximaLitros + " litros");
        System.out.println("Nivel actual: " + nivelActualLitros + " litros");
        System.out.printf("Porcentaje de llenado: %.2f%%%n",
                calcularPorcentajeLlenado());
    }

    public static void main(String[] args) {

        TanqueAgua tanque = new TanqueAgua(1000, 400);

        System.out.println("Estado inicial:");
        tanque.mostrarEstado();

        tanque.llenar(300);

        System.out.println("\nDespués de llenar 300 litros:");
        tanque.mostrarEstado();

        tanque.consumir(250);

        System.out.println("\nDespués de consumir 250 litros:");
        tanque.mostrarEstado();

        tanque.llenar(700);

        System.out.println("\nDespués de intentar llenar 700 litros:");
        tanque.mostrarEstado();
    }
}