public class ShellSort
{
    public void sort(int[] data) {
        int length = data.length;
        for (int diff = length / 2; diff > 0; diff /= 2) {
            for (int i = diff; i < length; i++) {
                int temp = data[i];
                int j = 0;
                for (j = i; j >= diff && data[j - diff] > temp; j -= diff) {
                    data[j] = data[j - diff];
                }
                data[j] = temp;
            }
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