package olaf.garage.models;

public class Floor {
    private Space[] spaces;
    private String name;

    public Integer getNoOfSpaces() {
        return this.spaces.length;
    }

    public String getName() {
        return name;
    }

    public Space[] getSpaces() {
        return spaces;
    }

    public Floor(String name, Space[] spaces) {
        this.spaces = spaces;
        this.name = name;
    }
    public Floor(String name, Size size, Integer noOfSpaces) {
        this.spaces = new Space[noOfSpaces];
        for (Integer floor = 0; floor <= noOfSpaces - 1; floor++) {
            spaces[floor] = new Space(size);
        }
        this.name = name;
    }

    public void displayFloor() {
        String name = this.getName();
        Integer noOfSpaces = this.getNoOfSpaces();
        System.out.println(name + ", with " + noOfSpaces.toString() + " spaces.");
        Integer noCharactersWide = noOfSpaces * 2 + 1;
        char[][] gridDisplay = initGrid(noCharactersWide);
        gridDisplay = fillGrid(gridDisplay);
        printGrid(gridDisplay, noCharactersWide);
    }

    private char[][] fillGrid(char[][] gridDisplay) {
        Integer noSpaces = this.getNoOfSpaces();
        gridDisplay[0][0] = '\u250F';
        gridDisplay[1][0] = '\u2502';
        gridDisplay[2][0] = '\u2502';
        gridDisplay[3][0] = '\u2502';
        gridDisplay[4][0] = '\u2517';
        for (Integer spaceNo = 1; spaceNo < noSpaces; spaceNo++) {
            Integer leftColNo = spaceNo * 2;
            gridDisplay[0][leftColNo] = '\u2533';
            gridDisplay[1][leftColNo] = '\u2502';
            gridDisplay[2][leftColNo] = '\u2502';
            gridDisplay[3][leftColNo] = '\u2502';
            gridDisplay[4][leftColNo] = '\u253B';
        }

        for (Integer spaceNo = 0; spaceNo < noSpaces; spaceNo++) {
            Integer rightColNo = spaceNo * 2 + 1;
            gridDisplay[0][rightColNo] = ' ';
            gridDisplay[2][rightColNo] = this.getSpaces()[spaceNo].getDisplayCharacters().charAt(0);
            gridDisplay[2][rightColNo] = this.getSpaces()[spaceNo].getDisplayCharacters().charAt(1);
            gridDisplay[2][rightColNo] = this.getSpaces()[spaceNo].getDisplayCharacters().charAt(2);
            gridDisplay[4][rightColNo] = ' ';
        }
        gridDisplay[0][noSpaces * 2] = '\u2513';
        gridDisplay[1][noSpaces * 2] = '\u2502';
        gridDisplay[2][noSpaces * 2] = '\u2502';
        gridDisplay[3][noSpaces * 2] = '\u2502';
        gridDisplay[4][noSpaces * 2] = '\u251B';
        return gridDisplay;
    }

    private char[][] initGrid(Integer noCharactersWide) {
        char[][] gridDisplay = new char[5][noCharactersWide];
        for (Integer row = 0; row <= 4; row++) {
            for (Integer col = 0; col <= noCharactersWide - 1; col++) {
                gridDisplay[row][col] = 'X';
            }
        }
        return gridDisplay;
    }

    private void printGrid(char[][] gridDisplay, Integer noCharactersWide) {
        for (Integer row = 0; row <= 4; row++) {
            String rowString = "";
            for (Integer col = 0; col <= noCharactersWide - 1; col++) {
                rowString += gridDisplay[row][col];
            }
            System.out.println(rowString);
        }
    }

    public boolean canFit(Vehicle vehicle) {
        boolean fits = false;
        for (Integer i = 0; i < this.getNoOfSpaces(); i++) {
            fits = fits || this.getSpaces()[i].canFit(vehicle);
        }
        return fits;
    }
}
