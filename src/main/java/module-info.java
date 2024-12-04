module com.brh.commandpatternfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.brh.commandpatternfx to javafx.fxml;
    exports com.brh.commandpatternfx;
}