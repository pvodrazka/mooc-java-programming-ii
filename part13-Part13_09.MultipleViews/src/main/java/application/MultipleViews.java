package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        VBox vbox = new VBox();
        BorderPane pane = new BorderPane();
        Scene first = new Scene(pane);
        Scene second = new Scene(vbox);
        Scene third = new Scene(grid);
        Label text = new Label("First view!");
        Label text2 = new Label("Second view!");
        Label text3 = new Label("Third view!");
        Button button = new Button("To the second view!");
        Button button2 = new Button("To the third view!");
        Button button3 = new Button("To the first view!");

        pane.setTop(text);
        pane.setCenter(button);

        vbox.getChildren().add(button2);
        vbox.getChildren().add(text2);

        grid.add(text3, 0, 0);
        grid.add(button3, 1, 1);

        button.setOnAction((event) -> {
            stage.setScene(second);
        });

        button2.setOnAction((event) -> {
            stage.setScene(third);
        });

        button3.setOnAction((event) -> {
            stage.setScene(first);
        });

        stage.setScene(first);
        stage.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
