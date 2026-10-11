import java.util.Scanner;

public class Fishka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        // На доске N×N крайних клеток 4N - 4.
        // Проверяем, существует ли целый размер доски N ≥ 2.
        boolean possible = n >= 4 && (n + 4) % 4 == 0;

        System.out.println(possible ? "YES" : "NO");
    }
}