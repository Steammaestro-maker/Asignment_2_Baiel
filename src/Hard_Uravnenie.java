import java.util.Scanner;

public class Hard_Uravnenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        if (a == 0) {
            if (b != 0) {
                System.out.println("NO");
            } else if (c == 0 && d != 0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
            return;
        }

        if (b % a != 0) {
            System.out.println("NO");
            return;
        }

        long x = -b / a;
        if (c * x + d == 0) {
            System.out.println("NO");
        } else {
            System.out.println(x);
        }
    }
}