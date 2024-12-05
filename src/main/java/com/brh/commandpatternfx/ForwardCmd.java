package com.brh.commandpatternfx;

public class ForwardCmd implements Command{

    private Car car;

    public ForwardCmd( Car car){
        this.car = car;
    }

    @Override
    public String execute() {
        return car.moveForward();
    }
}
