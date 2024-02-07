
//https://www.geeksforgeeks.org/java-program-for-quicksort/

//implementation from slides (Class Example)
//Array quicksort(Array a) {
//if (a.length <= 1) {
//return a;
//}
//p = random(a.length); // Pick an element as the pivot
// Partition a-{p} into two groups
//S1 = (all elements in a-{p} that are smaller than p);
//S2 = (all elements in a-{p} that are larger than p);
//return concatenate(quicksort(S1), p, quicksort(S2));
//}
public class QuickSort implements SortingAlgorithm {
    @Override
    public int[] sorty(int[] input) {
        quickSort(input, 0, input.length - 1);
        return input;
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

    //Concatenation isn't necessary



