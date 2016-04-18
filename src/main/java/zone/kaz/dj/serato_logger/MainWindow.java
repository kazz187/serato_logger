package zone.kaz.dj.serato_logger;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindow {

    static private final String RESOURCE_FILENAME = "Main.fxml";
    static private final int WINDOW_WIDTH = 800;
    static private final int WINDOW_HEIGHT = 600;
    private Stage stage;

    public MainWindow(Stage stage) {
        this.stage = stage;
        stage.setTitle("Serato Logger");
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource(RESOURCE_FILENAME));

        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setScene(new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT));
    }

    public void show() {
        stage.show();
    }

}
