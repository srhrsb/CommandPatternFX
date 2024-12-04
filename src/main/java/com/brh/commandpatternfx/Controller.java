package com.brh.commandpatternfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label actionText;
    private Car car;

    @FXML
    private void initialize(){
        car = new Car();
    }

    @FXML
    protected void onLeftClick() {
        String action = car.moveLeft();
        actionText.setText(action);
    }

    @FXML
    protected void onRightClick() {
        String action = car.moveRight();
        actionText.setText(action);
    }

    @FXML
    protected void onForwardClick() {
        String action = car.moveForward();
        actionText.setText(action);
    }

    @FXML
    protected void onBackClick() {
        String action = car.moveBack();
        actionText.setText(action);
    }




}