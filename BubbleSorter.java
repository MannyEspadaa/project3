public class BubbleSorter {

    public void sortArray(int[] data) {
        int length = data.length;
        for (int outerIndex = 0; outerIndex < length - 1; outerIndex++) {
            for (int innerIndex = 0; innerIndex < length - outerIndex - 1; innerIndex++) {
                if (data[innerIndex] > data[innerIndex + 1]) {
                    swap(data, innerIndex, innerIndex + 1);
                }
            }
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