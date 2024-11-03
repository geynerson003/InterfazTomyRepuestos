module com.uniminuto.interfaztomyrepuestos {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.uniminuto.interfaztomyrepuestos to javafx.fxml;
    exports com.uniminuto.interfaztomyrepuestos;
    exports com.uniminuto.interfaztomyrepuestos.controller;
    opens com.uniminuto.interfaztomyrepuestos.controller to javafx.fxml;
}