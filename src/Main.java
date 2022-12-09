import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        int warunek;
        int i = 1;
        while (i < 2) {
            System.out.println(i);
            Scanner console = new Scanner(System.in);
            System.out.println("Wybierz: 1 - przyprostokątne 2 - przeciwprostokątna");
            warunek = console.nextInt();
            if (warunek == 1) {
                System.out.println();
                System.out.println("Podaj a:");
                a = console.nextInt();
                a = Math.pow(2, a);
                System.out.println("Podaj b:");
                b = console.nextInt();
                b = Math.pow(2, b);
                System.out.println("Pitagorasss to:" + (Math.sqrt(a + b)));
            }
            if (warunek == 2) {
                System.out.println("Podaj a:");
                a = console.nextInt();
                a = Math.pow(2, a);
                System.out.println("Podaj c:");
                c = console.nextInt();
                c = Math.pow(2, c);
                System.out.println("Pitagorasss to:" + (Math.sqrt(c - a)));
            }
        }
    }
}

