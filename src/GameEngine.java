import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

enum GameState{MENU, ORDER, COOKING}
public class GameEngine {

    private GameState gameState = GameState.MENU;

    public GameEngine(){} // The constructor

    public void update(ArrayList<String> input, Stage stage, Scene orderScene, Scene cookingScene){
        switch (gameState){
            case MENU:
                if(!input.isEmpty()){
                    gameState = GameState.ORDER;  // must be modified
                    stage.setScene(orderScene);
                }
                break;
            case ORDER:
                // something must be added here
                break;
            case COOKING:
                // something must be added here
                break;
        }
    }
}
