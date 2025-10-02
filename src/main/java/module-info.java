module ludy.lab5tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens ludy.lab5tipcalculator to javafx.fxml;
    exports ludy.lab5tipcalculator;
}