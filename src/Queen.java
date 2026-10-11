import java.util.Scanner;

public class Queen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int queenRow = scanner.nextInt();
        int queenColumn = scanner.nextInt();
        int pieceRow = scanner.nextInt();
        int pieceColumn = scanner.nextInt();

        boolean canCapture =
                queenRow == pieceRow
                        || queenColumn == pieceColumn
                        || Math.abs(queenRow - pieceRow) == Math.abs(queenColumn - pieceColumn);

        System.out.println(canCapture ? "YES" : "NO");
    }
}