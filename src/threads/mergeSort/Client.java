package threads.mergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> array = List.of(2,4,5,6,7,9,8,1,3);

        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSort mergeSorter = new MergeSort(array, executorService);


        Future<List<Integer>> listFuture = executorService.submit(mergeSorter);


        List<Integer> sortedArray = listFuture.get();

        System.out.println(sortedArray);
    }
}
