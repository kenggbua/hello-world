import java.util.Scanner;

public class aufgabe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 4};
        int n = sc.nextInt();
        int k = 0;
        int p = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                k++;
            }
        }
        int[] newarr = new int[arr.length - k];
        for (int j = 0; j < arr.length; j++) {
            if (p < newarr.length) {
                if (arr[p] != n) {
                    newarr[p] = arr[j];
                }
                if (arr[p] == n) {
                    j++;
                    newarr[p] = arr[j];
                }
                System.out.println(newarr[p]);
                p++;
            }

        }
    }
}
