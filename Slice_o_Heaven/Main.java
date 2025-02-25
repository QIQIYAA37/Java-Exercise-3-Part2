package Program_java.Slice_o_Heaven;

public class Main{
    public static void main(String[] args) {
        
        Info info = new Info("Slice O Heaven", "999 Heaven Street", "heaven@gmail.com", "1234567890", "cheesePizza", "Mozzarella Cheese", 15.00, "fries", "coke", "DEF-SOH-099", 99.00 );
        System.out.println("Taking Order");
        info.takeOrder(info.storeMenu, info.pizzaIngredients, info.pizzaPrice, info.sides, info.drinks);
        System.out.println("Making Pizza");
        info.makePizza(info.pizzaIngredients);
    }
}