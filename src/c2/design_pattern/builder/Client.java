package c2.design_pattern.builder;

public class Client {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
                .orderSauce(SauceType.SOY_SAUCE).build();
        System.out.println(order);
    }
}
