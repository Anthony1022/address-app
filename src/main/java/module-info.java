module niss.addressapp {
    requires transitive javafx.controls;
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.graphics;

    requires jakarta.xml.bind;

    requires java.prefs;

    requires net.datafaker;

    opens dev.niss.app to javafx.fxml;
    opens dev.niss.app.overview to javafx.fxml;
    opens dev.niss.app.overview.form to javafx.fxml;
    opens dev.niss.models.person to jakarta.xml.bind;
    opens dev.niss.app.about to javafx.fxml;

    exports dev.niss;
    exports dev.niss.models.person;
    exports dev.niss.libs.xml.adapter;
}
