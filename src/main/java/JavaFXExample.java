import java.time.LocalDateTime;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class JavaFXExample {
    // We need a private variable so we can change the text on a click on the button.
    private static Label clicked;

    public static VBox getHolder() {
        // Requesting the Java versions used by the application
        final String versionJava = System.getProperty("java.version");
        final String versionJavaFX = System.getProperty("javafx.version");

        // Show Java versions in a label
        Label versions = new Label("Java: " + versionJava + ", JavaFX: " + versionJavaFX);
        versions.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");

        // Text label in which a text will be displayed when you click on the button
        clicked = new Label();
        clicked.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");

        // Button to have some interaction
        Button button = new Button("Click me");
        button.setStyle("-fx-text-fill: black; -fx-font-size: 14px;");
        button.setOnAction(e -> clicked.setText("You clicked me on " + LocalDateTime.now().toString()));

        // Holder to align the items vertically
        VBox holder = new VBox(versions, button, clicked);
        holder.setSpacing(20);
        holder.setPadding(new Insets(0, 20, 10, 20));
        holder.setAlignment(Pos.CENTER);
        holder.setStyle("-fx-background-color: darkblue");

        return holder;
    }
}
