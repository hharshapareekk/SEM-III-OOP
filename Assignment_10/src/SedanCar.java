public class SedanCar implements Car{
    @Override
    public void allocatingAccessories() {
        System.out.println("Accesories allocated to Sedan Car");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling Parts For Sedan Car..");
        System.out.println("Parts Assembled. ");
    }

    @Override
    public void paint() {
        System.out.println("Applying Paint To Your Sedan Car...");
        System.out.println("Paints Applied.");
    }

    @Override
    public void installEngine() {
        System.out.println("Engine installed.");
    }

    @Override
    public void testEngine() {
        System.out.println("Testing your engine for safety reasons.");
        System.out.println("Your engine is safe :)");
    }

    @Override
    public void finalTouch() {
        System.out.println("Final touch-ups for your car in process...");
        System.out.println("Your Car Is Ready");
    }
}
