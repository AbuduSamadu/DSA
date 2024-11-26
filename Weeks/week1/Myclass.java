public class Myclass{
  private int x;

  public Myclass(int x){
    this.x = x;
  }

  public Myclass() {
    this(0);
  }

  public static void main(String[] args) {
    Myclass obj = new Myclass();
    System.out.println(obj.x);
  }
}