import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner console = new Scanner(System.in);
        System.out.println("Podaj a:");
        a = console.nextInt();
        a = Math.pow(2,a);
        System.out.println("Podaj b:");
        b = console.nextInt();
        b = Math.pow(2,b);
        System.out.println("Pitagorasss to:" + (Math.sqrt(a + b)));
    }
}