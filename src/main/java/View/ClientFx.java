package View;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.layout.GridPane;
import javafx.stage.*;

/**
 * Created by markuslyconhold on 12/03/17.
 */
public class ClientFx extends Application {

    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        Group root = new Group();
        stage.setTitle("FitnessMarker");
        Scene scene = new Scene(root);


        GridPane grid = new GridPane();

        grid.setPrefSize(650, 350);


        grid.setHgap(30);
        grid.setVgap(30);


        stage.setScene(scene);
        stage.show();

    }
}
