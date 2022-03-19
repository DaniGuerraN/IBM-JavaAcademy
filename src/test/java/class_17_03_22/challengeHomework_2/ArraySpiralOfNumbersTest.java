package class_17_03_22.challengeHomework_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySpiralOfNumbersTest {

    ArraySpiralOfNumbers arraySpiralOfNumbers = new ArraySpiralOfNumbers();

    int[][] expected = {
            {1,2,3,4,5},
            {16,17,18,19,6},
            {15,24,25,20,7},
            {14,23,22,21,8},
            {13,12,11,10,9}
    };

    @Test
    public void spiralOfNumbers(){
        Assertions.assertArrayEquals(expected,arraySpiralOfNumbers.spiralArray(5));
    }

}
