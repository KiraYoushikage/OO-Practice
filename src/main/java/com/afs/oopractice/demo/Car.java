package com.afs.oopractice.demo;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Car extends Vehicle {
    private Engine engine;

    EEEngine eeEngine;

    public Car(String name,Engine engine) {
        super(name,engine.getMaxSpeed());
        this.engine = engine;
    }
    Car(String name, int speed) {
        super(name,speed);
        this.engine = engine;
    }

    public Car() {
        super();
    }
}
