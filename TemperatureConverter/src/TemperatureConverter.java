import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TemperatureConverter extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Temperature Converter");

        // UI Elements
        Label label = new Label("Enter Temperature:");
        TextField input = new TextField();
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Celsius to Fahrenheit", "Fahrenheit to Celsius");
        comboBox.getSelectionModel().selectFirst();

        Button convertBtn = new Button("Convert");
        Label result = new Label();

        // Event Handler
        convertBtn.setOnAction(e -> {
            try {
                double temp = Double.parseDouble(input.getText());
                String choice = comboBox.getValue();
                double converted;

                if (choice.equals("Celsius to Fahrenheit")) {
                    converted = (temp * 9 / 5) + 32;
                    result.setText(String.format("Result: %.2f °F", converted));
                } else {
                    converted = (temp - 32) * 5 / 9;
                    result.setText(String.format("Result: %.2f °C", converted));
                }
            } catch (NumberFormatException ex) {
                result.setText("Invalid input. Please enter a number.");
            }
        });

        // Layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, input, comboBox, convertBtn, result);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");

        // Scene
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Main Method
    public static void main(String[] args) {
        launch(args);
    }
}
