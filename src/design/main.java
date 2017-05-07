package design;


import javafx.application.Application;
import javafx.stage.Stage;

import static design.panesScenes.configurePanes;
import static design.panesScenes.configureScenes;
import static design.panesScenes.menuScene;

public class main extends Application {


    @Override
    public void start(Stage lettersToOlivia) throws Exception {
        lettersToOlivia = new Stage();
        lettersToOlivia.setTitle("Letters To You");
        configureEverything();
        lettersToOlivia.setScene(menuScene);
        lettersToOlivia.show();
    }

    private void configureEverything() {
        configurePanes();
        configureScenes();
    }

}
