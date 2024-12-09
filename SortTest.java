import java.util.Random;

public class SortTest {
    public static void main(String[] args) {
        System.out.println("Starting sort with 10,000 elements");
        long start, end;
        
        
        int[] data1 = genRandData(10000);
        start = System.nanoTime();
        SelectSort s1 = new SelectSort();
        s1.sort(data1);
        end = System.nanoTime();
        System.out.println("Selection took " + (end - start) / 1_000_000.0 + " ms");

        InsertionSorter s2 = new InsertionSorter();
        int[] data2 = genRandData(10000);
        start = System.nanoTime();
        s2.sortArray(data2);
        end = System.nanoTime();
        System.out.println("Insertion took " + (end - start) / 1_000_000.0 + " ms");

        BubbleSorter s3 = new BubbleSorter();
        int[] data3 = genRandData(10000);
        start = System.nanoTime();
        s3.sortArray(data3);
        end = System.nanoTime();
        System.out.println("BubbleSort took " + (end - start) / 1_000_000.0 + " ms");

        MergeSorter s4 = new MergeSorter();
        int[] data4 = genRandData(10000);
        start = System.nanoTime();
        s4.mergeSort(data4, 0, data4.length - 1);
        end = System.nanoTime();
        System.out.println("MergeSort took " + (end - start) / 1_000_000.0 + " ms");

        ShellSort s5 = new ShellSort();
        int[] data5 = genRandData(10000);
        start = System.nanoTime();
        s5.sort(data5);
        end = System.nanoTime();
        System.out.println("ShellSort took " + (end - start) / 1_000_000.0 + " ms");

        QuickSorter s6 = new QuickSorter();
        int[] data6 = genRandData(10000);
        start = System.nanoTime();
        s6.quickSort(data6, 0, data6.length - 1);
        end = System.nanoTime();
        System.out.println("QuickSort took " + (end - start) / 1_000_000.0 + " ms");

        HeapSorter s7 = new HeapSorter();
        int[] data7 = genRandData(10000);
        start = System.nanoTime();
        s7.sortArray(data7);
        end = System.nanoTime();
        System.out.println("HeapSort took " + (end - start) / 1_000_000.0 + " ms");
    }

    public static int[] genRandData(int size) {
        Random rand = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(10000);
        }
        return data;
    }
}