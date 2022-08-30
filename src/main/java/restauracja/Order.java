package restauracja;

import java.util.List;

public class Order {

    private List<Dish> dishes;
    private PaymentService paymentService = new PaymentService();

    public Order(List<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        double orderSum = paymentService.calculateOrderSum(dishes);
        double serviceCost = paymentService.calculateServiceCost(orderSum);
        double totalSum = orderSum + serviceCost;
        return String.format("""
                Do zapłaty: %.2f, w tym:\s
                Koszt dań %.2f\s
                Koszt obsługi: %.2f""", totalSum, orderSum, serviceCost);
    }
}
