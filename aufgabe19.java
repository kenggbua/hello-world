public class aufgabe19 {
    public static void main(String[] args) {
        boolean[] t = {true, false, true, false};
        boolean[] f = {false, false, false, true};
        int h = 0;

        for (int i = 0; i < t.length; i++) {
            if(t[i] != f[i]) {
                h++;
            }
        }
        System.out.println("Die Hemming Distanz ist: " + h);


    }
}
