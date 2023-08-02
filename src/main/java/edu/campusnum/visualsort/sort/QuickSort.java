package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class QuickSort implements SortAlgorithm{
    @Override
    public void sort(ObservableArray array) {
        int firstIndex = array.get(0);
        int lastIndex = array.get(array.getLength() -1);
        quickSort(array, firstIndex, lastIndex);

    }

    public void quickSort(ObservableArray array, int first, int last){
        int size = array.getLength();
        if(size > 2){
            int pi = partition(array, first, last);
            quickSort(array, first, pi -1);
            quickSort(array, pi+1, last);
        }
    }

    public int partition(ObservableArray array, int first, int last){
       int pivot = last;
       int j = first;

       for (int i = first; i < last; i++){
           if (array.get(i) <= array.get(pivot)){
               array.swap(i, j);
               j = j + 1;
           }
       }
       array.swap(last, j);
       return  j;
    }
}

