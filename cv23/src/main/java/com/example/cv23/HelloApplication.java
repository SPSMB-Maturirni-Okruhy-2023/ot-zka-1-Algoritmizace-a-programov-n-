package com.example.cv23;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    Rectangle rectangle;

    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        Canvas c = new Canvas(600, 400);
        GraphicsContext gc = c.getGraphicsContext2D();
        root.getChildren().add(c);
        Scene scene = new Scene(root, 600,400);
        scene.addEventFilter(KeyEvent.KEY_PRESSED, key -> {
            onKeyPressed(key.getCode());
        });
        rectangle = new Rectangle();
        new AnimationTimer() {
            long lastTick = 0;
            @Override
            public void handle(long now) {
                if (now - lastTick > 10000) {
                    lastTick = now;
                    tick(gc);
                }
            }
        }.start();
        stage.setScene(scene);
        stage.setTitle("Cvičení 23");
        stage.show();
    }

    private void tick(GraphicsContext gc) {
        gc.clearRect(0, 0, 600, 400);
        gc.fillRect(rectangle.x, rectangle.y, 50,50);

    }

    private void onKeyPressed(KeyCode code) {
        switch (code){
            case W -> rectangle.up();
            case A -> rectangle.left();
            case S -> rectangle.down();
            case D -> rectangle.right();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}