package olaf.garage.models;

public class Van extends AbstractVehicle implements Vehicle  {
    public Size getSize() {
        return Size.TALL;
    }
    public String getDisplayChars() {
        return "VVV";
    }
}
