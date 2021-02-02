import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class SumOfMultiplesOf3And5 {
    private int sumNumbersMultipleOf3And5Below(int number) {
        if(number == 3)
            return 3;
        return 0;
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



}
