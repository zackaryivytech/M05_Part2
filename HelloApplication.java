package com.example.m05_part2;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Create Circle
        Circle circle = new Circle(100, 100, 60);
        circle.setFill(Color.WHITE);

        //Add circle to pane
        Pane root = new Pane();
        root.getChildren().add(circle);

        //Create Scene
        Scene scene = new Scene(root, 320, 240);
        scene.setFill(Color.YELLOW);

        //Mouse press event
        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event){
                if(event.getButton() == MouseButton.PRIMARY)
                    circle.setFill(Color.BLACK);
            }
        });

        //Mouse released event
        scene.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton() == MouseButton.PRIMARY) {
                    circle.setFill(Color.WHITE); // Set color to white when mouse is released
                }
            }
        });

        //Stage config
        stage.setTitle("Circle");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}