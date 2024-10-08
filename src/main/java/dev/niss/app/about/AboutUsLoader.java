package dev.niss.app.about;

import java.io.IOException;

import dev.niss.App;
import dev.niss.core.loader.Loader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AboutUsLoader extends Loader {

    public AboutUsLoader(App app) {
        super("about/ABOUT_US", app);

    }

    @Override
    public void load() {
        try {
            StackPane root = loader.load();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/dev/niss/assets/theme/SKIN.css").toExternalForm());

            AboutUsController controller = loader.getController();
            controller.load(app);

            Stage aboutStage = new Stage();
            aboutStage.setTitle("Address App - About Us");
            aboutStage.getIcons()
                    .add(new Image(
                            getClass().getResource("/dev/niss/assets/img/favicon.png")
                                    .toExternalForm()));

            aboutStage.initOwner(app.getApplicationStage());
            aboutStage.initModality(Modality.APPLICATION_MODAL);
            aboutStage.setResizable(false);
            aboutStage.setScene(scene);
            aboutStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
