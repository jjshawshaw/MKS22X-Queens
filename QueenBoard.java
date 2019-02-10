public class QueenBoard{
    private int[][] board;

    public QueenBoard(int size){
      board = new int[size][size];
      clear();
    }

  private void clear(){
    for (int x = 0; x < board.length; x++){
      for (int y = 0; y < board.length; y++){
          board[y][x] = 0;
      }
    }
  }


  private boolean addQueen(int r, int c){
    if (board[r][c] > 0) return false;
    else{
      board[r][c] = -1;
      for (int x = c + 1; x < board.length; x++){
        board[r][x] += 1;
      }
      int y = r + 1;
      for (int x = c + 1; x < board.length; x++){
        if (y >= board.length) x = board.length;
        else {
          board[y][x] += 1;
          y++;
        }
      }
      y = r - 1;
      for (int x = c + 1; x < board.length; x++){
        if (y < 0) x = board.length;
        else{
          board[y][x] += 1;
          y--;
        }
      }
      return true;
    }
  }

private boolean removeQueen(int r, int c){
if (board[r][c] >= 0) return false;
else{
  board[r][c] = 0;
  for (int x = c + 1; x < board.length; x++){
    board[r][x] -= 1;
  }
  int y = r + 1;
  for (int x = c + 1; x < board.length; x++){
    if (y >= board.length) x = board.length;
    else {
      board[y][x] -= 1;
      y++;
    }
  }
  y = r - 1;
  for (int x = c + 1; x < board.length; x++){
    if (y < 0) x = board.length;
    else{
      board[y][x] -= 1;
      y--;
    }
  }
  return true;
}
}

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

 public String toString(){
   String out = "";
   for (int y = 0; y < board.length; y++){
     for (int x = 0; x < board.length; x++){
       if (board[y][x] < 0) out += "Q ";
       else if (board[y][x] == 0) out += "_ ";
       else out += "x ";
   }
   out += "\n";
 }
 return out;
 }



 /**
 *@return false when the board is not solveable and leaves the board filled with zeros;

 *        true when the board is solveable, and leaves the board in a solved state

 *@throws IllegalStateException when the board starts with any non-zero value

 */
 public boolean solve(){
   return s(0);
 }
 private boolean s(int x){
   if (x == board.length) return true;
   for (int y = 0; y < board.length; y++){
     if (board[y][x] == 0){
       addQueen(y, x);
      // System.out.println(toString());
       if (!s(x + 1)) removeQueen(y, x);
       else return true;
     }
   }
   return false;
 }

 /**
 *@r  eturn the number of solutions found, and leaves the board filled with only 0's
 *@throws IllegalStateException when the board starts with any non-zero value
 */
 public int countSolutions(){
clear();
return s(0, 0);
}

private int s(int x, int count){
  for (int y = 0; y < board.length; y++){
    if (board[y][x] == 0){
      addQueen(y, x);
      System.out.println(toString());
      if (x + 1 != board.length){
         s(x + 1, count);
         removeQueen(y, x);
      }else count += 1;
    }
  }
  clear();
  return count;
}

}
