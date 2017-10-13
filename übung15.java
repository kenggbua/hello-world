import java.util.Scanner;

public class übung15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double einkommen = sc.nextInt();
        double steuern1 = 5000 * 0.1;
        double steuern2 = 10000 * 0.22;
        double steuern3 = 15000 * 0.32;
        double steuern4 = einkommen * 0.42;

        if (einkommen >= 30001) {
              double steuern = steuern1 + steuern2 + steuern3 + steuern4;

            System.out.println("Es werden " + steuern + " versteuert");
        }

       if (einkommen <= 30000 && einkommen >= 15001) {
            double steuern = steuern1 + steuern2 + einkommen * 0.32;
           System.out.println("Es werden " + steuern + " versteuert");
       }

       if (einkommen <= 15000 && einkommen >= 5001) {
            double steuern = steuern1 + einkommen * 0.22;
           System.out.println("Es werden " + steuern + " versteuert");

       }

       if (einkommen <= 5000) {
            double steuern = einkommen * 0.1;
           System.out.println("Es werden " + steuern + " versteuert");
       }



        }



    }

