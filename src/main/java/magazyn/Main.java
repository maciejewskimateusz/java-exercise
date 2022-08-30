package magazyn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Podaj nazwe pliku z danymi:");
        String fileName = scanner.nextLine();
        Map<String, Integer> products = readProductsFromFile(fileName);
        printStats(products);
    }

    private static void printStats(Map<String, Integer> products) {
        products.forEach((k, v) -> System.out.printf("%-30s (%d) %s \n", k, v, getStars(v)));
    }

    private static String getStars(int number) {
        int round = (number + 5) / 10;
        return String.join("", Collections.nCopies(round, "*"));
    }

    private static List<String> readFile(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            System.err.println("No such file");
        }
        return new ArrayList<>();
    }

    private static Map<String, Integer> readProductsFromFile(String fileName) {
        List<String> products = readFile(fileName);
        Map<String, Integer> result = new HashMap<>();
        for (String product : products) {
            String[] element = product.split(";");
            result.put(element[0], Integer.valueOf(element[1]));
        }
        return result;
    }
}
