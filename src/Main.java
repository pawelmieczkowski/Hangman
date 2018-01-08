import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hangman");
        primaryStage.setScene(createScene(
                loadMainPane()
        ));
        primaryStage.show();
    }

    private Pane loadMainPane() throws IOException {
        FXMLLoader loader = new FXMLLoader();

        Pane mainPane = (Pane) loader.load(
                getClass().getResourceAsStream(
                        VistaNavigator.MAIN
                )

        );

        MainController mainController = loader.getController();

        VistaNavigator.setMainController(mainController);
        VistaNavigator.loadVista(VistaNavigator.VISTA_1);

        return mainPane;
    }
    private Scene createScene(Pane mainPane) {
        return new Scene(
                mainPane
        );
    }


    public static void main(String[] args) {
        launch(args);
    }
}
