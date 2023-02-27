public class PizzaTest {
    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new PizzaOrder("Карбонара", "Ленинградская 12", PizzaOrder.PizzaSize.BIG, true);
        System.out.println(pizzaOrder);

        System.out.println();

        pizzaOrder.setSauce(true);
        pizzaOrder.setSize(PizzaOrder.PizzaSize.BIG);

        System.out.println();

        pizzaOrder.order();
        System.out.println(pizzaOrder);

        System.out.println();

        pizzaOrder.cancel();
        pizzaOrder.cancel();
        System.out.println(pizzaOrder);

        System.out.println();

        pizzaOrder.setAddress("Псковская 9В");
        pizzaOrder.order();
        pizzaOrder.order();
        System.out.println(pizzaOrder);
    }
}