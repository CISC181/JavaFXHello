package application.javafx.button;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

/**
 * Shows a simple JavaFX Button FXML example. The Button is declared in the assets/fxml/button-example.fxml file
 */
public class ButtonFXMLExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader();

    	loader = new FXMLLoader(getClass().getResource("/assets/fxml/button-example.fxml"));
    	
   	
        ButtonFXMLController controller = new ButtonFXMLController();
        loader.setController(controller);

        
        

        VBox vbox = loader.<VBox>load();
        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.setTitle("Button FXML Example");
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
        primaryStage.show();
    }
}
