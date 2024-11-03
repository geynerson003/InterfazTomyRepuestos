package com.uniminuto.interfaztomyrepuestos.controller;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class MenuController {
    @FXML
    private VBox menuExpandido, menuExpandido2;
    @FXML
    private ImageView iconoVentas, iconoInventario, iconoClientesProveedores, iconoReportes, iconoConfiguraciones, iconoAyuda, iconoSalir;

    private boolean isExpanded = false;

    @FXML
    private void initialize() {
        // Puedes asignar las imágenes de los íconos aquí
        iconoVentas.setImage(new Image(getClass().getResource("/img/contrato (1).png").toExternalForm()));
        iconoInventario.setImage(new Image(getClass().getResource("/img/inventario (1).png").toExternalForm()));
        iconoClientesProveedores.setImage(new Image(getClass().getResource("/img/clientes.png").toExternalForm()));
        iconoReportes.setImage(new Image(getClass().getResource("/img/informe (1).png").toExternalForm()));
        iconoConfiguraciones.setImage(new Image(getClass().getResource("/img/configuraciones.png").toExternalForm()));
        iconoAyuda.setImage(new Image(getClass().getResource("/img/ayuda.png").toExternalForm()));
        iconoSalir.setImage(new Image(getClass().getResource("/img/cerrar-sesion.png").toExternalForm()));
    }

    @FXML
    private void toggleMenu() {
        isExpanded = !isExpanded;
        menuExpandido.setVisible(isExpanded);
    }

    @FXML
    private void toggleMenuDos() {
        isExpanded = !isExpanded;
        menuExpandido2.setVisible(isExpanded);
    }
}
