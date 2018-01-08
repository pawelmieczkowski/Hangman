import javafx.application.Platform;
import javafx.event.ActionEvent;

public class LauncherController {
    public void exitGameButton(ActionEvent actionEvent) {
    Platform.exit();
    }

    public void playGameButton(ActionEvent actionEvent) {
        VistaNavigator.loadVista(VistaNavigator.VISTA_2);
    }
}