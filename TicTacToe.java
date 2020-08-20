import java.util.Scanner;

public class TicTacToe
{
    int play_count; // number of plays
    char[][] board; // the board (3x3 char array)

    public TicTacToe()
    {
        // init locals
        play_count = 0;
        board  = new char[3][3];

        // Set board to spaces
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                board[i][j] = ' ';
            }
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        game.printBoard();

        // wait for input
        Scanner scan = new Scanner(System.in);

        scan.nextLine();

        scan.close();
    }

    public void printBoard()
    {
        // Flush screen
        System.out.print("\033[H\033[2J"); 
        System.out.flush();

        // Print top line
        System.out.println("+-+-+-+");

        // Print left pipe to start new row
        System.out.print("|");

        // Print first row
        for (int i = 0; i < 3; i++)
        {
            System.out.print(board[0][i]);
            System.out.print("|");
        }
        System.out.println();

        // Print next line
        System.out.println("+-+-+-+");

        // Print left pipe to start new row
        System.out.print("|");

        // Print second row
        for (int i = 0; i < 3; i++)
        {
            System.out.print(board[1][i]);
            System.out.print("|");
        }
        System.out.println();

        // Print next line
        System.out.println("+-+-+-+");

        // Print left pipe to start new row
        System.out.print("|");

        // Print last row
        for (int i = 0; i < 3; i++)
        {
            System.out.print(board[2][i]);
            System.out.print("|");
        }
        System.out.println();

        // Print closing line
        System.out.println("+-+-+-+");
    }

    public void printKey()
    {
        System.out.println("+-+-+-+\n|1|2|3|\n+-+-+-+\n|4|5|6|\n+-+-+-+\n|7|8|9|\n+-+-+-+");
    }
}