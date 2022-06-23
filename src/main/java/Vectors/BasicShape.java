package Vectors;

import org.bukkit.util.Vector;


public class BasicShape extends Vector {
    public BasicShape(double x, double y, double z) {
        super(x, y, z);
    }
    public BasicShape (Vector v) {
        super(v.getX(), v.getY(), v.getZ());
        clone();
        Vector first = new Vector(1, 0, 0);
        Vector second = new Vector(0, 1, 0);

        Vector cross = first.crossProduct(second);
    }

}
