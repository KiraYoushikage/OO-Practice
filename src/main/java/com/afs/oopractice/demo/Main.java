package com.afs.oopractice.demo;

public class Main {
    public static void main(String[] args) {


        Car car=new Car("Car",120);
        Truck truck=new Truck("Truck",80);
        Driver driver=new Driver(car);
        driver.drive();

        // 换车开
        driver.setVehicle(truck);
        driver.drive();


        //给car 和 truck 添加各自的引擎
        GasonlineEngine gasonlineEngine=new GasonlineEngine();
        ElecticEngine electicEngine=new ElecticEngine();
        car.setEngine(electicEngine);
        truck.setEngine(gasonlineEngine);

        driver.setVehicle(car);
        driver.drive();

        driver.setVehicle(truck);
        driver.drive();



        car.setEeEngine(EEEngine.Electric);

        System.out.println();
    }
}
