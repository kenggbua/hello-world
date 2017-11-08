public class aufgabe21 {
    public static void main(String[] args) {
        char[] arr = {'R','E','I','T','T','I','E','R'};
        boolean isPalindrome = true;
        int n = 0;

        for (int i = arr.length - 1; i > arr.length/2 - 1; i--) {
            if (arr[i] == arr[arr.length-1-i]) {
                n++;
            }
        }
        if(n == arr.length/2) {
            isPalindrome = true;
        } else if (n != arr.length/2) {
            isPalindrome = false;
        }
        System.out.println("Die gegebene Zeichenkette ist " + (isPalindrome?"ein ": "kein ") + "Palindrom.");
    }
}
