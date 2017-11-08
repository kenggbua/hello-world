import java.time.LocalDateTime;

public class aufgabe20 {
    public static void main(String[] args) {
        int n = 365;
        int[] tage = new int[n];
        int t = 1;
        int x = LocalDateTime.now().getDayOfMonth();
        int hours = 0;

        for (int i = 1; i < x; i++) {
            tage[i] = t;
            t++;
            for (int j = 0; j < x; j++) {
                hours = 24 * tage[i];
            }
            if (tage[i] == 1) {
                System.out.println(tage[i] + " Tag " + "hat " + hours + " Stunden" );
            }else
            System.out.println(tage[i] + " Tage " + "haben " + hours + " Stunden" );
        }

    }
}
