package Game;


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Game extends Application{
    GameState gameState;

    protected void loadContent(){
        Image background = new Image("file:resources/background.png");
        Image mine_cart = new Image("file:resources/mine_cart.png");
        Image product_box = new Image("file:resources/product_box.png");
        Image volvo = new Image("file:resources/volvo.png");
        Image mine = new Image("file:resources/mine.png");
        Image ikea = new Image("file:resources/ikea.png");
        Image ore_container = new Image("file:resources/ore_container.png");
        Image product_container = new Image("file:resources/product_container.png");

        gameState = new GameState(background, mine_cart, product_box, volvo, mine, ikea, ore_container, product_container);
    }

    @Override
    public void start(Stage stage){
        stage.setTitle("INFDEV02-3 - Assignment 1");

        Group root = new Group();
        Scene theScene = new Scene( root, Color.LIGHTGREEN );
        stage.setScene( theScene );

        Canvas canvas = new Canvas( 800, 800 );
        root.getChildren().add( canvas );
        GraphicsContext gc = canvas.getGraphicsContext2D();

        loadContent();
        stage.show();
        //this acts as the main loop
        new AnimationTimer(){
            @Override
            public void handle(long currentNanoTime){
                //clear the canvas before painting over it
                
                gc.clearRect(0,0,canvas.getWidth(),canvas.getHeight());
                
                gameState.draw(gc);
                gameState.update(0.3f);
            }
        }.start();
    }

    public static void main(String[] args) {
        launch();
    }
}
