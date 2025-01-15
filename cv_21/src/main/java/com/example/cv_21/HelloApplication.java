package com.example.cv_21;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloApplication extends Application {

    public static final int SCREEN_WIDTH = 600;
    public static final int SCREEN_HEIGHT = 500;
    GraphicsContext graphicsContext;
    int colorNumber = 1;

    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        Canvas canvas = new Canvas(SCREEN_WIDTH, SCREEN_HEIGHT);
        root.getChildren().add(canvas);
        graphicsContext = canvas.getGraphicsContext2D();
        Scene scene = new Scene(root, SCREEN_WIDTH, SCREEN_HEIGHT);
        stage.setTitle("cv 21  - Semafor");
        stage.setScene(scene);

        Timeline timeline = new Timeline(new KeyFrame(new Duration(1000), e -> switchLights()));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.playFromStart();
        stage.show();


    }

    private void switchLights() {
        colorNumber = colorNumber > 3 ? 1 : colorNumber;
        System.out.println("switchLights()");
        graphicsContext.setFill(Color.GRAY);
        graphicsContext.fillRect(90, 90, 120, 360);

        drawLight( 100, 100, colorNumber == 1 ? Color.RED : Color.BLACK);
        drawLight( 100, 220, colorNumber == 2 ? Color.ORANGE : Color.BLACK);
        drawLight( 100, 340, colorNumber == 3 ? Color.GREEN : Color.BLACK);

        colorNumber++;
    }

    private void drawLight(double x, double y, Color color) {
        graphicsContext.setFill(color);
        graphicsContext.fillOval(x, y, 100, 100);
    }


    public static void main(String[] args) {
        launch();
    }
}