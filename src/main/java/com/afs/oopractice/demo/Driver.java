package com.afs.oopractice.demo;

import lombok.Data;

@Data
class Driver {

    Vehicle vehicle;

    Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    void drive(){
        this.vehicle.speedUp();
    }


}
