package rysowanie;

public class Tree implements Drawable {

    private int height;

    public Tree(final int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        int spaces = height - 1;
        int stars = 1;
        for (int i = 0; i < height; i++) {
            drawSpaces(spaces);
            drawStars(stars);
            stars += 2;
            spaces--;
            System.out.println("");
        }
    }

    private void drawStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
    }

    private void drawSpaces(int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }

}
