package com.example.cv_20;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static final int SCREEN_WIDTH = 1900;
    public static final int SCREEN_HEIGHT = 920;
    GraphicsContext graphicsContext;

    double[] upperHalfX = new double[] {100,200,150};
    double[] upperHalfY = new double[] {100,100,200};
    double[] bottomHalfX = new double[] {100,200,150};
    double[] bottomHalfY = new double[] {300,300,200};

    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();
        Canvas canvas = new Canvas(SCREEN_WIDTH, SCREEN_HEIGHT);
        root.getChildren().add(canvas);
        graphicsContext = canvas.getGraphicsContext2D();
        Scene scene = new Scene(root, SCREEN_WIDTH, SCREEN_HEIGHT);

        stage.setTitle("cv 20 Přesýpací hodiny");
        stage.setScene(scene);
        stage.show();

        AnimationTimer animationTimer = new AnimationTimer() {
            long lastTick = 0;

            @Override
            public void handle(long now) {
                if (now - lastTick > 1000000l) {
                    lastTick = now;
                    tick();
                }
            }
        };
        animationTimer.start();
    }

    private void tick() {
        graphicsContext.fillPolygon( upperHalfX, upperHalfY,3);
        graphicsContext.fillPolygon( bottomHalfX, bottomHalfY,3);
        graphicsContext.setFill(Color.RED);
    }


    public static void main(String[] args) {
        launch();
    }
}