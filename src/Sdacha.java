import java.util.Scanner;

public class Sdacha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong(); // рубли за товар
        long b = scanner.nextLong(); // копейки за товар
        long c = scanner.nextLong(); // рубли оплаты
        long d = scanner.nextLong(); // копейки оплаты

        long change = (c * 100 + d) - (a * 100 + b);

        System.out.println((change / 100) + " " + (change % 100));
    }
}