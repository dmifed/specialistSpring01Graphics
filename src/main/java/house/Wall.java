package house;

/**
 * @author dmifed
 */
public class Wall {
    String material;

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Wall of " + material;
    }
}
