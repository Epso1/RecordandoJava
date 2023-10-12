public class Main {
    public static void main(String[] args) {
        long[] numeros = new long[100];
        numeros = Utilidades.rellenarConAleatorios(numeros);
        long startTime = System.nanoTime();
        for (Long l: numeros) {
            System.out.print("Numero: " + l.toString() + " "); //+ " - Es primo?: " + Utilidades.naive(l));
            System.out.println("Es primo: " + Utilidades.naive(l));
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Nanosegundos: " + duration);
        long durationMilis = duration/ 1000000;
        System.out.println("Milisegundos: " + durationMilis);
        double durationSeconds = (double) duration / 1_000_000_000;
        System.out.println("Segundos: " + durationSeconds);
    }
}
