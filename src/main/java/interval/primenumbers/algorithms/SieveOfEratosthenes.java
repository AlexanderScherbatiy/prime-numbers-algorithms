package interval.primenumbers.algorithms;

public class SieveOfEratosthenes {

    public static int getPrimeNumber(int index, int arraySize) {

        boolean[] mark = new boolean[arraySize];

        int currentIndex = 0;
        int currentPrime = 2;

        mark[2] = true;

        while (currentIndex < index) {
            int i = currentPrime + currentPrime;
            while (i < arraySize) {
                mark[i] = true;
                i += currentPrime;
            }
            i = currentPrime;
            while (mark[++i]) ;
            currentPrime = i;
            currentIndex++;
        }

        return currentPrime;
    }
}
