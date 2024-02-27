package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchEngineTest {
    @Test
    public void SearchTest1() {
        BinarySearchEngine engine = new BinarySearchEngine();
        int[] array = {1,3,5,7,9};
        assertEquals(2, engine.binarySearch(array, 5));
    }

}