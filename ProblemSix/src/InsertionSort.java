
//https://www.geeksforgeeks.org/java-program-for-insertion-sort/

//implementation from slides (Class Example)
//public class InsertionSort {
//void insertionSort(int[] a) {
//int tmp;
//for (int p = 1; p < a.length; ++p) {
//tmp = a[p];
//int j;
//for (j = p; j > 0 && tmp < a[j - 1]; j--) {
//a[j] = a[j - 1];
//}
//a[j] = tmp;
//}
//}
//}
public class InsertionSort implements SortingAlgorithm {
    @Override
    public int[] sorty(int[] input) {
        int n = input.length;
        int tmp;
        for (int p = 1; p < n; ++p) {
            tmp = input[p];
            int j;
            for (j = p; j > 0 && tmp < input[j - 1]; j--) {
                input[j] = input[j - 1];
            }
            input[j] = tmp;
        }
        return input;
    }
}


