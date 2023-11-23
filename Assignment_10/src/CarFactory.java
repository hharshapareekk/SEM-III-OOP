public class CarFactory {
    public Car buildCar(int choice){
        switch (choice){
            case 1:
                return new SedanCar();

            case 2:
                return new HatchbackCar();

            case 3:
                return new SUVCar();
            case 4:
                System.exit(0);

            default:
                return null;
        }
    }
}
