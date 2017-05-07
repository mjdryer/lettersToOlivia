package design;


import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class panesScenes {

    public static Scene menuScene;
    public static Pane menuPane;


    public static void configurePanes(){

        menuPane = new Pane();
    }

    public static void configureScenes(){

        menuScene = new Scene(menuPane, 500, 700);
    }




}
