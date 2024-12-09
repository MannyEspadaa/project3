public class QuickSorter {
    public void quickSort(int[] data, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(data, start, end);
            quickSort(data, start, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, end);
        }
    }
    private int partition(int[] data, int start, int end) {
        int pivot = data[end];
        int smallIndex = start - 1;

        for (int currentIndex = start; currentIndex < end; currentIndex++) {
            if (data[currentIndex] < pivot) {
                smallIndex++;
                swap(data, smallIndex, currentIndex);
            }
        }
        swap(data, smallIndex + 1, end);
        return smallIndex + 1;
    }

    private void swap(int[] data, int index1, int index2) {
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
    public boolean validate(int[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[i - 1]) {
                return false;
            }
        }
        return true;
    }
}