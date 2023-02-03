package textstatistics;


import javafx.application.Application;

import static javafx.application.Application.launch;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;


public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        HBox textComponents = new HBox();
        textComponents.setSpacing(10);
        Label chars = new Label("");
        Label words = new Label("");
        Label longest = new Label("");
        TextArea text = new TextArea();

        text.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int wordz = parts.length;
            String loongest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            chars.setText("Letters: " + characters);
            words.setText("Words: " + wordz);
            longest.setText("The longest word is: " + loongest);

        });


        textComponents.getChildren().add(chars);
        textComponents.getChildren().add(words);
        textComponents.getChildren().add(longest);


        layout.setCenter(text);
        layout.setBottom(textComponents);


        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}

