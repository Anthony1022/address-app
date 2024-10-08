package dev.niss.app.about;

import dev.niss.core.controller.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AboutUsController extends Controller {

    @FXML
    private ImageView image;
    @FXML
    private Label authorlabel;
    @FXML
    private Label addresslabel;
    @FXML
    private Label email;
    @FXML
    private Label celllabel;

    @Override
    protected void load_fields() {

    }

    @Override
    protected void load_bindings() {

        image.setImage(new Image(
                getClass().getResource("/dev/niss/assets/img/raicon.png")
                        .toExternalForm()));
    }

    @Override
    protected void load_listeners() {

    }

}
