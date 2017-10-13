import java.util.Scanner;

public class übung13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        int count10 = 0;
        int count5 = 0;


        if (s % 5 == 0) {

            if (s >=100) {

        while (s >= 100) {
            s = s - 100;
            count100++;
        }
            } // counts the 100 euros
        System.out.println("Sie bekommen " + count100 + " Hundert-Euro-Scheine.");
            if (s >=50) {

        while (s >= 50) {
            s = s - 50;
            count50++;
        }  // counts the 50 euros
        System.out.println("Sie bekommen " + count50 + " Fünfzig-Euro-Scheine."); }
            if (s >=20) {

        while (s >= 20) {
            s = s - 20;
            count20++;
        }  // counts the 20 euros
        System.out.println("Sie bekommen " + count20 + " Zwanzig-Euro-Scheine."); }
            if (s >=10) {

        while (s >= 10) {
            s = s - 10;
            count10++;
        } // counts the 10 euros
            System.out.println("Sie bekommen " + count10 + " Zehn-Euro-Scheine."); }
            if (s >=5) {

        while (s >= 5) {
            s = s - 5;
            count5++;
        } // counts the 5 euros
            System.out.println("Sie bekommen " + count5 + " Fünf-Euro-Scheine."); }

    } else System.err.println("Error");
} }
