package com.afs.oopractice.demo;

import lombok.Data;

@Data
class Vehicle {

    private String name;
    private int speed;

    Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void speedUp(){
        System.out.println(String.format("%s : speed up to max speed - %d km/h\n",name,speed));
    }

    Vehicle() {
    }
}
