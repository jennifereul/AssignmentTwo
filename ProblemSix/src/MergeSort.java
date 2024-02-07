//https://www.geeksforgeeks.org/merge-sort/

//implementation from slides (Class Example)

//Array merge(Array array11, Array array12) {
//Array array13 = {}
//int index11 = 0; //int index12 = 0;
//for (int i = 0; i < (array11.length + array12.length); i++) {
//if (array11[index11] < array12[index12]) {
//array13[i] = array11[index11];
//index11++;
//} else {
//array13[i] = array12[index12];
//index12++;
//}
//}
//return array13;
//}


public class MergeSort implements SortingAlgorithm {
    @Override
    //Method from interface
    public int[] sorty(int[] input) {
        mergeSort(input, 0, input.length - 1);
        return input;
    }

    private void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}


