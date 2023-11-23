import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("WELCOME TO HARSHA'S AMAZING CAR FACTORY");

        while(true){
            System.out.println("What would you like to do : \n1.Build Sedan Car\n2.Build Hatchback Car\n3.Build SUV Car\n4.Exit");
            Scanner sc =new Scanner(System.in);
            int choice = sc.nextInt();
            CarFactory carFACTORY = new CarFactory();
            Car obj = carFACTORY.buildCar(choice);
            obj.allocatingAccessories();
            obj.assemble();
            obj.paint();
            obj.installEngine();
            obj.testEngine();
            obj.finalTouch();
        }
    }

    }

