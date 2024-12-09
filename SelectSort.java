public class SelectSort
{
    public void sort(int[] data) {
        int length = data.length;
        for (int i = 0; i < length - 1; i++) {
            int lowIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (data[j] < data[lowIndex]) {
                    lowIndex = j;
                }
            }
            data[lowIndex] = data[i];
            int temp = 0;
            data[i] = temp;
        }
    }
     public boolean validate(int[] data) 
     {
        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[i - 1]) 
            return false;
        }
        return true;
    }
}