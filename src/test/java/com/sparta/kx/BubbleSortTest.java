package com.sparta.kx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest {
    @Test
    @DisplayName("Tests to see if a random list will be ordered in ascending order")
    void bubbleSortTest() {
        int[] arr1 = {3,2,1};
        Assertions.assertEquals("[1, 2, 3]", Arrays.toString(BubbleSort.sortArray(arr1)));
    }

    @Test
    @DisplayName("If already sorted, it should return the same array")
    void alreadySortedBubbleSort(){
        int[] arr = {1, 2, 3};
        Assertions.assertEquals(arr, BubbleSort.sortArray(arr));
    }
}
