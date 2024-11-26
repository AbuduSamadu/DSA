
public class Outer {
private int x = 10;
    class Inner {

        void display() {
            System.out.println("Value of x is " + x);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
    

}
