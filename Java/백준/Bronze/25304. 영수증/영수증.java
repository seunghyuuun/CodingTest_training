import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int n = scan.nextInt();
        int amount = 0;

        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            amount += a * b;
        }

        if (x == amount)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
