package com.afs.oopractice.demo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Truck extends Vehicle {
    private Engine engine;

    Truck(String name, int speed) {
        super(name, speed);
    }
    public Truck(String name, Engine engine){
        super(name,engine.getMaxSpeed());
        this.engine=engine;
    }

}
