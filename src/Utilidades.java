public class Utilidades {
    /*Creamos en utilidades un método que reciba un array de números enteros (el tipo entero mayor que permita Java)
     y lo rellene con números aleatorios (el 10% más elevado que permita Java). */
    public static long[] rellenarConAleatorios(long[] arrayEnteros){
        final long MIN = 10000000;
        final long MAX = 90000000;

        for (int i = 0; i < arrayEnteros.length ; i++) {
            //Entero entre MIN y MAX:
            long randomLong = (long) (MIN + Math.random() * (MAX - MIN + 1));
            arrayEnteros[i] = randomLong;
        }
        return arrayEnteros;
    }

    /* Creamos en utilidades un método “naive” que devuelva true si el número es primo,
    false si el número no es primo. Para calcularlo lo haremos de manera poco eficiente (a propósito):
    recorremos todos los números enteros menores hasta llegar a 2 para comprobarlo y dividimos por el número . */
    public static boolean naive(long numero){
        boolean esPrimo = true;
        long i = numero-1;
        while(i >= 2 && esPrimo == true ){
            if(numero % i == 0){
                esPrimo = false;
            }
            i--;
        }
        return esPrimo;
    }
}
