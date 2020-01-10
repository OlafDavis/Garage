package olaf.garage;

import olaf.garage.models.Garage;
import olaf.garage.models.Floor;
import olaf.garage.models.Space;
import olaf.garage.models.Size;

public class Main {

    public static void main(String[] args) {
        Garage myGarage = buildGarage();
        myGarage.displayGarage();
    }

    private static Garage buildGarage() {
        Floor firstFloor = new Floor("First Floor", Size.NORMAL, 6);
        Floor secondFloor = new Floor("Second Floor", Size.TALL, 6);
        Space[] spaces = new Space[8];
        spaces[0] = new Space(Size.SMALL);
        spaces[1] = new Space(Size.SMALL);
        spaces[2] = new Space(Size.SMALL);
        spaces[3] = new Space(Size.SMALL);
        spaces[4] = new Space(Size.SMALL);
        spaces[5] = new Space(Size.SMALL);
        spaces[6] = new Space(Size.TALL);
        spaces[7] = new Space(Size.TALL);
        Floor thirdFloor = new Floor("Third Floor", spaces);
        Floor[] floors = new Floor[3];
        floors[0] = firstFloor;
        floors[1] = secondFloor;
        floors[2] = thirdFloor;
        return new Garage("My Garage", floors);
    }

}
