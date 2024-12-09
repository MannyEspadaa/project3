public class InsertionSorter {
    public void sortArray(int[] data) {
        int length = data.length;
        for (int currentIndex = 1; currentIndex < length; currentIndex++) {
            int currentElement = data[currentIndex];
            int previousIndex = currentIndex - 1;
            while (previousIndex >= 0 && data[previousIndex] > currentElement) {
                data[previousIndex + 1] = data[previousIndex];
                previousIndex--;
            }
            data[previousIndex + 1] = currentElement;
        }
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