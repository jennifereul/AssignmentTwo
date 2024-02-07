import java.io.FileWriter;
import java.io.IOException;

public class Performance {
    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        int iterations = 20;


        SortingAlgorithm[] algorithms = {
                new QuickSort(),
                new MergeSort(),
                new ShellSort(),
                new InsertionSort(),
                new SelectionSort(),
                new BubbleSort()
        };

        try {
            FileWriter writer = new FileWriter("performance_report.txt");

            for (SortingAlgorithm algorithm : algorithms) {
                writer.write("Sorting algorithm - " + algorithm.getClass().getSimpleName() + "\n");

                for (int size : sizes) {
                    double totalTime = 0;


                    TesterClass tester = new TesterClass(algorithm);

                    for (int i = 0; i < iterations; i++) {

                        totalTime += tester.singleTest(size);
                    }


                    double averageTime = totalTime / iterations;


                    writer.write("Sorted " + size + " elements in " + averageTime + " ms (avg)\n");
                }
                //CODE THAT DOESN'T WORK
                 /*
                    totalTime = 0;

                    for (int i = 0; i < iterations; i++) {
                        totalTime += tester.singleTestWithKSortedData(size, 10); // Test with k-sorted data
                    }

                    averageTime = totalTime / iterations;
                    writer.write("Sorted " + size + " elements with 10-sorted data in " + averageTime + " ms (avg)\n");
                    */


                writer.write("\n");
            }

            writer.close();
            System.out.println("Success");
        } catch (IOException e) {
            System.err.println("Fail" + e.getMessage());
        }
    }
}



