import java.util.Random;
import java.util.Scanner;

public class XO {

    char arr[][] = {{'0', '0', '0',},
            {'0', '0', '0'},
            {'0', '0', '0'}};
    char symbol;

    public static void winner(char arr[][], char symbol) {
        if (arr[0][0] == 'X' && arr[1][0] == 'X' && arr[2][0] == 'X') {
            System.out.println("winner - first player");
        } else if (arr[0][1] == 'X' && arr[1][1] == 'X' && arr[2][1] == 'X') {
            System.out.println("winner - first player");
        } else if (arr[0][2] == 'X' && arr[1][2] == 'X' && arr[2][2] == 'X') {
            System.out.println("winner - first player");
        } else if (arr[0][0] == 'O' && arr[1][0] == 'O' && arr[2][0] == 'O') {
            System.out.println("winner - second player");
        } else if (arr[0][1] == 'O' && arr[1][1] == 'O' && arr[2][1] == 'O') {
            System.out.println("winner - second player");
        } else if (arr[0][2] == 'O' && arr[1][2] == 'O' && arr[2][2] == 'O') {
            System.out.println("winner - second player");
        } else if (arr[0][0] == 'X' && arr[0][1] == 'X' && arr[0][2] == 'X') {
            System.out.println("winner - first player");
        } else if (arr[1][0] == 'X' && arr[1][1] == 'X' && arr[1][2] == 'X') {
            System.out.println("winner - first player");
        } else if (arr[2][0] == 'X' && arr[2][1] == 'X' && arr[2][2] == 'X') {
            System.out.println("winner - first player");
        } else if (arr[0][0] == 'O' && arr[0][1] == 'O' && arr[0][2] == 'O') {
            System.out.println("winner - second player");
        } else if (arr[1][0] == 'O' && arr[1][1] == 'O' && arr[1][2] == 'O') {
            System.out.println("winner - second player");
        } else if (arr[2][0] == 'O' && arr[2][1] == 'O' && arr[2][2] == 'O') {
            System.out.println("winner - second player");
        } else if (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') {
            System.out.println("winner-first player");
        } else if (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O') {
            System.out.println("winner-second player");
        } else if (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') {
            System.out.println("winner-first player");
        } else if (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X') {
            System.out.println("winner-first player");
        } else if (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O') {
            System.out.println("winner-first player");
        } else {
            // System.out.println("continue");
        }

    }

    void start() {
        System.out.println("Start!");
        Random random = new Random();
        String player;
        int player1 = random.nextInt(5) + 1;
        int player2 = random.nextInt(5) + 1;
        if (player1 > player2) {
            player = "player1";
            System.out.println(player1 + " The first player starts the game ");
        } else {
            player = "player2";
            System.out.println(player2 + " The second player starts the game");
        }

        while (true) {
            System.out.print("Player1 position: ");
            Scanner scan = new Scanner(System.in);
            int player1Position = scan.nextInt();
            XO.game("player1", arr, player1Position);
            XO.winner(arr, symbol);
            System.out.print("Player2 position: ");
            int player2Position = scan.nextInt();
            XO.game("player2", arr, player2Position);
            XO.winner(arr, symbol);

        }
    }

    static void array(char arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }

    static void game(String player, char[][] arr, int position) {
        char symbol = 'X';
        if (player.equals("player1")) {
            symbol = 'X';
        } else if (player.equals("player2")) {
            symbol = 'O';
        }
        switch (position) {
            case 1:
                arr[0][0] = symbol;
                break;
            case 2:
                arr[0][1] = symbol;
                break;
            case 3:
                arr[0][2] = symbol;
                break;
            case 4:
                arr[1][0] = symbol;
                break;
            case 5:
                arr[1][1] = symbol;
                break;
            case 6:
                arr[1][2] = symbol;
                break;
            case 7:
                arr[2][0] = symbol;
                break;
            case 8:
                arr[2][1] = symbol;
                break;
            case 9:
                arr[2][2] = symbol;
            default:
        }
        XO.array(arr);
        System.out.println("\n");
    }
}
