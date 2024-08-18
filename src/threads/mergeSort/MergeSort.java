package threads.mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {

    List<Integer> array;
    ExecutorService executorService;

    MergeSort(List<Integer> array, ExecutorService executorService){
        this.array = array;
        this.executorService = executorService;
    }


    @Override
    public List<Integer> call() throws Exception {
        if(array.size() <=1){
            return array;
        }

        int mid = array.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0;i< mid; i++){
            leftArray.add(array.get(i));
        }

        for(int i=mid; i<array.size(); i++){
            rightArray.add(array.get(i));
        }

        MergeSort leftMergeSort = new MergeSort(leftArray, executorService);
        Future<List<Integer>> leftMergeSortFuture = executorService.submit(leftMergeSort);

        MergeSort rightMergeSorter = new MergeSort  (rightArray, executorService);
        Future<List<Integer>> rightMergeSortFuture = executorService.submit(rightMergeSorter);

        List<Integer> leftSortedArray = leftMergeSortFuture.get();
        List<Integer> rightSortedArray = rightMergeSortFuture.get();

        List<Integer> sortedArray = new ArrayList<>();

        int i=0, j = 0;
        while(i < leftSortedArray.size() && j < rightSortedArray.size()){
            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }
            else{
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        // Pick the remaining elements
        while(i < leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while(j < rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;

    }
}
