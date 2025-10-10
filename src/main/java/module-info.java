module com.idmc.projetbiblio {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens com.idmc.projetbiblio to javafx.fxml;
    exports com.idmc.projetbiblio;
}