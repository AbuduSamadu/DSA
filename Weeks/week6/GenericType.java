package Weeks.week6;

public class GenericType<T> {
    private T type;


    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public static void main(String[] args) {
        GenericType<String> stringType = new GenericType<>();
        stringType.setType("Hello");
        System.out.println(stringType.getType());

        GenericType<Integer> integerType = new GenericType<>();
        integerType.setType(5);
        System.out.println(integerType.getType());

        GenericType type1 = new GenericType();
        type1.setType("Hello");
        type1.setType(5);

        type1.setType(true);
    }

}
