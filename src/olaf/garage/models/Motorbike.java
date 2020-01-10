package olaf.garage.models;

public class Motorbike extends AbstractVehicle implements Vehicle  {
    public Size getSize() {
        return Size.SMALL;
    }
    public String getDisplayChars() {
        return "M  ";
    }
}
