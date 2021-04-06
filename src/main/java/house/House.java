package house;

/**
 * @author dmifed
 */
public class House {
    private Wall wall;
    private static int ids = 0;
    private int id;
    private String name;

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public void init(){
        this.id = ++ids;
        //this.name = "House";
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id +"#" + name + " wall: " + wall;
    }
}
