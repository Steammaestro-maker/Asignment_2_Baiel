import java.util.Scanner;

public class Bishop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bishopRow = scanner.nextInt();
        int bishopColumn = scanner.nextInt();
        int pieceRow = scanner.nextInt();
        int pieceColumn = scanner.nextInt();

        if (Math.abs(bishopRow - pieceRow) == Math.abs(bishopColumn - pieceColumn)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}