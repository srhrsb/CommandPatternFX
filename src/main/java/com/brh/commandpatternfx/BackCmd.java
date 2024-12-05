package com.brh.commandpatternfx;

public class BackCmd implements Command{

    private Car car;

    public BackCmd( Car car){
        this.car = car;
    }

    @Override
    public String execute() {
       return car.moveBack();
    }
}
