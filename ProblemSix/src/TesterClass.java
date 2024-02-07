public class TesterClass {
    private SortingAlgorithm sortingAlgorithm;

//"Tester(SortingAlgorithm sa): A constructor for the Tester that takes as parameter the sorting
//algorithm to be tested"
    //Helper #1
    public TesterClass(SortingAlgorithm sa) {
        this.sortingAlgorithm = sa;
    }

//double singleTestint size): Should create an array of integers of the given size. Fill it with random numbers and run
// the sorting algorithm's sorty method.
//It should record and return the time it takes to sort the array.
    //Helper #2
    public double singleTest(int size) {
        int[] arr = generateRandomArray(size);
        long startTime = System.nanoTime();
        sortingAlgorithm.sorty(arr);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1e6;
    }


    private int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size);
        }
        return arr;
    }

    //void test(int iterations, int size): Should run the
    // singleTest method as many times as the number of iterations provided and
    //print to the console the average time the algorithm takes to sort an array of the given size.
    //Helper #3
    public void test(int iterations, int size) {
        double totalTime = 0;
        for (int i = 0; i < iterations; i++) {
            totalTime += singleTest(size);
        }
        double averageTime = totalTime / iterations;
        System.out.println("Average sorting time for size " + size + ": " + averageTime + " milliseconds");
    }
}

//QUESTION 12
//Code that doesn't work


 /*
    public double singleTestWithKSortedData(int size, int k) {
        int[] arr = generateKSortedArray(size, k);
        long startTime = System.nanoTime();
        sortingAlgorithm.sorty(arr);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1e6;
    }
    */
 /*
    private int[] generateKSortedArray(int size, int k) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + (int) (Math.random() * (k + 1));
        }
        return arr;
    }
    */

