package com.solid;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SortingAlgorithm> sorts = Arrays.asList(new InsertionSort(), new MergeSort(), new SelectionSort());

        for(SortingAlgorithm alg : sorts){
            SorterProcessor.process(alg);
        }
    }
}