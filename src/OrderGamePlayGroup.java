import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class OrderGamePlayGroup extends Group {
    private Customer customer;
    private String OrderbackGroundGile;
    private Image OrderbackGroundImage = new Image(OrderbackGroundGile);
    private ImageView OrderbackGroundImageView = new ImageView(OrderbackGroundImage);

    public OrderGamePlayGroup(){
        this.getChildren().add(OrderbackGroundImageView);
    }

    // to launch the animationTimer of this group
    public void start(){ at.start(); }
    AnimationTimer at = new AnimationTimer() {
        @Override
        public void handle(long l) {
            customer.update(l);
        }
    };

    // A methode to update the scene : change in the characteristics in the project
    public void render(long l){
        // beginning by placing the background image
        OrderbackGroundImageView.setViewport(new Rectangle2D(0,0,400,400));
    }
    // The setters of this class
    public void setCustomer(Customer customer) { this.customer = customer; }
}
