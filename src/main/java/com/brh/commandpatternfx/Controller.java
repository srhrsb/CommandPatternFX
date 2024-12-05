package com.brh.commandpatternfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

public class Controller {
    @FXML
    private TextArea actionText;
    private Car car;
    private ArrayList<Command> commandList;
    private Invoker invoker;

    private Command forward, back, right, left;

    @FXML
    private void initialize(){

        car = new Car();
        invoker = new Invoker();
        commandList = new ArrayList<>();

        forward = new ForwardCmd( car );
        left = new LeftCmd( car );
        right = new RightCmd( car );
        back = new BackCmd( car );
    }

    @FXML
    protected void onLeftClick(){
        String action = invoker.invoke(left)+"\n";
        actionText.appendText(action);
        commandList.add(left);
    }

    @FXML
    protected void onRightClick() {
        String action = invoker.invoke(right)+"\n";
        actionText.appendText(action);
        commandList.add(right);
    }

    @FXML
    protected void onForwardClick() {
        String action = invoker.invoke(forward)+"\n";
        actionText.appendText(action);
        commandList.add(forward);
    }

    @FXML
    protected void onBackClick() {
        String action = invoker.invoke(back)+"\n";
        actionText.appendText(action);
        commandList.add(back);
    }

    @FXML
    protected void onReplayClick() {
        //ToDo: alle Kommandos aus der Commandlist wiederholen
        for( Command cmd : commandList){
            String action = invoker.invoke(cmd)+"\n";
            actionText.appendText(action);
        }
    }




}