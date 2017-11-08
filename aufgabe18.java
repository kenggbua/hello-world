import java.util.Arrays;

public class aufgabe18 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 8 ,7};
        int save = 0;

        for (int i = arr.length - 1; i > (arr.length / 2) - 1; i--) {
            save = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = save;
        }
        System.out.print(Arrays.toString(arr));
    }
}
