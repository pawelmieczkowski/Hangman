

import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class VistaNavigator {
    public static final String MAIN = "main.fxml";
    public static final String VISTA_1 = "launcher.fxml";
    public static final String VISTA_2 = "game.fxml";

    private static MainController mainController;

    public static void setMainController(MainController mainController) {
        VistaNavigator.mainController = mainController;
    }

    public static void loadVista(String fxml) {
        try {
            mainController.setVistaHolder(
                    FXMLLoader.load(
                            VistaNavigator.class.getResource(
                                    fxml
                            )
                    )
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
