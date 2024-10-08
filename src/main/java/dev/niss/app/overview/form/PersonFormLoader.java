package dev.niss.app.overview.form;

import java.io.IOException;

import dev.niss.App;
import dev.niss.core.loader.Loader;
import dev.niss.models.person.Person;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PersonFormLoader extends Loader {
    public PersonFormLoader(App app) {
        super("overview/form/PERSON_FORM", app);
    }

    @Override
    public void load() {
        try {
            Parent root = loader.load();
            root.setOnMousePressed(e -> root.requestFocus());
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/dev/niss/assets/theme/SKIN.CSS")
                    .toExternalForm());
            Stage formStage = new Stage();

            formStage.setTitle("Address App - Information Form");
            formStage.getIcons().add(
                    new Image(getClass()
                            .getResource("/dev/niss/assets/img/favicon.png")
                            .toExternalForm()));
            formStage.initOwner(app.getApplicationStage());
            formStage.initModality(Modality.APPLICATION_MODAL);
            formStage.setResizable(false);
            formStage.setScene(scene);

            PersonFormController controller = loader.getController();
            if (params.isEmpty())
                controller.load(app, formStage);
            else
                controller.load(app, formStage, (Person) params.get(0));

            formStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
