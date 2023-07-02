import java.util.ArrayList;

public class nqueen {
    public static void main(String[] args) {
        int n = 1;
        char[][] board = new char[n][n];
        for(int i = 0; i<n; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                board[i][j]='.';
            }
        }

        System.out.println(nQueen(board,0,0));
    }

    private static int nQueen(char[][] board, int row, int count) {
        int n = board.length;

        if (row == n) {
            count += 1;
            return count;
        }

        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                count = nQueen(board, row + 1, count);
                board[row][j] = '.'; // backtrack
            }
        }

        return count;
    }


    private static boolean isSafe(char[][] board,int row, int col) {
        int n = board.length;
        //check Queen in vertical Column
        for(int i=0 ; i<n ; i++)
        {
            if(board[i][col] == 'Q') return false;
        }

        //check Queen in Horizontal Column
        for(int j=0 ; j<n ; j++)
        {
            if(board[row][j] == 'Q') return false;
        }

        //check Queen in North East
        int i = row , j = col;
        while (i >= 0 && j < n)
        {
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }


        //check Queen in North West
        i = row;
        j=col;
        while (i >= 0 && j >= 0 )
        {
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }

        //check Queen in South West
        i = row;
        j=col;
        while (i < n && j >= 0)
        {
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }

        //check Queen in South East
        i = row;
        j=col;
        while (i < n && j < n)
        {
            if(board[i][j] == 'Q') return false;
            i++;
            j++;
        }
        return true;
    }

    public static void print(char[][] board,int row)
    {
        int n = board.length;
        for(int i=0 ; i<n ; i++)
        {
            for(int j =0 ; j<n ;j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
