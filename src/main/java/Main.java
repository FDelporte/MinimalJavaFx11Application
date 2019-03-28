import java.time.LocalDateTime;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    // We need a private variable so we can change the text on a click on the button.
    private Label clicked;

    @Override
    public void start(Stage stage) {
        // Requesting the Java versions used by the application
        final String versionJava = System.getProperty("java.version");
        final String versionJavaFX = System.getProperty("javafx.version");

        // Show Java versions in a label
        Label versions = new Label("Java: " + versionJava + ", JavaFX: " + versionJavaFX);
        versions.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");

        // Text label in which a text will be displayed when you click on the button
        this.clicked = new Label();
        this.clicked.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");

        // Button to have some interaction
        Button button = new Button("Click me");
        button.setStyle("-fx-text-fill: black; -fx-font-size: 14px;");
        button.setOnAction(e -> clicked.setText("You clicked me on " + LocalDateTime.now().toString()));

        // Holder to align the items vertically
        VBox holder = new VBox(versions, button, this.clicked);
        holder.setSpacing(20);
        holder.setPadding(new Insets(0, 20, 10, 20));
        holder.setAlignment(Pos.CENTER);
        holder.setStyle("-fx-background-color: darkblue");

        // The scene which is the "root" of our application
        Scene scene = new Scene(holder, 400, 300);

        // The top level JavaJX container
        stage.setTitle("Minimal JavaFX 11 application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}