public class Driver{
  public static void main(String[]args){
    QueenBoard q = new QueenBoard(5);
    System.out.println(q);
    q.addQueen(2,0);
    System.out.println(q);
  }
}
