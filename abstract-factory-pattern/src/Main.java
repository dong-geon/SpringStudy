import abst.BikeFactory;
import abst.Body;
import abst.Wheel;
import sam.SamFactory;

public class Main {
    public static void main(String[] args) {
        BikeFactory factory = new SamFactory();

        Body body = factory.craeteBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }
}