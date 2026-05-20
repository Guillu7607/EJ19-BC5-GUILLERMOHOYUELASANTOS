package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Abrir ventana secundaria");

        btn.setOnAction(e -> {
            Stage secondaryStage = new Stage();
            secondaryStage.setTitle("Soy la ventana secundaria");

            StackPane secondaryLayout = new StackPane();
            secondaryLayout.getChildren().add(new Button("Nueva ventana"));
            Scene secondaryScene = new Scene(secondaryLayout, 300, 200);

            secondaryStage.setScene(secondaryScene);

            secondaryStage.initOwner(primaryStage);

            secondaryStage.show();
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Ventana Principal");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}