package class_17_03_22.challengeInClass_1;

import class_17_03_22.challengeInClass_2.ArraySortCompareTo;
import class_17_03_22.challengeInClass_2.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArraySortManualTest {

    ArraySortManual arraySortManual = new ArraySortManual();

    int[] numbers = new int[]{9,8,7,6,5,4,3,2,1};
    int[] numbersExpected = new int[]{1,2,3,4,5,6,7,8,9};


    @Test
    public void automaticSort(){
        assertArrayEquals(numbersExpected,arraySortManual.automaticSort(numbers));
    }

    @Test
    public void manualSort(){
        assertArrayEquals(numbersExpected,arraySortManual.sort(numbers));
    }
}
