package com.brh.commandpatternfx;

public class RightCmd implements Command{

    private Car car;

    public RightCmd( Car car){
        this.car = car;
    }

    @Override
    public String execute() {
        return car.moveRight();
    }
}
