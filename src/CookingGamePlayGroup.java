import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class CookingGamePlayGroup extends Group {
    private String cookingBackGroundFile;  // must be defined before testing the class
    private Image cookingBackGroundImage = new Image(cookingBackGroundFile);
    private ImageView cookingBackGroundImageView = new ImageView(cookingBackGroundImage);
    private ArrayList<Ingredient> allIngredients; // this list must be filed in the constructor method using a file

    public CookingGamePlayGroup(){
        this.getChildren().add(cookingBackGroundImageView);
        for(Ingredient ingredient : allIngredients){
            this.getChildren().add(ingredient.getIngredientImageView());
        }
    }

    // to launch the animationTimer of this group
    public void start(){ at.start(); }
    AnimationTimer at = new AnimationTimer() {
        @Override
        public void handle(long l) {
            for(Ingredient ingredient : allIngredients){
                ingredient.update();
            }
        }
    };

    // A methode to update the scene : change in the characteristics in the project
    public void render(long l){
        // beginning by placing the background image
        cookingBackGroundImageView.setViewport(new Rectangle2D(0,0,400,400));
    }
}
