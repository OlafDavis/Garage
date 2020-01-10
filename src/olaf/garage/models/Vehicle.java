package olaf.garage.models;

import olaf.garage.models.Size;

public interface Vehicle {
    String getRegistration();
    Size getSize();
    String getDisplayChars();
}
