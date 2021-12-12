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

    public static void producePrimeNumbers(PrimeNumbersConsumer consumer, int arraySize) {

        boolean[] mark = new boolean[arraySize];
        int currentPrime = 2;
        mark[2] = true;

        while (true) {

            consumer.accept(currentPrime);

            if (consumer.isFinished()) {
                return;
            }

            int i = currentPrime + currentPrime;

            while (i < arraySize) {
                mark[i] = true;
                i += currentPrime;
            }

            i = currentPrime;

            while (mark[++i]) ;

            currentPrime = i;
        }
    }
}
