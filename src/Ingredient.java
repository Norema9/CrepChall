public class Ingredient {
    private int X;
    private int Y;
    private final String name;
    private final String ingrFile;

    public Ingredient(String name, String ingrFile) {
        this.ingrFile = ingrFile;
        this.name = name;
    }

    public void setX(int x) { X = x; }

    public void setY(int y) { Y = y; }

    public void update(){

    }
}
