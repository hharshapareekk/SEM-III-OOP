public class Bike implements Vehicle {
    int gear;
    int speed;

    Bike() {
        speed = 0;
        gear = 0;
    }

    Bike(int s, int g) {
        this.speed = s;
        this.gear = g;
    }

    public void show() {
        System.out.println("Current speed " + speed);
        System.out.println("Current gear number " + gear);
    }

    @Override
    public void changeGear(int gear) {
        if (Vehicle.validateGear(gear, 5)) {
            this.gear = gear;
        }

    }

    @Override
    public void incSpeed(int inc) {
        if (Vehicle.validateSpeed(this.speed + inc, 120)) {
            this.speed += inc;
        }

    }

    @Override
    public void applyBreak() {
        if ((this.speed - 10) > 0) {
            this.speed -= 10;
        } else {
            System.out.println("Not possible");
        }
    }
}
