package rysowanie;

public class Rectangle implements Drawable{

    private int a;
    private int b;

    public Rectangle(final int a, final int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
