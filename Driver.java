public class Driver{
  public static void main(String[]args){
    QueenBoard q = new QueenBoard(5);
    q.solve();
    System.out.println(q);
    //q.solve();
    //System.out.println(q);
    //System.out.println(q.countSolutions());
    q.clear();
    System.out.println(q.countSolutions());
    
  }
}
