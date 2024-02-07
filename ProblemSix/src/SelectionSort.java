
//https://www.geeksforgeeks.org/java-program-for-selection-sort/

//implementation from slides (Class Example)
//public class SelectionSort {
//void selectionSort(int[] a) {
//int unsorted = 0;
//for (int i = 0; i < a.length; i++) {
//int minIndex = i;
//for (int j = i; j < a.length; j++) {
//if (a[j] < a[minIndex]) {
//minIndex = j;
//}
//}
//swap(a, i, minIndex);
//}
//}
public class SelectionSort implements SortingAlgorithm {
    @Override
    //Method from interface
    public int[] sorty(int[] input) {
        int n = input.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap input[i] and input[minIndex]
            int temp = input[minIndex];
            input[minIndex] = input[i];
            input[i] = temp;
        }
        return input;
    }
}

