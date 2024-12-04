package com.brh.commandpatternfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    private TextArea actionText;
    private Car car;

    @FXML
    private void initialize(){
        car = new Car();
    }

    @FXML
    protected void onLeftClick() {
        String action = car.moveLeft()+"\n";
        actionText.appendText(action);
    }

    @FXML
    protected void onRightClick() {
        String action = car.moveRight()+"\n";
        actionText.appendText(action);
    }

    @FXML
    protected void onForwardClick() {
        String action = car.moveForward()+"\n";
        actionText.appendText(action);
    }

    @FXML
    protected void onBackClick() {
        String action = car.moveBack()+"\n";
        actionText.appendText(action);
    }

    @FXML
    protected void onReplayClick() {
        System.out.println("Hier sollen alle Commands wiederholt werden");


    }




}