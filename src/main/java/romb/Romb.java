package romb;

public class Romb {
    public static void main(String[] args) {

        draw(15);
    }

    private static void draw(int size) {
        for (int i = 0; i < size; i++) {
            drawSpaces(size - 1 - i);
            drawStars(size);
            System.out.println();
        }
    }

    private static void drawStars(int stars) {
        for (int i = 0; i < stars; i++)
            System.out.print("*");
    }

    private static void drawSpaces(int spaces) {
        for (int i = 0; i < spaces; i++)
            System.out.print(" ");
    }
}
