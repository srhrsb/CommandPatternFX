package com.brh.commandpatternfx;

public class LeftCmd implements Command{

    private Car car;

    public LeftCmd( Car car){
        this.car = car;
    }

    @Override
    public String execute() {
        return car.moveLeft();
    }
}
