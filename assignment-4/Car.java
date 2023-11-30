public class Car implements Vehicle {
    int gear;
    int speed;

    Car() {
        speed = 0;
    }

    Car(int s, int g) {
        this.speed = s;
        this.gear = g;
    }

    public void show() {
        System.out.println("Current speed :" + speed);
        System.out.println("Current gear number :" + gear);

    }

    @Override
    public void changeGear(int gear) {
        if (Vehicle.validateGear(gear, 6)) {
            this.gear = gear;
        }

    }

    @Override
    public void incSpeed(int inc) {
        if (Vehicle.validateSpeed(speed + inc, 180)) {
            speed += inc;
        }

    }

    @Override
    public void applyBreak() {
        if ((speed - 15) > 0) {
            speed -= 15;
        } else {
            System.out.println("Not possible");
        }
    }
}
