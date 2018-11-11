package HelloWorld;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lovecraft is trendy");
        Button btn = new Button();
        btn.setText("Save me!");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("You can't");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("Cthulu awaits");
        primaryStage.setScene(new Scene(root, 1920, 1080));
        primaryStage.show();
    }
}