package class_17_03_22.challengeHomework_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayOfOneAndZeroTest {

    ArrayOfOneAndZero arrayOfOneAndZero = new ArrayOfOneAndZero();

    int[][] expected = {
            {1,1,1,1,1},
            {0,1,0,1,0},
            {0,0,1,0,0},
            {0,1,0,1,0},
            {1,1,1,1,1}
    };

    @Test
    public void oneAndZero(){
        Assertions.assertArrayEquals(expected,arrayOfOneAndZero.oneAndZero(5));
    }

}
