package com.softserve.homework7.task2;

public class Boat extends WaterVehicle {

    private int volume;

    public Boat() {
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("Boat is sailing");
    }
}
