package restauracja;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RestaurantApp {

    public static void main(String[] args) {

        System.out.println("Witaj w naszej restauracji");
        printMenu();
        Order order = takeOrder();
        printSummary(order);
    }

    private static void printSummary(Order order) {
        System.out.println(order);
    }

    private static Order takeOrder() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] split = line.replaceAll(" ", "").split(",");
        List<Integer> integerList = Arrays.stream(split)
                .map(Integer::valueOf).toList();
        List<Dish> dishes = Menu.convertIdsToDishes(integerList);
        return new Order(dishes);
    }

    private static void printMenu() {
        Menu.MENU.forEach(System.out::println);
        System.out.println("Zamów wybrane potrawy, wymieniając ich numery po przecinku:");
    }
}
