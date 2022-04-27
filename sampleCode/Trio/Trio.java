public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }
     @Override
     public String getName() {
         return this.sandwich.getName()
         + '/' + this.salad.getName()
         + '/' + this.drink.getName()
         + " Trio";

     }

     public double getPrice() {
         return this.sandwich.getPrice() 
         + this.salad.getPrice()
         + this.drink.getPrice();
     }
}

