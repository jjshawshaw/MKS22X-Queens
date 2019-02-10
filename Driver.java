public class Driver{
  public static void main(String[]args){
    QueenBoard q = new QueenBoard(5);
    // System.out.println(q);
    // q.addQueen(2,0);
    // System.out.println(q);
    // q.addQueen(0,0);
    // System.out.println(q);
    // q.removeQueen(0,0);
    System.out.println(q);
    q.solve();
     System.out.println(q);
    // System.out.println(q.countSolutions());
  }
}
