package interval.primenumbers.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SieveOfEratosthenesTest {

    private static final int[] PRIME_NUMBERS = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};

    @Test
    public void testGetPrimeNumber() {

        assertEquals(2, SieveOfEratosthenes.getPrimeNumber(0, 3));
        assertEquals(2, SieveOfEratosthenes.getPrimeNumber(0, 4));
        assertEquals(2, SieveOfEratosthenes.getPrimeNumber(0, 10));

        assertEquals(3, SieveOfEratosthenes.getPrimeNumber(1, 4));
        assertEquals(3, SieveOfEratosthenes.getPrimeNumber(1, 5));
        assertEquals(3, SieveOfEratosthenes.getPrimeNumber(1, 10));

        assertEquals(5, SieveOfEratosthenes.getPrimeNumber(2, 6));
        assertEquals(5, SieveOfEratosthenes.getPrimeNumber(2, 7));
        assertEquals(5, SieveOfEratosthenes.getPrimeNumber(2, 10));

        assertEquals(7, SieveOfEratosthenes.getPrimeNumber(3, 10));
        assertEquals(11, SieveOfEratosthenes.getPrimeNumber(4, 20));
        assertEquals(13, SieveOfEratosthenes.getPrimeNumber(5, 30));
        assertEquals(17, SieveOfEratosthenes.getPrimeNumber(6, 30));
        assertEquals(19, SieveOfEratosthenes.getPrimeNumber(7, 30));
        assertEquals(23, SieveOfEratosthenes.getPrimeNumber(8, 30));
        assertEquals(29, SieveOfEratosthenes.getPrimeNumber(9, 30));
        assertEquals(31, SieveOfEratosthenes.getPrimeNumber(10, 32));

        for (int index = 0; index < PRIME_NUMBERS.length; index++) {
            assertEquals(PRIME_NUMBERS[index], SieveOfEratosthenes.getPrimeNumber(index, 100));
        }
    }

    @Test
    public void testProducePrimeNumbers() {

        PrimeNumbersConsumer consumer = new PrimeNumbersConsumer() {

            int index = 0;

            @Override
            public void accept(int primeNumber) {
                assertEquals(PRIME_NUMBERS[index++], primeNumber);
            }

            @Override
            public boolean isFinished() {
                return index == PRIME_NUMBERS.length;
            }
        };

        SieveOfEratosthenes.producePrimeNumbers(consumer, 50);
    }
}
