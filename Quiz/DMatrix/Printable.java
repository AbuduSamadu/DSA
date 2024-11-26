interface Printable {
  void print();
}

class Student implements Printable {
  public void print() {
    System.out.println("Hello");
  }
}
