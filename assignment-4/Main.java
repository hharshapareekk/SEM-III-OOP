import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vehicle b = new Bicycle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        System.out.println("Enter Your Choice:\n1.Bicycle\n2.Car\n3.Bike\n");
        int c = s.nextInt();
        switch (c) {
            case 1:
                System.out.println("Enter initial speed: ");
                int speed = s.nextInt();
                System.out.println("Enter initial gear: ");
                int gear = s.nextInt();
                b = new Bicycle(speed, gear);
                while (true) {
                    System.out.println("Enter your choice:\n1.Increase speed\n2.Change gear\n3.Apply brakes\n4.Exit");
                    int bicycle_n = s.nextInt();
                    switch (bicycle_n) {
                        case 1:
                            System.out.println("Enter speed to increase :");
                            int x = s.nextInt();
                            b.incSpeed(x);
                            ((Bicycle) b).show();
                            break;
                        case 2:
                            System.out.println("Enter gear number:");
                            int p = s.nextInt();
                            b.changeGear(p);
                            ((Bicycle) b).show();
                            break;
                        case 3:
                            b.applyBreak();
                            ((Bicycle) b).show();
                            break;
                        case 4:
                            System.exit(0);
                    }

                }
            case 2:
                System.out.println("Enter your choice:\n1.Increase speed:\n2.Change gear\n3.Apply brakes\n4.Exit");
                int car_n = s.nextInt();
                switch (car_n) {
                    case 1:
                        System.out.println("Enter speed to increase:");
                        int x = s.nextInt();
                        car.incSpeed(x);
                        ((Car) car).show();
                        break;
                    case 2:
                        System.out.println("Enter gear number");
                        int p = s.nextInt();
                        car.changeGear(p);
                        ((Car) car).show();
                        break;
                    case 3:
                        car.applyBreak();
                        ((Car) car).show();
                        break;
                    case 4:
                        System.exit(0);

                }
            case 3:
                System.out.println("Enter initial speed: ");
                int speed3 = s.nextInt();
                System.out.println("Enter initial gear: ");
                int gear3 = s.nextInt();
                bike = new Bike(speed3, gear3);
                while (true) {
                    System.out.println("Enter your choice:\n1.Increase speed:\n2.Change gear\n3.Apply breaks\n4.Exit");
                    int biken = s.nextInt();
                    switch (biken) {
                        case 1:
                            System.out.println("Enter speed to increase:");
                            int x = s.nextInt();
                            bike.incSpeed(x);
                            ((Bike) bike).show();
                            break;
                        case 2:
                            System.out.println("Enter gear number:");
                            int p = s.nextInt();
                            bike.changeGear(p);
                            ((Bike) bike).show();
                            break;
                        case 3:
                            bike.applyBreak();
                            ((Bike) bike).show();
                            break;
                        case 4:
                            System.exit(0);
                    }
                }
        }
    }
}
