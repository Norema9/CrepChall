import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    OrderGamePlayGroup orderGamePlayGroup = new OrderGamePlayGroup();
    CookingGamePlayGroup cookingGamePlayGroup = new CookingGamePlayGroup();

    private Stage stage = new Stage();

    Scene orderScene = new Scene(orderGamePlayGroup);
    Scene cookingScene = new Scene(cookingGamePlayGroup);

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage = this.stage;
        orderGamePlayGroup.start();
        cookingGamePlayGroup.start();

        primaryStage.show();
    }
}
