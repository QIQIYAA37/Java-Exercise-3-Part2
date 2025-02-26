package Program_java.Slice_o_Heaven;

public class Info {
    public String storeName;
    public String storeAddress;
    public String storeEmail;
    public String storePhone;
    public String storeMenu;
    public String pizzaIngredients;
    public double pizzaPrice;
    public String sides;
    public String drinks;
    private String orderID;
    private double orderTotal;
    public static final String DEF_ORDER_ID = "DEF-SOH-099";
    public static final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    public static final double DEF_PIZZA_TOTAL = 15.00; 

    public String getOrderID() {
        return orderID;
    }

    public double getorderTotal() {
        return orderTotal;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    
    public void setorderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Info(){
        this.orderID = DEF_ORDER_ID;
        this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
        this.orderTotal = DEF_PIZZA_TOTAL;
    }

    public Info(String orderID, String pizzaIngredients, double orderTotal) {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
    }

    public Info(String name, String address, String email, String phone, String menu, String ingredients, double price, String side, String drink, String orderID, double orderTotal) {
        this.storeName = name;
        this.storeAddress = address;
        this.storeEmail = email;
        this.storePhone = phone;
        this.storeMenu = menu;
        this.pizzaIngredients = ingredients;
        this.pizzaPrice = price;
        this.sides = side;
        this.drinks = drink;
        this.orderID = orderID;
        this.orderTotal = orderTotal;
    }
    public void takeOrder(String storeMenu, String pizzaIngredients, double pizzaPrice, String sides, String drinks) {
        System.out.println("Order taken for " + storeMenu);
        System.out.println("Pizza Ingredients: " + pizzaIngredients);
        System.out.println("Pizza Price: " + pizzaPrice);
        System.out.println("Sides: " + sides);
        System.out.println("Drinks: " + drinks);
        printReceipt(storeName, storeAddress, storePhone, storeEmail, orderID, orderTotal);
    }
    
    public void makePizza(String pizzaIngredients) {
        System.out.println("Making pizza with " + pizzaIngredients);
    }

    private void printReceipt(String storeName, String storeAddress, String storePhone, String storeEmail, String orderID, double orderTotal) {
        System.out.println("********RECEIPT********");
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Address: " + storeAddress);
        System.out.println("Store Phone: " + storePhone);
        System.out.println("Store Email: " + storeEmail);
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Total: " + orderTotal);
    }
    
}
