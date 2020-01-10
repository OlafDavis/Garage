package olaf.garage.models;

public class Floor {
    private Space[] spaces;

    public Integer getNoOfSpaces() {
        return this.spaces.length;
    }

    public Space[] getSpaces() {
        return spaces;
    }

    public Floor(Space[] spaces) {
        this.spaces = spaces;
    }
}
