package cities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class City {
    private long population;
    private LocalDate founding;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        return name.equals(city.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public City(String name, long population, LocalDate founding) {
        this.population = population;
        this.founding = founding;
        this.name = name;
    }

    public City(String name) {
        this(name, 0, LocalDate.now());
    }

    private String getFoundation(){
        return founding.getDayOfMonth() + " " +
                founding.getMonth().toString().toLowerCase() + " " +
                founding.getYear();
    }

    @Override
    public String toString() {
        return name + ", population: " + population + ", founding: " + getFoundation();    }
}
