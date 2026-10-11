import java.util.Scanner;

public class Kotleti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int batches = (2 * n + k - 1) / k;
        System.out.println(batches * m);
    }
}