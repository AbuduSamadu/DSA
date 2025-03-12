package Weeks.week6;

public class Gen<T> {
  private final T value;

  public Gen(T value){
    this.value = value;
  }
  
  T getObj(){
    return value;
  }

  void showType() {
    System.out.println("Type of T is " + value.getClass().getName());
  }
  
  public static void main(String[] args) {
    Gen<Integer> iob = new Gen<>(88);
    iob.showType();

    int v = iob.getObj();
    System.out.println("Value of " + v );

    Gen<String> StrObj = new Gen<>("Generic Type");
    StrObj.showType();

    String s = StrObj.getObj();
    System.out.println("Value of " + s );
  }
}

