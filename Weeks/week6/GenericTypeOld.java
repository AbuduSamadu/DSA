package Weeks.week6;

public class GenericTypeOld {
    private Object t;

    public Object getT() {
        return t;
    }

    public void setT(Object t) {
        this.t = t;
    }

    public static void main(String[] args) {
       GenericTypeOld type = new GenericTypeOld();
       type.setT("Hello");
       String str = (String) type.getT();
        System.out.println(str);
    }
}
