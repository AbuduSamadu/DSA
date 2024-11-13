package Weeks.week1;

public class Bakery {

    CupCake cake;
    String giveTotal;
    double price;

    public Bakery(CupCake cakes, double price) {
        this.cake = cakes;
        this.price = price;

        giveTotal = "The total price for a " + cake.flavour + " cupcake is " + price;

    }

    public static void main(String[] args) {
        CupCake cupcake = new CupCake("Vanilla", true);
        Bakery bakery = new Bakery(cupcake, 5.00);
        System.out.println(bakery.giveTotal);
    }

}


            