public class HeapSorter {
    public void sortArray(int[] data) {
        int length = data.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            buildHeap(data, length, i);
        }
        for (int i = length - 1; i > 0; i--) {
            swap(data, 0, i);
            buildHeap(data, i, 0);
        }
    }
    private void buildHeap(int[] data, int length, int i) {
        int largest = i; 
        int leftChild = 2 * i + 1; 
        int rightChild = 2 * i + 2; 
        if (leftChild < length && data[leftChild] > data[largest]) {
            largest = leftChild;
        }
        if (rightChild < length && data[rightChild] > data[largest]) {
            largest = rightChild;
        }
        if (largest != i) {
            swap(data, i, largest);
            buildHeap(data, length, largest);
        }
    }
    private void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
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