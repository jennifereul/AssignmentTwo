//https://www.geeksforgeeks.org/java-program-for-bubble-sort/

//implementation from slides (Class Example)
//public class BubbleSort {
//void bubbleSort(int[] a) {
//int n = a.length;
//int tmp;
//for (int i = 0; i < n - 1; i++) { // Number of elements sorted
//for (int j = 0; j < n - 1 - i; j++) {
//if (a[j] > a[j + 1]) { // Compare neighbors
// Swap a[j] and a[j+1]
//tmp = a[j];
//a[j] = a[j + 1];
//a[j + 1] = tmp;
//}
//}
//}
//}
//}


public class BubbleSort implements SortingAlgorithm {
    @Override
    //Method from interface
    public int[] sorty(int[] input) {
        int n = input.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;
    }
}

