package rysowanie;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Co chcesz narysować? (rectangle / square / tree)");
        String chose = sc.nextLine().toLowerCase(Locale.ROOT);
        Drawable drawable = null;
        switch (chose) {
            case "rectangle" -> drawable = createRectangle();
            case "square" -> drawable = createSquare();
            case "tree" -> drawable = createTree();
            default -> System.out.println("Taki kształt nie istnieje");
        }
        if (drawable != null) {
            drawable.draw();
        }

    }

    private static Tree createTree() {
        System.out.println("Podaj wysokość");
        int h = sc.nextInt();
        sc.nextLine();
        return new Tree(h);
    }

    private static Square createSquare() {
        System.out.println("Podaj długość boku");
        int a = sc.nextInt();
        sc.nextLine();
        return new Square(a);
    }

    private static Rectangle createRectangle() {
        System.out.println("Podaj długość pierwszego boku");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj długość drugiego boku");
        int b = sc.nextInt();
        sc.nextLine();
        return new Rectangle(a,b);
    }
}
