import java.util.Arrays;

public class TaskNine {
    public static void fillArrayWithInitialValue(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }

        System.out.println(Arrays.toString(arr));
    }
}