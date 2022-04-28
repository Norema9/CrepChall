import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Ingredient {
    private int X;
    private int Y;
    private String name;
    private String ingredientImageFile;
    private ImageView ingredientImageView;

    public Ingredient(String name, String ingredientImageFile) {
        this.name = name;
        this.ingredientImageFile = ingredientImageFile;
        Image ingredientImage = new Image(this.ingredientImageFile);
        this.ingredientImageView = new ImageView(ingredientImage);
    }

    public void update(){

    }

    // The getters of this classes
    public int getX() { return X; }
    public int getY() { return Y; }
    public ImageView getIngredientImageView() { return ingredientImageView; }

    // The setters of this classes
    public void setX(int x) { X = x; }
    public void setY(int y) { Y = y; }
}
