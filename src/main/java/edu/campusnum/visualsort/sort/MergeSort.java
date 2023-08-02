package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

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

            if(length > 1) {

                int mid = length/2;

                ObservableArray left = array.slice(0, mid);
                ObservableArray right = array.slice(mid, length);

                this.sort(left);
                this.sort(right);



                int i = 0;
                int j = 0;
                int idx = 0;   // zberigaemo menshui index iz left i right



                /*while(i < left.getLength() && j < right.getLength()){
                    if(left.get(i) < right.get(j)){
                        array.get(idx) = left.get(i);
                        i++;
                    }else {
                        array.get(idx) = right.get(j);
                        j++;
                    }
                    idx++;
                }*/

            }

    }

}
