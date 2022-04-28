public class Ingredient {
    private int X;
    private int Y;
    private final String name;
    private final String ingredientFile;

    public Ingredient(String name, String ingredientFile) {
        this.ingredientFile = ingredientFile;
        this.name = name;
    }

    public void update(){

    }

    // The getters of this classes
    public int getX() { return X; }
    public int getY() { return Y; }

    // The setters of this classes
    public void setX(int x) { X = x; }
    public void setY(int y) { Y = y; }
}
