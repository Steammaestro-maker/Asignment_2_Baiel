import java.util.Scanner;

public class Knight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int knightRow = scanner.nextInt();
        int knightColumn = scanner.nextInt();
        int pieceRow = scanner.nextInt();
        int pieceColumn = scanner.nextInt();

        int rowDiff = Math.abs(knightRow - pieceRow);
        int columnDiff = Math.abs(knightColumn - pieceColumn);

        System.out.println(
                (rowDiff == 2 && columnDiff == 1)
                        || (rowDiff == 1 && columnDiff == 2)
                        ? "YES" : "NO"
        );
    }
}