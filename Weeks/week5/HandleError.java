package Weeks.week5;

import java.util.Random;

public class HandleError {
    public static void main(String[] args){
        int a= 0, b=0, c=0;
        Random r = new Random();

        for(int i=0; i<3200; i++){
            try{
                b= r.nextInt();
                c = r.nextInt();
                a= 1234 /(b/c);
            }catch (ArithmeticException e){
                System.out.println("Division by zero");
                a= 0;
            }
            System.out.println("a: " + a);
        }
    }
}
