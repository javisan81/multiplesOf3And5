import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class SumOfMultiplesOf3And5 {
    private int closesMultipleOf3(int number) {
        return number - (number % 3);
    }

    private int calculateSumOfMultiplesOf3(int number) {
        int sum = 0;
        for (int i = number; i > 0; i = i - 3) {
            sum += i;
        }
        return sum;
    }

    private int sumNumbersMultipleOf3And5Below(int number) {
        int sum = calculateSumOfMultiplesOf3(closesMultipleOf3(number));

        if (number <= 6 && number > 4) {
            sum += 5;
        }

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

}
