import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hh = scan.nextInt();
        int mm = scan.nextInt();
        int plus = scan.nextInt();

        mm += plus;
        hh += mm / 60;
        mm %= 60;

        hh %= 24;

        System.out.println(hh + " " + mm);
    }
}