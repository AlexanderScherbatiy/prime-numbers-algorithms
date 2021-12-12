package interval.primenumbers.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SieveOfEratosthenesTest {

    @Test
    public void testGetPrimeNumber() {

        assertEquals(2, SieveOfEratosthenes.getPrimeNumber(0, 10));
        assertEquals(3, SieveOfEratosthenes.getPrimeNumber(1, 10));
        assertEquals(5, SieveOfEratosthenes.getPrimeNumber(2, 10));
        assertEquals(7, SieveOfEratosthenes.getPrimeNumber(3, 10));
        assertEquals(11, SieveOfEratosthenes.getPrimeNumber(4, 20));
        assertEquals(13, SieveOfEratosthenes.getPrimeNumber(5, 30));
        assertEquals(17, SieveOfEratosthenes.getPrimeNumber(6, 30));
        assertEquals(19, SieveOfEratosthenes.getPrimeNumber(7, 30));
        assertEquals(23, SieveOfEratosthenes.getPrimeNumber(8, 30));
        assertEquals(29, SieveOfEratosthenes.getPrimeNumber(9, 30));
        assertEquals(31, SieveOfEratosthenes.getPrimeNumber(10, 32));
    }
}
