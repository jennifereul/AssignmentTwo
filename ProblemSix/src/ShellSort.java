
//https://www.geeksforgeeks.org/java-program-for-shellsort/

//implementation from slides (Class Example)
//public class ShellSort {
//void ShellSort(Array a) {
//int n = a.length;
//for (int gap = n / 2; gap > 0; gap /= 2) {
//for (int i = gap; i < n; ++i) {
//int tmp = a[i];
//int j;
//for (j = i; j >= gap && tmp < a[j - gap]; j -= gap) {
//a[j] = a[j - gap];
//}
//a[j] = tmp;
//}
//}
//}
//}

public class ShellSort implements SortingAlgorithm {
    @Override
    //Method from interface
    public int[] sorty(int[] input) {
        int n = input.length;
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = input[i];
                int j;
                for (j = i; j >= gap && input[j - gap] > temp; j -= gap)
                    input[j] = input[j - gap];
                input[j] = temp;
            }
        }
        return input;
    }
}


