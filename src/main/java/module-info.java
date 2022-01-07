module com.rbpo.dnevnik {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.rbpo.dnevnik to javafx.fxml;
    exports com.rbpo.dnevnik;
}