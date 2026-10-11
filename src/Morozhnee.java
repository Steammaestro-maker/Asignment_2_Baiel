import java.util.Scanner;

public class Morozhnee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        System.out.println(k == 1 || k == 2 || k == 4 || k == 7
                ? "NO"
                : "YES");
    }
}