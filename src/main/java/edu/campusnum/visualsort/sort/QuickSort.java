package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

import java.util.Arrays;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class QuickSort implements SortAlgorithm{
    @Override
    public void sort(ObservableArray array) {

        int size = array.getLength();
        quickSort();

    }

    public void quickSort(){
        if(size < 2) return;
    }
}
