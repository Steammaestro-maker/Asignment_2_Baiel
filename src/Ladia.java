import java.util.Scanner;

public class Ladia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Row1 = scanner.nextInt();
        int Column1 = scanner.nextInt();
        int Row2 = scanner.nextInt();
        int Column2 = scanner.nextInt();

        if (Row1 == Row2 || Column1 == Column2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}