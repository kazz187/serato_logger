package zone.kaz.dj.serato_logger;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindow {

    static private final String resourceFilename = "Main.fxml";
    private Stage stage;

    public MainWindow(Stage stage) {
        this.stage = stage;
        stage.setTitle("Serato Logger");
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource(resourceFilename));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
