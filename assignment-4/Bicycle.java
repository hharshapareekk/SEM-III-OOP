public class Bicycle implements Vehicle {
    int gear;
    int speed;

    Bicycle() {
        this.speed = 0;
        this.gear = 0;
    }

    Bicycle(int s, int g) {
        this.speed = s;
        this.gear = g;
    }

    public void show() {
        System.out.println("Current speed : " + speed);
        System.out.println("Current gear number : " + gear);
    }

    @Override
    public void changeGear(int gear) {
        if (Vehicle.validateGear(gear, 7)) {
            this.gear = gear;
        } else {
            System.out.println("Invalid input");
        }
    }

    @Override
    public void incSpeed(int inc) {
        if (Vehicle.validateSpeed(speed + inc, 60)) {
            speed += inc;
        }

    }

    @Override
    public void applyBreak() {
        if (speed - 5 > 0) {
            speed -= 5;
        }

    }
}
