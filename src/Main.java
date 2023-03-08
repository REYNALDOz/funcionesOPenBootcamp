public class Main {
    public static void main(String[] args) {
        //Objetos
        Suma suma = new Suma();
        Coche miCoche = new Coche();

        //Llamada a métodos
        int resultadoSuma = suma.sumar(1, 2, 3);
        int resultadoNumeroPuertas = miCoche.plassDoor(2);

        //Impresiones
        System.out.println("La suma de los tres numeros es:" + resultadoSuma);
        System.out.println("El numero de puertas es:" + resultadoNumeroPuertas);
        System.out.println("ADIOS ME GUSTO PROGRAMAR");
    }

}