package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;
import edu.campusnum.visualsort.model.Order;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class MergeSort implements SortAlgorithm{
    @Override

    public void sort(ObservableArray array) {

        int length = array.getLength();

                // slice

            if(length > 1) {
                int left = 0;
                int right = length/2;

                ObservableArray array1 = array.slice(left, right);
                ObservableArray array2 = array.slice(right, length - right);

                this.sort(array1);
                this.sort(array2);

                //merge

                while (right - left > 0 && length - right > 0){
                    if (array.compare(right, left).equals(Order.Lower) ){
                        for (int j = right; j > left; j--){
                            array.swap(j, j-1);
                        }
                        right = right+1;
                    }
                    left++;
                }
            }
    }
}
