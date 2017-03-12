package View;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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

        Button submit = new Button("Submit");

        Label nameLabel = new Label("Insert Name");
        Label weightLabel = new Label("Insert Weight");
        Label heightLabel = new Label("Insert Height");
        Label ageLabel = new Label("Insert Age");

        TextField nameField = new TextField();
        TextField weightField = new TextField();
        TextField heightField = new TextField();
        TextField ageField = new TextField();


        grid.add(nameLabel, 3,1 );
        grid.add(weightLabel, 3, 2);
        grid.add(heightLabel, 3, 3);
        grid.add(ageLabel, 3, 4);

        grid.add(nameField, 4, 1);
        grid.add(weightField, 4, 2);
        grid.add(heightField, 4, 3);
        grid.add(ageField, 4, 4);



        grid.add(submit, 4, 5);

        root.getChildren().add(grid);

        stage.setScene(scene);
        stage.show();

    }
}
