package sam;

import abst.BikeFactory;
import abst.Body;
import abst.Wheel;

public class SamFactory implements BikeFactory {
    @Override
    public Body craeteBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SamWheel();
    }
}
