package rysowanie;

public class Square implements Drawable{

    private int a;

    public Square(final int a) {
        this.a = a;
    }

    @Override
    public void draw() {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
