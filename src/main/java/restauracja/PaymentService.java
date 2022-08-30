package restauracja;

import java.util.List;

public class PaymentService {

    public static final double LOW_TIP = 0.1;
    public static final double HIGH_TIP = 0.15;

    public double calculateOrderSum(List<Dish> dishes) {
        return dishes.stream().mapToDouble(Dish::getPrice).sum();
    }

    public double calculateServiceCost(double price) {
        if (price > 100) {
            return price * LOW_TIP;
        } else {
            return price * HIGH_TIP;
        }
    }
}
