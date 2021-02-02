package cities;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class City {
    private long population;
    private Calendar founding;
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

    public City(long population, Calendar founding, String name) {
        this.population = population;
        this.founding = founding;
        this.name = name;
    }

    public City(String name) {
        this(0, new GregorianCalendar(), name);
    }

    @Override
    public String toString() {
        return name + ", poputation: " + population + ", founding: " + founding.get(Calendar.YEAR);    }
}
