package olaf.garage.models;

import javax.xml.namespace.QName;

public class Garage {
    private String name;
    private Floor[] floors;

    public String getName() {
        return name;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public Integer getNoOfFloors() {
        return floors.length;
    }

    public Garage(String name, Floor[] floors) {
        this.floors = floors;
        this.name = name;
    }
}
