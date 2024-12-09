public class MergeSorter {
    public void mergeSort(int[] data, int start, int end) {
        if (start >= end) {
            return; 
        }
        int middle = start + (end - start) / 2;
        mergeSort(data, start, middle);
        mergeSort(data, middle + 1, end);
        merge(data, start, middle, end);
    }
    private void merge(int[] data, int start, int middle, int end) {
        int[] mergedData = new int[end - start + 1];
        int leftIndex = start;
        int rightIndex = middle + 1;
        int mergeIndex = 0;
        while (leftIndex <= middle && rightIndex <= end) {
            if (data[leftIndex] <= data[rightIndex]) {
                mergedData[mergeIndex++] = data[leftIndex++];
            } else {
                mergedData[mergeIndex++] = data[rightIndex++];
            }
        }
        while (leftIndex <= middle) {
            mergedData[mergeIndex++] = data[leftIndex++];
        }
        while (rightIndex <= end) {
            mergedData[mergeIndex++] = data[rightIndex++];
        }
        System.arraycopy(mergedData, 0, data, start, mergedData.length);
    }
    public boolean validate(int[] data) { //sourced from GEEKS FOR GEEKS
        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[i - 1]) {
                return false; 
            }
        }
        return true; 
    }
}