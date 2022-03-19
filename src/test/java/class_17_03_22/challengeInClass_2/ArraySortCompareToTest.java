package class_17_03_22.challengeInClass_2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArraySortCompareToTest {

    ArraySortCompareTo arraySortCompareTo = new ArraySortCompareTo();

    Item[] items = new Item[]{
            new Item(9,"item 1",70),
            new Item(6,"item 2",10),
            new Item(3,"item 3",30)
    };

    Item[] itemsExpected = new Item[]{
            new Item(6,"item 2",10),
            new Item(3,"item 3",30),
            new Item(9,"item 1",70)
    };

    @Test
    public void orderingArray(){
        assertTrue(Arrays.toString(arraySortCompareTo.ordering(items)).equals(Arrays.toString(itemsExpected)));
    }

}
