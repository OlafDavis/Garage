package olaf.garage.models;

public class Car extends AbstractVehicle implements Vehicle  {
    public Size getSize() {
        return Size.NORMAL;
    }
    public String getDisplayChars() {
        return "CC ";
    }
}
