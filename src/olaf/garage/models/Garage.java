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

    public void displayGarage() {
        System.out.println("Garage name: " + this.getName());
        Integer noOfFloors = this.getNoOfFloors();
        System.out.println(noOfFloors.toString() + " floors");
        for ( Integer floorNo = 0; floorNo <= noOfFloors - 1; floorNo++) {
            floors[floorNo].displayFloor();
        }
    }

    public boolean canFit(Vehicle vehicle) {
        boolean fits = false;
        for (Integer i = 0; i < this.getNoOfFloors(); i++) {
            fits = fits || this.getFloors()[i].canFit(vehicle);
        }
        return fits;
    }
}
