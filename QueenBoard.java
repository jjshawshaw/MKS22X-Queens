public class QueenBoard{
    private int[][] board;

    public QueenBoard(int size){
      board = new int[size][size];
      for (int i = 0; i < size; i++){
        board[i][i] = 0;
      }
    }


  private boolean addQueen(int r, int c){
    if (board[r][c] > 0) return false;
    else{
      board[r][c] = -1;
      for (int y = c + 1; y < board[0].length; y++){
        board[r][c] += 1;
      }
      int x = r + 1;
      for (int y = c + 1; y < board[0].length; y++){
        if (x >= board.length) y = board[0].length;
        board[x][c] += 1;
        x++;
      }
      for (int y = c + 1; y < board[0].length; y++){
        if (x < 0) y = board[0].length;
        board[x][c] += 1;
        x--;
      }
      return true;
    }
  }

//private boolean removeQueen(int r, int c)

  /**
 *@return The output string formatted as follows:
 *All numbers that represent queens are replaced with 'Q'
 *all others are displayed as underscores '_'
 *There are spaces between each symbol:
 *"""_ _ Q _
 *Q _ _ _

 *_ _ _ Q

 *_ Q _ _"""
 *(pythonic string notation for clarity,
 *excludes the character up to the *)
 */

 //public String toString(){}



 /**
 *@return false when the board is not solveable and leaves the board filled with zeros;

 *        true when the board is solveable, and leaves the board in a solved state

 *@throws IllegalStateException when the board starts with any non-zero value

 */
// public boolean solve(){}

 /**
 *@r  eturn the number of solutions found, and leaves the board filled with only 0's
 *@throws IllegalStateException when the board starts with any non-zero value
 */
// public int countSolutions(){}


}
