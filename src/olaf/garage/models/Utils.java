package olaf.garage.models;

public class Utils {
    public static boolean isBiggerThan(Size size1, Size size2) {
        if (size1 == Size.TALL) {
            return (size2 == Size.SMALL || size2 == Size.NORMAL);
        }
        if (size1 == Size.NORMAL) {
            return (size2 == Size.SMALL);
        }
        return false;
    }
}
