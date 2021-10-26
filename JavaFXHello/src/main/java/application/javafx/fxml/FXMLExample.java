package application.javafx.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

public class FXMLExample extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();

    	loader = new FXMLLoader(getClass().getResource("/assets/fxml/hello-world.fxml"));
    	
        MyFxmlController controller = new MyFxmlController();
        controller.setValue("New value");
        loader.setController(controller);


        VBox vbox = loader.<VBox>load();

        MyFxmlController controllerRef = loader.getController();
        System.out.println(controllerRef.getValue());
        System.out.println(controllerRef.getLabel1Text());
        System.out.println(controllerRef.getLabel2Text());

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
