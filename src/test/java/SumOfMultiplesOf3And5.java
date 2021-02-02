import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfMultiplesOf3And5 {


    private int closesMultipleOfN(int number, int multiple) {
        return number - (number % multiple);
    }

    private int calculateSumOfMultiplesOfN(int number, int multiple) {
        int numLoops = (((number / multiple) + 1) / 2);
        int sum = number * numLoops;
        if (numLoops % 2 == 1) {
            sum += (number - (numLoops*multiple));
        }
        return sum;
    }


    private int sumNumbersMultipleOf3And5Below(int number) {
        int sum = calculateSumOfMultiplesOfN(closesMultipleOfN(number, 3), 3);
        sum += calculateSumOfMultiplesOfN(closesMultipleOfN(number, 5), 5);

        return sum;
    }


    @Test
    public void Zero() {
        assertEquals(sumNumbersMultipleOf3And5Below(0), 0);
    }

    @Test
    public void One() {
        assertEquals(sumNumbersMultipleOf3And5Below(1), 0);
    }

    @Test
    public void Three() {
        assertEquals(sumNumbersMultipleOf3And5Below(3), 3);
    }

    @Test
    public void Four() {
        assertEquals(sumNumbersMultipleOf3And5Below(4), 3);
    }

    @Test
    public void Five() {
        assertEquals(sumNumbersMultipleOf3And5Below(5), 8);
    }

    @Test
    public void Six() {
        assertEquals(sumNumbersMultipleOf3And5Below(6), 14);
    }

    @Test
    public void Nine() {
        assertEquals(sumNumbersMultipleOf3And5Below(9), 23);
    }


}
