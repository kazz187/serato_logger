package zone.kaz.dj.serato_logger;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApplication extends Application {

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        MainWindow mainWindow = new MainWindow(primaryStage);
        mainWindow.show();
    }

}
