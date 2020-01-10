package olaf.garage.models;

import olaf.garage.models.Utils;

public class Space {
    private Size size;
    private Vehicle occupant;

    public Size getSize() {
        return this.size;
    }

    public Space(Size size) {
        this.size = size;
    }

    public String getDisplayCharacters() {
        if (occupant == null) { return "   "; };
        return occupant.getDisplayChars();
    }

    public boolean isOccupied() {
        return occupant == null;
    }

    public boolean canFit(Vehicle vehicle) {
        if (isOccupied()) { return false; };
        return vehicle.getSize() == this.size || Utils.isBiggerThan(this.size, vehicle.getSize());
    }

    public void park(Vehicle vehicle) {
        this.occupant = vehicle;
    }
}
