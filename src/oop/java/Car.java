package oop.java;

public class Car {

    private float speed;
    private float distance;
    private float time;

    public float gettime() {

        this.time = distance / speed;
        return time;
    }

    public void setspeed(float speed) {

        this.speed = speed;
    }

    public void setdistance(float distance) {

        this.distance = distance;
    }

}
