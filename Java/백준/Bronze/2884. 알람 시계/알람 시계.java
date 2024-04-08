import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int hh = scan.nextInt();
        int mm = scan.nextInt();

        if ( mm >= 45)
            mm -= 45;
        else {
            mm += 15;
            if ( hh == 0)
                hh = 23;
            else
                hh -= 1;
        }

        System.out.println(hh + " " + mm);
    }
}