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
            for (int j = 0; j <= i; j++)
            {
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard()
    {
        
    }

    public void printKey()
    {
        System.out.println();
    }
}