package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {

        // 1. Creating the view for asking a password

        // 1.1 Creating components to be used
        Label instructionText = new Label("Enter your name and start.");
        PasswordField passwordField = new PasswordField();
        Button startButton = new Button("Start");
        Label errorMessage = new Label("");

        // 1.2 creating layout and adding components to it
        GridPane layout = new GridPane();

        layout.add(instructionText, 0, 0);
        layout.add(passwordField, 0, 1);
        layout.add(startButton, 0, 2);
        layout.add(errorMessage, 0, 3);

        // 1.3 styling the layout
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        // 1.4 creating the view itself and setting it to use the layout
        Scene passwordView = new Scene(layout);


        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);

        welcomeLayout.setAlignment(Pos.CENTER);


        Label welcomeText = new Label("");
        welcomeLayout.getChildren().add(welcomeText);
        Scene welcomeView = new Scene(welcomeLayout);
        // 3. Adding an event handler to the login button.
        // The view is changed if the password is right.
        startButton.setOnAction((event) -> {

            welcomeText.setText("Welcome " + passwordField.getText() + "!");
            window.setScene(welcomeView);
        });
// 2. Creating a view for showing the welcome message

        window.setScene(passwordView);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}