import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfMultiplesOf3And5 {


    private int closesMultipleOfN(int number, int multiple) {
        return number - (number % multiple);
    }

    private int calculateSumOfMultiplesOfN(int number, int multiple) {
        int numMultiplesThatSumNumber = (((number / multiple) + 1) / 2);
        int sum = number * numMultiplesThatSumNumber;
        int multipleInTheMiddle = numMultiplesThatSumNumber * multiple;
        if (number/2 == multipleInTheMiddle) {
            sum += (number - multipleInTheMiddle);
        }
        return sum;
    }


    private int sumNumbersMultipleOf3And5Below(int number) {
        int sum = calculateSumOfMultiplesOfN(closesMultipleOfN(number-1, 3), 3);
        sum += calculateSumOfMultiplesOfN(closesMultipleOfN(number-1, 5), 5);
        return sum - calculateSumOfMultiplesOfN(closesMultipleOfN(number-1, 15), 15);
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
        assertEquals(sumNumbersMultipleOf3And5Below(3), 0);
    }

    @Test
    public void Four() {
        assertEquals(sumNumbersMultipleOf3And5Below(4), 3);
    }

    @Test
    public void Five() {
        assertEquals(sumNumbersMultipleOf3And5Below(5), 3);
    }

    @Test
    public void Six() {
        assertEquals(sumNumbersMultipleOf3And5Below(6), 8);
    }

    @Test
    public void Nine() {
        assertEquals(sumNumbersMultipleOf3And5Below(9), 14);
    }

    @Test
    public void Ten() {
        assertEquals(sumNumbersMultipleOf3And5Below(10), 23);
    }

    @Test
    public void Twelve() {
        assertEquals(sumNumbersMultipleOf3And5Below(12), 33);
    }

    @Test
    public void Fifteen() {
        assertEquals(sumNumbersMultipleOf3And5Below(15), 45);
    }

    @Test
    public void Eighteen() {
        assertEquals(sumNumbersMultipleOf3And5Below(18), 60);
    }

}
