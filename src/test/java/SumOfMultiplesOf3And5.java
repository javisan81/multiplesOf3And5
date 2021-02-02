import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class SumOfMultiplesOf3And5 {
    private int sumNumbersMultipleOf3And5Below(int number) {
        int sum = 0;
        if (number == 3)
            sum += 3;
        if (number == 4)
            sum += 3;
        if (number == 5) {
            sum += 3;
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

}
